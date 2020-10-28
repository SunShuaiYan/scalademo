package com.atguigu.chapter05

import scala.annotation.tailrec

object Recursion {
  def main(args: Array[String]): Unit = {
    //求阶乘
    println(factorial(5))
    println(fact(5))
  }

  //用循环实现
  def factorial(n: Int):Int = {
    var res = 1
    for(i <- 1 to n ){
      res *= i
    }
    res
  }

  //递归实现
  def fact(n:Int):Int = {
    if( n == 0) return 1
    n * fact(n - 1)
  }

  //尾递归
  def tailFact(n:Int):Int = {
    @tailrec
    def loop(acc:Int,n:Int):Int = {
      if(n == 0) acc else loop(n * acc, n-1)
    }
    loop(1,n)
  }
}
