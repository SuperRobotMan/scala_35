package com.doit.day02

import test.Person

object _03_方法和函数 {
  def main(args: Array[String]): Unit = {
    val mul = (a: Int, b: Int) => {
      a - b
    }
    //方法转换成函数   在方法名称后面加一个空格然后下划线
    /*    val function: (Int, Int) => Int = add _
        val res: Int = function.apply(1, 2)
        println(res)*/

    //    val zss: Person = new Person(1, "zss", 18)

    /*
       1.函数的底层原理是什么？ 接口 (传入的参数)     和   实现类   接口重写的apply方法的一个具体实现
       2.函数的标记   =>
       3.函数为什么在高阶应用中它可以 作为参数或者作为返回值来用？？？？   ==》因为本质上他就是一个类型    传入的时候就相当于是传入的一个对象
       返回的时候也是返回的一个对象
     */

    
  /*  mul  //代表的是一个对象
    mul.apply(1,2) //对象调用方法
    (p:Person)=>{
    }*/

    def sayHello(p: Function2[Int, Int, Int]): Unit = {
      val i: Int = p.apply(1, 2)
      println(i)
    }



    sayHello(mul)

    //    //(Int,Int)=>Int


    //
    //    mul.apply(1,2)


    //函数本质上是对象嘛？  是的原因是什么？


  }

  def add(a: Int, b: Int): Int = {
    a + b
  }

}
