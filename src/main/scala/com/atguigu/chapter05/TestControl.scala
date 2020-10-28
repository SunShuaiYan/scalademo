package com.atguigu.chapter05

object TestControl {
  def main(args: Array[String]): Unit = {

   def f=()=>{
     println("f....")
     10
   }
   foo(f())
  }

  def foo(a:Int):Unit = {
    println(a)
    println(a)
  }
}
