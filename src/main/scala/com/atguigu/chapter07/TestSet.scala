package com.atguigu.chapter07

import scala.collection.mutable


object TestSet {
  def main(args: Array[String]): Unit = {
    //创建可变合集
    val set = mutable.Set(1,2,3,4,5,6)
    for(x<-set){
      println(x)
    }
    //添加元素
    set += 8

    val ints = set.+(9)
    println(ints)
    println("set2="+set)

    set.foreach(print)
    //打印集合
    set-=(5)

    println("--------")
    set.foreach(println)
    println(set.mkString(","))
  }
}
