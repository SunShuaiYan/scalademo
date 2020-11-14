package com.atguigu.Chapter01

/**
 * 高阶函数编程
 */
object Scala_Function6{
  def main(args: Array[String]): Unit = {

    //闭包：一个变量在函数执行完后被其他的函数包含使用，改变了这个函数的声明周期
    //这种处理方式称之为闭包

    /*def f1():()=>Int = {
      val i  = 10
      def f2():Int = {
        i * 2
      }
      f2 _
    }

    println(f1()())

    //TODO1、
    def test(i:Int) = {
      def fun(j:Int):Int = {
        i * j
      }
      //将内部函数作为整体返回
      fun _
    }
    println(test(10)(20))*/

    /*def test(i:Int) = {
      def fun1(j:Int) = {
        def fun2(f:(Int,Int)=>Int):Int = {
          f(i,j)
        }
        fun2 _
      }
      fun1 _
    }
    println(test(10)(20))
*/

    def test2(i:Int)(j:Int)(f:(Int,Int)=>Int) = {
      f(i,j)
    }

    println(test2(10)(20)(_ + _))

  }
}
