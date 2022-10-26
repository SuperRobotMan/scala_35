package com.doit.dat01

object _02_字符串的输出 {
  def main(args: Array[String]): Unit = {
    val name = "zss"
    val age = 18
    val height = 188.88

    //这个同学的名字叫：zss,他的年龄是：18岁，他的身高是：188.88cm
    println("这个同学的名字叫："+name+",他的年龄是："+age+"岁，他的身高是："+height)//这个同学的名字叫：zss,他的年龄是：18岁，他的身高是：188.88


    //printf   s""  模板字符串
    printf(s"这个同学的名字叫:${name} ,他的年龄是：${age+10} 岁,他的身高是：$height \r\n")//这个同学的名字叫:zss ,他的年龄是：28 岁,他的身高是：188.88

    /**
     *   %d 十进制数字
         %s 字符串
         %c 字符
         %e 指数浮点数
         %f 浮点数   =>小数   并且  在f前面加上 .2 代表保留小数点后面两位小数  .3保留三位小数  %f 默认保留小数点后6位
         %i 整数（十进制）
         %o 八进制
         %u 无符号十进制
         %x 十六进制
     */

    //占位符   用%来占位  在最后在依次对他赋值
    printf("这个同学的名字叫:%s ,他的年龄是：%d 岁,他的身高是：%.3f \r\n",name,age,height)//这个同学的名字叫:zss ,他的年龄是：18 岁,他的身高是：188.880000


    //多行输出
    /*
        select
        name,
        sum(age) as sum_age
        from table
        where name= 'zss' and age = 18
        group by name
     */

    val report_date = "2022-01-01"

    println(
      s"""
        |select
        |name,
        |avg(age) as avg_age
        |form table
        |where name = $name and age = ${age +10}  and report_date = ${report_date}
        |group by name
        |""".stripMargin)











  }

}
