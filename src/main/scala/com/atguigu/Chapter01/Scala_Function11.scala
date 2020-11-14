package com.atguigu.Chapter01

object Scala_Function11{
  def main(args: Array[String]): Unit = {

    def test(i:Int) = {
      def fun1(f:(Int,Int)=>Int) = {
        def fun2(j:Int):Int = {
          f(i,j)
        }
        fun2 _
      }
      fun1 _
    }

    println(test(10)(_+_)(10))
  }

}