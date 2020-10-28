package com.atguigu.Inner

object ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    //定义一个两数求和的函数
    def add(a:Int,b:Int):Int = a+b
    //考虑适用性和通用型的平衡，把第一个参数单独提取出来
    def addByFour1()={
      val a = 4
      def addB(b:Int):Int = a+b
      addB _
    }
    def addByA(a:Int) = {
      def addB(b:Int):Int = a+b
      addB _
    }
    println(addByFour1()(36))
    println(addByA(12)(36))

    //传入一个参数，得到具体的函数
    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)

    //匿名函数简写
    def addByA2(a:Int):Int=>Int = {
      a+_
    }

    //柯里化
    def addCurrying(a:Int)(b:Int):Int = a+b
    println(addCurrying(5)(18))
  }
}
