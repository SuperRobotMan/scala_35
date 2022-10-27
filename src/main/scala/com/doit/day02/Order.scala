package com.doit.day02

import scala.util.Sorting

class Order(var id:Int,var price:Double,var order_time:String) extends Ordered[Order]{
  override def compare(that: Order): Int = -this.id.compare(that.id)

  override def toString = s"Order($id, $price, $order_time)"
}

class Order1(var id:Int,var price:Double,var order_time:String){

  override def toString = s"Order($id, $price, $order_time)"
}

object Test02{
  def main(args: Array[String]): Unit = {

    val order1 = new Order1(1,10.99,"2022-01-01")
    val order2 = new Order1(2,13.99,"2022-02-01")
    val order3 = new Order1(3,12.99,"2022-04-01")
    val order4 = new Order1(4,14.99,"2022-05-01")
    val order5 = new Order1(5,16.99,"2022-03-01")
    val order6 = new Order1(6,15.99,"2022-07-01")

    val orders: Array[Order1] = Array(order1, order2, order3, order4, order5, order6)

    Sorting.quickSort(orders)(new Ordering[Order1] {
      override def compare(x: Order1, y: Order1) = x.price.compare(y.price)
    })

    orders.foreach(println)

  }
}