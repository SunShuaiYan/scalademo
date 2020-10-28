package com.atguigu.chapter07

import scala.collection.mutable.ListBuffer

object TestList2 {
  def main(args: Array[String]): Unit = {
    //创建一个可变的集合
    val buffer = ListBuffer(1,2,3,4)
    buffer.+=(5)
    buffer.append(6)
    buffer.insert(1,2)
    buffer.foreach(print)

    buffer(1) = 6
    buffer.update(1,7)
    buffer.foreach(println)
    println("-----------")

    buffer.-(5)
    buffer.-=(5)
    buffer.remove(5)
    buffer.foreach(print)


  }
}
