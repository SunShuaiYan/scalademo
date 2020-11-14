package com.atguigu.Chapter01

object HelloScala {
  def main(args: Array[String]): Unit = {

    println("hello Scala")

    Predef.println("Hello Scala Predef")
  }

  def println(s:String):Unit = {
    
  }


  //声明一个方法
  def test(): Unit ={
    println("Test...")
  }
}
