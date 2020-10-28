package com.atguigu.practise

object Test {
  def main(args: Array[String]): Unit = {
/*    def f1(f:(Int,Int) => Int):Int = {
      f(2,4)
    }

    def add(a:Int,b:Int):Int = a+b

    println(f1(add))
    println(f1(add _))*/

    //定义一个函数：参数包含数据和逻辑函数
    def operation(arr:Array[Int],op:Int=>Int) = {
      for(elem <- arr) yield op(elem)
    }

    //定义逻辑函数
    def op(ele:Int):Int = {
      ele + 1
    }

    //标准函数调用
    val arr  = operation(Array(1,2,3,4),op)
    println(arr.mkString(","))

    //采用匿名函数
    val arr1 = operation(Array(1,2,3,4),(ele:Int)=>{
      ele +1
    })
    println(arr1.mkString(","))


  }







}
