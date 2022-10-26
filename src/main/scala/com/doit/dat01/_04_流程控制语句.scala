package com.doit.dat01

import java.util.Scanner
import scala.util.Random

/**
 * 1.生成一个目标数字    random
 * 2.我输入一个数字开始猜，如果猜的数字比原来的数字大，就打印猜大了   手动输入一个数字
 * 如果猜的数字比原来的数字小，就打印猜小了
 * 如果猜的数字和原来的数字相等，就打印，猜对了
 * 猜数字小游戏，只有5次机会
 */

object _04_流程控制语句 {
  def main(args: Array[String]): Unit = {
    //生成一个目标数字
    val random: Random = new Random()
    val targetNum: Int = random.nextInt(100)
    println("目标数字是："+targetNum)

    //开始猜数字
    println(
      """
        |在一个月黑风高的夜晚，35期学生发明了一种猜数字的小游戏
        |听说赢了也没啥奖励，输了要被罚敲代码！！！！
        |""".stripMargin)
    println("start!!!!")
    Thread.sleep(1000)
    println("3")
    Thread.sleep(1000)
    println("2")
    Thread.sleep(1000)
    println("1")

    val sc: Scanner = new Scanner(System.in)
    var count = 5

    while(count <= 5 && count > 0){
      println("请输入你想要猜的数字：")
      val guessNum: Int = sc.nextInt()
      if (guessNum>targetNum){
        count -= 1
        println("你猜大了！请再猜一次,你还有"+count+"次机会：")
      }else if(guessNum<targetNum){
        count -= 1
        println("你猜小了！请再猜一次，你还有"+count+"次机会：")
      }else{
        println("bingo!!!但是没有奖励，回家洗洗睡吧")
        count = 0
      }
    }








  }

}
