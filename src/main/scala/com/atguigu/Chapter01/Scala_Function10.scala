package com.atguigu.Chapter01



object Scala_Function10 {
  def main(args: Array[String]): Unit = {

    /*  def test():Unit = {
      println("zzzzz")
      test()
    }*/

    /* def test1():Unit = {
      test1()
      println("zzzzz")
    }*/


    def test(): String  = {
      println("test...")
      "zhangsan"
    }
    lazy val name = test()
    println("**************")
    println("**************")
    println("**************")
    println(name)
  }

}