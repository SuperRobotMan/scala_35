package com.doit.day02

object _08_继承 {
  def main(args: Array[String]): Unit = {

    val zss: Father = new Father(1, "zss", 19)
    val lss: Father = new Son1(2, "lss", 81)
    lss.introduce()
    lss.introduce()

    val dog: Animal = new Animal(1, "来福") {
      override var category: String = "大藏獒"

      override def jump(): Unit = println("我跳起来可厉害了，能够干好几头狼")

      override def eat() = {
        "肉"
      }
    }
    dog.jump()
  }
}

abstract class Animal(val id:Int,var name:String){
  //抽象的属性
  var category:String

  def jump():Unit

  def eat():String


}

class Father(var id:Int,var name:String ,var age:Int){

  def introduce()={
    println("我是爸爸")
  }
}

class Son extends Father(1,"zss",18){

  var money:Double = 100.99

  override def introduce(): Unit = {
    println("我是儿子")
  }


}

class Son1(id:Int,name:String,age:Int) extends Father(id, name, age){
  def playGame()={
    println("我会玩lol游戏")
  }

}











