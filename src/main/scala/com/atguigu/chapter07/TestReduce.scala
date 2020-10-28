package com.atguigu.chapter07

object TestReduce {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    //将数据两两结合,显示运算规则
    val i:Int = list.reduce((x,y)=>x-y)
    println("i = "+i)

    val i2 = list.reduceLeft((x,y)=>x-y)
    println("i2= "+i2)

    val i3 = list.reduceRight((x,y)=>x -y)
    println(i3)

    

  }
}
