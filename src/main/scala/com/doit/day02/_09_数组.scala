package com.doit.day02

import scala.collection.mutable.ArrayBuffer
import scala.collection.parallel.mutable.ParArray

/**
 * 数组：分为可变的和不可变的
 * 不可变数组：他的长度一旦确定就不可发生改变
 */
object _09_数组 {
  def main(args: Array[String]): Unit = {

    //不可变数组的创建，直接用object中的apply方法来创建的
//    val ints: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7)

/*    //获取数组的长度
    println(ints.length)

    //获取的是数组的第一个元素
    val i: Int = ints.apply(0)
    val i1: Int = ints(0)

    //更新数组中的元素，第一个参数是索引位置，第二个参数是更新的值
    ints.update(0,100)

    //能够克隆一个和ints一样的数组
    val ints1: Array[Int] = ints.clone()*/

    //可变数组
    val ints2: ArrayBuffer[Int] = new ArrayBuffer[Int]()

    ints2.append(1,2,3,4,5,6,7)
    val reverse: ArrayBuffer[Int] = ints2.reverse

/*    println(ints2)

    ints2.update(0,100)

    println(ints2)*/
/*

//  ints2.remove(1,2)
//    println(ints2)

/*    val iterator: Iterator[ArrayBuffer[Int]] = ints2.sliding(2,2)
    for (elem <- iterator) {
      println(elem)
    }*/
//    println(ints2)
//    ints2.+=(10)
//    println(ints2)

//    ints2.+=(8,9,10)



//    val reverse: ArrayBuffer[Int] = ints2.reverse
//    println(ints2)
//    println(reverse)


//    ints2.+=:(10)
//    println(ints2)


//    ints2.++=:(reverse)
//    ints2.++=(reverse)
//    println(ints2)
*/



















  }

}
