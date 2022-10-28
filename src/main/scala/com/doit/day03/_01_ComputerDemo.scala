package com.doit.day03


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
object _01_ComputerDemo {
  def main(args: Array[String]): Unit = {

  }

}


object Computer{
  //成员变量
  var id :Int = 2
  var brand:String = "联想"
  var color:String = "黑色"
  var price :Double = 9999.99

  def newPrice(discount:Double):Double= price*discount

  val introduce = ()=>{println(s"我的品牌是:$brand,我的颜色是:$color,我的价格是:${newPrice(0.8)}")}

}
