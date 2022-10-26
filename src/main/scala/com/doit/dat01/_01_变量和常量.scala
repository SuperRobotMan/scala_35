package com.doit.dat01

import scala.runtime.BoxedUnit

/**
 * int a = 10;  我可以随便改
 *
 * final int a = 10;  为什么称他为常量？一旦确定，就不能更改了
 *
 */
object _01_变量和常量 {
  def main(args: Array[String]): Unit = {

    //用var 修饰的量叫变量  variable    是可以再赋值变化的
    var a:Int = 10
    a = 30
    a = 40

    val abv :Unit = ()
    println(abv)






    /*
    val abc :Null = null
    println(abc)


    //val修饰的量叫常量  value  这个值一旦确定就不能更改
    val b:Int = 20
//    b = 10

    //在scala里面，不管是定义变量还是常量 都需要赋初始值
//    var c:Int


    //scala里面定义变量或者常量的时候，类型可以不写，他会根据你自己赋的值来自动推断出来你这个变量是什么类型
    var d = 30
    println(d.getClass)//int

    var d1 = 30.0
    println(d1.getClass)//double

    var d2 = "hello"
    println(d2.getClass)//class   java.lang.String


    /**
     * 正常情况下：我们能使用val的时候，就不要使用var 因为val的线程是安全的，并且他的效率更高
     */


    /*
    店铺名称：多易教育
    课程名称：java基础,mysql,hadoop.....
    讲课老师：源哥,涛哥,星哥,行哥
    课程的价格：199,299,399,99
    红包类型: 首次购买红包,老学员红包   ==》红包    bonus  奖金
    红包金额：9.9  18.8
    活动名称：老用户再次购买,新用户首次购买,学员推荐购买
    活动类型：6.18     10.24  11.11
    活动折扣力度：9折   5折   8.8折
    购买用户用户名：zhangsan，lisi
    用户手机号：18860875775，1886087，5776   String
    用户现在的职位：etl工程师，大数据开发工程师，数仓工程师
    用户的邮箱：email
    订单号：111122223333    String    order_sn   order_id
    订单金额：398
     */

    //店铺名称：多易教育
    val shopName :String = "多易教育"
    //课程名称
    val courseName :String = "java 基础"
*/






  }

}
