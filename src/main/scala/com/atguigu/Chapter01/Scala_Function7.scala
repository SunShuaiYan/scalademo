package com.atguigu.Chapter01

object Scala_Function7 {
  def main(args: Array[String]): Unit = {

      //函数作为值
    def fun1():String = {
      "zhangsan"
    }

    val a = fun1
    val b = fun1 _

    println(a)
    //打印的是函数本身即函数地址值
    println(b)

    //函数作为参数
    def fun2(i:Int):Int = {
      i * 2
    }

    def fun22(f:Int => Int ): Int = {
      f(10)
    }
    println(fun22(fun2))


    //函数作为返回值
    def fun3(i:Int):Int = {
      i * 2
    }
    def fun33() = {
      fun3 _
    }
    println(fun33()(10))

    //匿名函数
    def fun4(f:Int => Int):Int = {
      f(10)
    }
    println(fun4((x:Int)=>{x*20}))
    println(fun4((x)=>{x * 20}))
    println(fun4((x => x * 20)))
    println(fun4(_ * 20))


    //闭包
    def fun5()={
      val i = 20
      def fun55() = {
        i * 2
      }
      fun55 _
    }

  }

}