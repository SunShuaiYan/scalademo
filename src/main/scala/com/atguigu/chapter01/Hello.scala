package com.atguigu.chapter01

object Hello{
  def main(args: Array[String]):Unit = {
    println("helo scala")
    System.out.println("hello scala")

    var n7 = 2.2345678912f
    var n8 = 2.2345678912

    println("n7=" + n7)
    println("n8=" + n8)


    var c1:Char='a'
    println("c1="+c1)

    var c2:Char='a'+1
    println(c2)

    var isResult : Boolean = false
    var isResult2 : Boolean  = true
    println(isResult)
    println(isResult2)
  }
}