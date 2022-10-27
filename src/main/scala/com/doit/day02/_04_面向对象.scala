package com.doit.day02

object _04_面向对象 {
  def main(args: Array[String]): Unit = {
    val dog: Dog = new Dog(1, "bob", 2, "red")
    //类似于get和set方法    是因为他底层自己给我们写了  只不过自己给我们写的get和set方法    getName =》name    setName => name=
    dog.name = "二狗子"
    println(dog.age)
    //get 和set方法了解？？？
    dog.name = "laifu"

    dog.sayWong()

    dog.myMaster("tom") //它是个啥？是一个对象   我的主人是:tom

  }
}



/*
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
 */

//整体就是一个构造器.scala里面的构造器和类是交织在一起的
//如果定义类的时候，在后面的括号里面，不加任何的val var 的时候，他就是一个局部变量
//如果你加了val 或者var 那他就是一个成员变量
//带参构造里面是否需要传这个参数的问题
class Dog(val id:Int,var name:String,var age:Int,var color:String){

  //这玩意儿也是一个成员变量
  var dogType:String = "金毛"

  //这玩意儿是一个成员变量不？？  是：函数本身是一个类，或者说是一个对象
  val myMaster = (master:String)=>{println(s"我的主人是:$master")}



  def sayWong()={
    println(s"$name 开始咬人了，叫了两声！！！！")
  }


}

