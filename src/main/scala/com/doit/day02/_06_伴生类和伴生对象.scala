package com.doit.day02



//1.如果class的类和object的类两个类名一样，那么就称class这个类是object这个类的伴生类，object是class的伴生对象
//2.伴生类和伴生对象有什么用呢？
//（1） 将静态的属性和非静态的属性分离开来了
//（2） 伴生对象中可以写apply方法，这个方法重写了以后，再去创建class类的时候，不用new，直接调用就可以
//（3） 伴生对象中可以写unapply方法，可以将这个类分解，用于模式匹配的解构
//（4） 在伴生类和伴生对象中，可以相互访问对方的私有属性


object _06_伴生类和伴生对象 {
  def main(args: Array[String]): Unit = {
    val address: String = Cup.address
    val d: Double = Cup.discountPrice(0.9)
    println(address)
    println(d)

    val cup: Cup = new Cup(1, "高脚杯", 19.99)
    cup.introduce()
    println(cup.id)
    println(cup.price)
    println(cup.brand)

    val i: Int = cup()
    println(i)


  }
}






class Cup(var id:Int,var brand:String,var price:Double){
  def introduce(): Unit ={
    println("我是一个杯子，我写在class类里面")
  }

  def apply():Int={
    10
  }

  private var a:Int = 1
}



object Cup{
  var address:String = "上海闵行"

  def discountPrice(discount:Double)={
    val cup: Cup = new Cup(1, "马克杯", 19.9)
    cup.a
    //直接返回打折后的价格
    cup.price*discount
  }

}
