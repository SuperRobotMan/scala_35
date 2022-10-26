package com.doit.dat01

/**
 * object:这里面都是放得静态的东西，main是一个静态的方法，所以说想要执行程序，就需要建一个object的类
 * def：scala里面方法声明的标记
 * main：方法名称
 * args: Array[String]   ==》 String [] args    是一个字符串类型的数组   变量名  :  变量类型
 * : Unit  ==> 类似于java中的void   ==》就是代表没有返回值的意思
 * {}：这里面写方法体
 */


object HelloWorld {
  def main(args: Array[String]): Unit = {
    //scala中的注释    和java一模一样

    //单行注释

    /*
      我是一个多行注释
      可以可以写很多行
      再来一行
     */


    /**
     * 我是一个文本注释
     * 想怎么写怎么写
     * 反正也不参加编译
     */



  }
  //写一个给我两个整数，求和返回结果的方法
  def add(a:Int,b:Int):Int={
    //最后一行代码，就代表的是返回值
      a+b
  }



}



