package com.doit.day02

object _05_面向对象之class类 {
  def main(args: Array[String]): Unit = {
    val dog: Dog1 = new Dog1()
    println(dog.color)
    println(dog.id)
    println(dog.name)
    println(dog.age)

    val dog1: Dog1 = new Dog1("黄色")
    println(dog1)

    val dog2: Dog1 = new Dog1("来福", 3)
    println(dog2.name)
    println(dog2.id)
    println(dog2.color)




  }
}

//() 这里面跟的是啥？ 这就是一个构造函数吧
//我有想要空参构造，有想要带参构造
//主构造器
class Dog1(var color:String){
  val id:Int = 1
  var name:String = "bob"
  var age :Int = 18

  //scala里面哈，给我们提供了一个叫辅助构造器的东西
  //辅助构造器   ==》他的第一行必须调用主构造器或者其他的辅助构造器
  def this(){
    //调用的主构造器
    this("黑色")
    println("hello,我是辅助构造器，我调用了主构造器")
  }

  def this(name:String,age:Int){
    //调用的辅助构造器
    this()
    this.name = name
    this.age = age
    println("我是一个辅助构造器，我调用的是其他的辅助构造器")

  }

  def sayWang(): Unit ={
    println("汪~~~~~")
  }

}




