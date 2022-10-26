package com.doit.dat01

import java.io.FileNotFoundException
import scala.util.control.{Breaks, Exception}

object _06_循环中断 {
  def main(args: Array[String]): Unit = {
    //scala中没有break  也没有 continue

    //需求：打印到5就不打印了，后面的所有的数都不打印了
/*    var flag = true
    //利用循环守卫来做到，终止循环    虽然能实现我们要的功能，但是有个问题  6 7 8 9 10 依然会去判断
    for(elem <- 1 to 10 ;if flag ){
      println(elem)
      if (elem == 5){
        //中断循环
        flag = false
      }
    }*/


    //抛异常
    try {
      for(elem <- 1 to 10  ){
        println(elem)
        if (elem == 5){
          //中断循环
          throw new FileNotFoundException()
        }
      }
    }catch {
      case e:NullPointerException => println("空指针异常")
      case e:FileNotFoundException => println("文件找不到异常")
      case e:Exception => println(e)
    }


    //scala里面给我们提供了一个循环中断的方式   break
    Breaks.breakable(
      for(elem <- 1 to 10  ){
        println(elem)
        if (elem == 5){
          //中断循环
          Breaks.break()
        }
      }
    )



    println("hello")



  }
}
