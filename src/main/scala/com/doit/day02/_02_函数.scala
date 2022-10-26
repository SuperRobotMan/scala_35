package com.doit.day02

/**
 * 和方法一样，他们的作用都是一段代码逻辑的封装，方便后续调用，复用
 */
object _02_函数 {
  def main(args: Array[String]): Unit = {

    /*
            MyFunc2<Integer, Integer, Integer> add =

            (Integer u1, Integer v1) =>
            {
                return u1 + v1;
            }
        };
        Integer res = myFunc2.apply(1, 2);
     */

    val add1= add

    val res: Int = add(1, 2, 3)

    //用java 来写一个函数   需求：传进去一个Int类型的字符串，在传进去一个Int 类型的值，返回 他们俩的和(转换成字符串)  "1" 2  1+2 "3"
    //传进去的参数   String Int   String


    //把这个类型给补充出来
    val fun2 = (str:String,a:Int)=>{
      (str.toInt+a).toString
    }





    val res1: Int = add.apply(1,2,3)

  }

  //函数如何去定义
  //() 里面传的是函数的参数    {}：里面写的是函数的逻辑
  //没有名字的函数，叫匿名函数
  //add 函数名 是不是一个对象  他的类型是啥？Function3[Int,Int,Int,Int]
  //函数的本质是啥？我创建了一个接口的实现类对象，我的函数体里面就是重写的apply方法
  val add :Function3[Int,Int,Int,Int]= (a:Int,b:Int,c:Int)=> {
    a+b+c
  }

  //写一个函数，传入三个值，返回他的最大值
  val max = (a:Int,b:Int,c:Int)=>{
    var max = a
    if (max<b) max = b
    if(max < c) max = c
    max
  }

  def threeAdd(a:Int,b:Int,c:Int)={
    a+b+c
  }


}
