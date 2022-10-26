package com.doit.dat01

import java.sql.{Connection, DriverManager, PreparedStatement, ResultSet}

/**
 * 1. 方法的定义标记： def
 * 2. 方法的参数
 * 3. 方法的返回值
 * 4. 方法的调用
 *
 */

object _07_方法 {
  def main(args: Array[String]): Unit = {
    //如果说你这个方法写在object 类里面，那么 这个方法是一个静态的方法
//    val max: Int = getMax(1, 2, 3)
//    println(max)

//    val connection: Connection = getMysql("jdbc:mysql://localhost:3306/test01", "root", "123456")
//    val pps: PreparedStatement = connection.prepareStatement("select * from user_info")
//    val set: ResultSet = pps.executeQuery()
//    while (set.next()){
//      val id: Int = set.getInt(1)
//      val name: String = set.getString(2)
//      val age: Int = set.getInt(3)
//      val gender: String = set.getString(4)
//      println(s"id:$id ,name:$name ,age:$age ,gender:$gender")
//    }


  }

  //定义一个方法,求三个int类型的数中的最大值
  def getMax(a:Int,b:Int,c:Int):Int={
    var max = a
    if(max < b) max = b
    if(max < c) max = c
    max
  }


  //定义一个方法，写一个二分查找


  // 给你一个数组 (有序)   在方法里面记得先排序


  // 在给一个想要找的值 然后返回该值所在的位置的索引 如果不存在，返回-1


  //写一个方法，给你一个乱序的数组，用快排来写 (冒泡)











  //写一个方法，返回mysql的连接,传一个url ，传一个 username 传一个password   返回mysql的连接
  def getMysql(url:String,userName:String,passWord:String):Connection = {
    DriverManager.getConnection(url, userName, passWord)
  }






}
