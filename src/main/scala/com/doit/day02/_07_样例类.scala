package com.doit.day02

import org.omg.CORBA.portable.OutputStream

import java.io.{FileOutputStream, ObjectOutputStream}

object _07_样例类 {
  def main(args: Array[String]): Unit = {
    val zss: Person = new Person(1, "zss", 18)

    //创建Person对象，可以不用new ==》他给我们实现了apply方法
    val lss: Person = Person(1, "lss", 18)

    //这里面并没有实现apply方法
    val zss1: Person1 = new Person1(1, "zss", 18)

    //case class 的类 是被序列化过的，但是class 没有自己实现序列化接口的话，就不能被序列化
    val stream: ObjectOutputStream = new ObjectOutputStream(new FileOutputStream("d:/obj.txt"))
//    stream.writeObject(lss)


    //case class 帮我们重写了toString 方法 ，但是class 没有重写toString 方法
    println(lss)  //Person(1,lss,18)
    println(zss1) //com.doit.day02.Person1@129a8472







  }

}

case class Person(var id:Int,var name:String,var age:Int)

class Person1(var id:Int,var name:String,var age:Int)