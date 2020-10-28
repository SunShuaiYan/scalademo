package com.atguigu.functiontest
import java.util.Date
object Test1 {
  def main(args: Array[String]): Unit = {
    //定义函数
    def f(arg:String):Unit = {
      println(arg)
    }

    //函数调用
    f("hello world!")

    new Date()

    //函数1：无参，无返回值
    def test1():Unit = {
      println("无参，无返回值！")
    }
    test1()

    //函数2：无参，有返回值
    def test2():String={
      return "无参，有返回值"
    }
    println(test2())

    //函数3：有参，无返回值类型
    def test3(s:String):Unit={
      println(s)
    }
    test3("jinlian")

    //函数4：有参，有返回值
    def test4(s:String):String={
      return s+"有参，有返回值"
    }
    println(test4("hello "))

    //函数5：多参，无返回值
    /*def test5(name:String,age:Int):Unit = {
      println(s"$name,$age")
    }
    test5("dalang",40)*/

    //函数6；多参，有返回值
    def test6(name:String,age: Int):String = {
      return "多参，有返回值"
    }
    println(test6("德玛西亚",20))

    def test(s:String*):Unit = {
      println(s)
    }
    test()

    def test7(name:String,s:String*):Unit = {
      println(name +","+s)
    }

    test7("jinlain")

    //参数默认值
    def test8(name:String,age:Int = 30):Unit = {
      println(s"$name,$age")
    }
    test8("孙帅彦")

    def test9(sex:String = "男",name:String):Unit = {
      println(s"$name,$sex")
    }
    test9(name = "ximenqing")
  }
}
