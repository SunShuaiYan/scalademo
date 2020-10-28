package com.atguigu.chapter07

import scala.collection.mutable

object TestArrayBuffer {
  def main(args: Array[String]): Unit = {
    //创建并初始化赋值可变数组
    var arr01 = mutable.ArrayBuffer[Any](1,2,3)
    //遍历数组
    for(i <- arr01){
      println(i)
    }

    println(arr01.length)
    println("arr01.hash="+arr01.hashCode())

    //增加数据
    arr01.+=(4)
    arr01.append(5,6)
    arr01.insert(0,7,8)
    arr01.foreach(println)

    //修改元素
    arr01(1) = 9
    println("---------")
    arr01.foreach(println)

    println(arr01.length)
  }
}
