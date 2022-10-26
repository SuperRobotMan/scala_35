package com.doit.dat01
import scala.collection.immutable
import scala.collection.mutable.ArrayBuffer

object _05_for循环 {
  def main(args: Array[String]): Unit = {
/*
    //得到的就是一个1 - 10 的序列 =》数组，集合。。。。
//    val inclusive: Range.Inclusive = 1.to(10)
    //int [] arr = {1,2,3,4,5,6};
      val arr: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //把inclusive 里面一个个的元素都拿出来给到elem 这个元素赋值
    /*
            for (int i : arr) {
        }
     */
//    for (elem:Int <- arr) {
//      println(elem)
//    }


    //    for (int i = 2; i < 10; i += 2)    Range.Inclusive 是一个类型 代表一个序列
        val inclusive  = 2.until(10)  //1 - 10 而且是前闭后闭 连续的序列
    //    1.until(10)   1 - 10 包含1 但是不包含10

        for (elem:Int <- inclusive) {
          println(elem)
        }

    //scala里面有一个神奇的写法    1.to(10)  ==>  1 to 10          1 until 10
    for (elem <- 1 to 10) {
      println(elem)
    }


    for (i <- 1 to 10 ){
      println("hello:"+i)
    }*/

//    //by 循环步长
//    for(i <- 1 until 10 by 2){//1 3 5 7 9
//      //在for循环中，每次操作都是操作的这个i
//      println(i)
//    }

    //倒序 1
 /*       for(i <- 10 to 1 by -2){ //10 9 8 7 6 5 4 3 2 1
          //在for循环中，每次操作都是操作的这个i
          println(i)
        }

    val arr: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


    //倒序 2  reverse
    for(i <- arr reverse){ //10 9 8 7 6 5 4 3 2 1
      //在for循环中，每次操作都是操作的这个i
      println(i)
    }*/

    //我想打印1 - 10 但是我不要5
//    for(elem <- 1 to 10 ){
//      if (elem != 5 ){
//        println(elem)
//      }
//    }

    //我想打印1 - 10 但是我不要5   if elem != 5   循环守卫
//    for(elem <- 1 to 10;if elem %2 == 1  ){
//        println(elem)
//    }


    //需求：打印1-100里面所有的数，但是不包含所有带2的
  /*  for(elem <- 1 to 100 ){
      val num: String = elem.toString
      if(!num.contains("2")){
        println(elem)
      }
    }*/


   /* //打印所有的水仙花数  首先他是一个三位数   个位的三次方 + 10位的3次方 +百位的三次方 = 它本身
    for(elem <- 100 to 999){
      val ge: Int =  elem % 10
      val shi: Int = elem / 10 % 10
      val bai: Int = elem / 100 % 10

      val res: Int = (Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3)).toInt
      if(res ==  elem){
        println("水仙花数："+elem)
      }
    }


    //引入变量
    var j = 0
    for(i <- 1 to 3) {
      j = 4 - i
      println("i=" + i + " j=" + j)
    }


    for(i <- 1 to 3 ; j = 4 - i) {
      println("i=" + i + " j=" + j)
    }



    for(elem <- 1 to 10 by 2 reverse ; if elem != 3 ){
      println(elem)
    }*/

    //循环的嵌套   打印99乘法表
    for(i <- 1 to 9 ){
      for(j <- 1 to i ){
        print(s"${j} * $i = ${i*j} \t")
      }
      println()
    }


    println("===============华丽的分割线=======================")


    for (i <- 1 to 9; j <- 1 to i){
      print(s"${j} * $i = ${i * j} \t")
      if (i == j) {
        println()
      }
    }


    //yield  用于for循环收集所有的返回值 收集到一个IndexedSeq里面去
/*    val ints: immutable.IndexedSeq[Int] = for (elem <- 1 to 10) yield {
      elem
    }


    //我们自己定义一个集合，然后每次遍历的时候，就将这个值收集到集合中
    val buffer: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    for (elem <- 1 to 10){
      buffer.append(elem)
    }
    println(buffer)*/


    //就是一个死循环
//    while(true){
//
//    }


    var num = 10

    while (num>0){
      println("hello:"+num)
      num -= 1
    }


    do{
      println("hello:"+num)
      num -= 1
    }while(num>10)















  }

}
