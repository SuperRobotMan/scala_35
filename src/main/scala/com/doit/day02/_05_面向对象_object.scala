package com.doit.day02

/**
 * 练一练：
 * 用object 定义一个类  computer    里面由成员变量   id    brand   color    price
 *
 * 还有成员方法    我传一个折扣给你，  逻辑体：price * discount = ？  结果返回
 *
 * 再来定义一个函数   这个函数查都不用给他传 在里面打印一句话   我的品牌是什么  我的颜色是什么  我的加个是什么
 *
 * 首先用object 去定义
 * 定义完成后用java 把computer 和  computer$    这个类写出来
 */


object _05_面向对象_object {
  def main(args: Array[String]): Unit = {

    //object 这个类，既然都没有构造方法，他能new嘛

    //这个就是一个set方法
    Cat.name = "tom"
    Cat.age = 2
    println(Cat.id)
    println(Cat.name)
    //他是一个啥？？？
    val mul = Cat.mul  //就是一个对象
    val i: Int = mul.apply(1, 2)
    val i1: Int = mul(2, 1)
    println(i)
    println(i1)

    Cat.introduce()

  }
}


/**
 * 这个类有一些特殊的东西，没有构造函数
 */
object Cat{

  //成员变量
  val id:Int = 1
  var name:String = _
  var age :Int = _
  //是一个成员变量不？？？？   是的
  val mul:Function2[Int,Int,Int] = (a:Int,b:Int)=>{a-b}

  //成员方法
  def introduce()={
    println(s"my name is $name,我的年龄是:$age")
  }
}
