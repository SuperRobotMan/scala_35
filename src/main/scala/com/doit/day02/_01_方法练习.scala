package com.doit.day02

import scala.collection.mutable.ArrayBuffer
import scala.util.Random
import scala.util.control.Breaks

/**
 * 1.方法要注意：
 * 方法的调用：如果这个方法写在object里面，那么调用的时候，在main方法中，直接方法名就可以调用方法
 * 如果这个方法写在class这个类里面，那就需要创建对象，然后用对象去调用方法
 *
 * 2.方法的参数，如果说这个方法没有参数,那么这个()可以省略不写，如果说定义方法的时候，没写()  那么调用的时候，就不能写
 *
 * 3.在scala里面，默认代码块的最后一行是返回值，可以不写return，也可以写return 如果你写了return 你的返回值类型就必须得写
 */

object _01_方法练习 {
  def main(args: Array[String]): Unit = {
    //查找子串的个数
    /*   //给你一个字符串，再给你一个子串  求这个字符串中有多少个这样的子串
       val str = "asdfohjkhasdflkhjlkasdf;ljlkojlkasdflkjlkasdfo;joikjnljnasdf;loj"
       val res = "asdf"
       //找这里面有几个asdf
       /**
        * 思路一：字符串的截取，从第一个去截取到目标字符串的长度，然后依次往后遍历判断，最后得到总的个数
        */
       val newStr: String = str.replaceAll(res, "000")
       val count = str.length - newStr.length
       println(count)*/

    //二分查找
    /*    val ints: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        println(binarySearch(ints, 7))*/

    val ints: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    //现在要随机让他生成10个整数
    for(elem <- 1 to 150){
      ints.append(new Random().nextInt(100))
    }

    val array: Array[Int] = ints.toArray

    println("=======排序前=========")
    println(array.mkString(","))

    quickSort(array,0,ints.length-1)

    println("=======排序后=========")
    println(array.mkString(","))

  }


  //定义一个方法，写一个二分查找
  // 给你一个数组 (有序)   在方法里面记得先排序

  def binarySearch(arr: Array[Int], num: Int): Int = {
    //数组必须得是一个有序的数据才能查到，给数组排序
    val sorted: Array[Int] = arr.sorted

    var res = -1

    //开始干活了
    var start = 0
    var end = arr.length - 1
    if (arr.length == 0) {
      res
    } else {
      Breaks.breakable(
        while (start <= end) {
          //先获取到中间的值
          val mid = (start + end) / 2
          //如果中间的值要大于num 那我后面就查这个值的左边
          if (sorted(mid) > num) {
            end = mid
          }
          //如果中间的值要小于num 那我后面就查这个值的右边
          else if (sorted(mid) < num) {
            start = mid
          } else {
            res = mid
            //中断循环
            Breaks.break()
          }
        }
      )
    }
    res
  }

  //写一个方法，给你一个乱序的数组，用快排来写
  def quickSort(arr:Array[Int],low:Int,high:Int):Unit={
    if(low < high){
      val index: Int = partition(arr, low, high)
      //再去排左边
      quickSort(arr,low,index-1)
      //排右边
      quickSort(arr,index+1,high)
    }
  }

  //确定基数的索引位置
  def partition(arr:Array[Int],low:Int,high:Int): Int ={
    //确定一个基准数
    val temp = arr(low)
    var end = high
    var start = low

    //此时，如果low指针小于end指针，就需要一直比较
    while (start < end){
      while (start < end && temp <= arr(end)){
        end -= 1
      }

      //不满足要求了，需要交换位置
      if (start < end){
        //到这边了，就需要换位置了
        arr(start) = arr(end)
        arr(end) = temp
      }

      //开始比较low的指针
      while (start < end && temp >= arr(start)){
        start += 1
      }

      if (start < end){
        //到这边了，就需要换位置了
        arr(end) = arr(start)
        arr(start) = temp
      }
    }
//    arr(start) = temp
    start
  }


}
