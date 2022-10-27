package com.doit.day02

import test.Hero

import scala.io.{BufferedSource, Source}

class MyIter extends Iterator[Hero]{

  private val source: BufferedSource = Source.fromFile("src/main/resources/hero.txt")
  private val lines: Iterator[String] = source.getLines()



  override def hasNext: Boolean = lines.hasNext

  override def next(): Hero = {
    val line: String = lines.next()
//    5_baozouluoli,120:60
    val arr: Array[String] = line.split("_")
    val id: Int = arr(0).toInt
    //baozouluoli,120:60
    val arr1: Array[String] = arr(1).split(",")
    val name: String = arr1(0)
    val arr2: Array[String] = arr1(1).split(":")
    val power: Int = arr2(0).toInt
    val faceValue: Int = arr2(1).toInt
    new Hero(id,name,power,faceValue)
  }
}


object Tes{
  def main(args: Array[String]): Unit = {
    val iter: MyIter = new MyIter
    while (iter.hasNext){
      println(iter.next())
    }
  }
}
