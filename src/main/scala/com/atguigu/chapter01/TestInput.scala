package com.atguigu.chapter01

import scala.io.StdIn

object TestInput {
  def main(args:Array[String]):Unit = {
    //输入姓名
    printf("input name:")
    var name = StdIn.readLine()

    //输入年龄：
    printf("input age")
    var age = StdIn.readShort()

    //输入薪水
    printf("input sal:")
    var sal = StdIn.readDouble()

    //打印
    println("name"+name)
    println("age="+age)
    println("sal" +sal)


  }
}
