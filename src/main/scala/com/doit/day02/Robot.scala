package com.doit.day02

class Robot (var id:Int,var name:String,var price:Double,color:String){
  def introduce(): Unit ={
    println(s"我的颜色是：$color")

  }
}



object Test2{
  def main(args: Array[String]): Unit = {
    val robot: Robot = new Robot(1, "智能1号", 9.9,"黑色")
  }
}

