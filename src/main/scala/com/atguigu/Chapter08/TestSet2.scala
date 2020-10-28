package com.atguigu.Chapter08

import scala.collection.mutable

object TestSet2 {
  def main(args: Array[String]): Unit = {
    val set = mutable.Set(1,2,3,4,5,6)
    set += 8
    //向集合中添加元素，返回一个新的set
    val ints = set.+(9)
    println(ints)
    println("set2="+set)
    //删除数据
    set-=(5)
    //(2)打印集合
    set.foreach(println)
    println(set.mkString(","))

  }
}
