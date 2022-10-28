package com.doit.day03

object _02_面向对象之class {
  def main(args: Array[String]): Unit = {
    val tiger: Tiger = new Tiger()
    println(tiger.id)

    val tiger1: Tiger = new Tiger(2)
    println(tiger1.id)

    val 纸老虎: Tiger = new Tiger(3, "纸老虎")
    println(纸老虎.name)


    new Tiger(name = "母老虎",id = 10)

  }
}


//正常情况下，我们一个javaBean 是不是有空参，有带参啊
//辅助构造器的方法名叫this
//辅助构造器的第一行必须调用主构造器或者其他的辅助构造器

class Tiger(){
  var id:Int = 1
  var name:String = _

  //辅助构造器
  def this(id:Int){
    this()
    this.id = id
  }

  //辅助构造器
  def this(id:Int,name:String){
    this(10)
    this.id = id
    this.name = name
  }

}
