package com.doit.dat01


object _03_类型转换 {
  def main(args: Array[String]): Unit = {

    val a :Int= 10
    val b :Double = 10.5
    val res: Int = (a+b).toInt
    val int2Double: Double = a.toDouble
    val res1: String = int2Double.toString

    /**
     * 特殊的：
     * char 和  short
     * char 和  byte
     * 他们之间不能进行相互的转换
     * 但是他们三个之间可以相互计算
     */

    val char:Char = 1

    val byte:Byte = 1

    val short:Short = 1

    val res3: Int = char +byte+short

    println(res3)//3

    val res4: Int = char.toInt + byte.toInt + short.toInt

    println(res4)



//    val char:Short = short
//    println(char)



  }

}
