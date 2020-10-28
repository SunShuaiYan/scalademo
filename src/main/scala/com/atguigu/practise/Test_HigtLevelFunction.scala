package com.atguigu.practise

object Test_HigtLevelFunction {
  def main(args: Array[String]): Unit = {
    //函数正常声明
    def f(): Int = {
      println("f()")
      10
    }

    //函数调用和函数返回值
    println(f())

    //函数可以作为值进行传递
    val f1: () => Int = f
    println(f1)
    val f2: () => Int = f _
    println(f2)

    //函数可以作为参数进行传递
    def dualFunction(a: Int, b: Int, op: (Int, Int) => Int): Int = {
      op(a, b)
    }

    println(dualFunction(12, 46, _ + _))
    println(dualFunction(12, 46, _ * _))

    //函数可以作为函数返回值返回
    def f3(): () => Unit = {
      def f4(): Unit = {
        println("f4()")
      }
      f4
    }
    def f7()={
      def f4():Unit = {
        println("f4()")
      }
      f4 _
    }

    //f4其实就是f4
    val f5 = f3()
    println(f5)
    f5()

    f3()()
  }
}
