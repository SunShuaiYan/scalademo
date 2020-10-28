package com.atguigu.chapter05

object ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    //定义一个两数求和的函数，通用型很好，适用性较差
    def add(a:Int,b:Int):Int = a+b
    //
    def addByFour(b:Int):Int = 4 + b
    //
    def addByFive(b:Int):Int = 5+b

    def addByFour1() = {
      val a = 4
      def addB(b:Int):Int = a + b
      addB _
    }
    def addByA(a:Int) = {
      def addB(b:Int):Int = a + b
      addB _
    }

    println(addByFour1()(36))
    println(addByA(12)(36))

    //传入一个参数，得到具体的函数
    val addByFour2 = addByA(4)
    val addByFour3 = addByA(5)

    //匿名函数简写
    def addByA2(a:Int):Int=>Int = {
      a + _
    }

    //柯里化
    def addCurrying(a:Int)(b:Int):Int = a+b
    println(addCurrying(5)(18))


  }
}
