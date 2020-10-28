package com.atguigu.Chapter08

import scala.collection.mutable.ListBuffer

object List2 {
  def main(args: Array[String]): Unit = {
    //创建一个可变集合
    val buffer = ListBuffer(1,2,3,4)
    for(elem <- buffer) println(elem)
    //像集合中添加数据
    buffer.+=(5)
    buffer.append(6)
    buffer.insert(1,2)
    buffer.foreach(println)
    println("=============")
    //修改数据
    buffer(1) = 6
    buffer.update(1,7)
    for(elem <- buffer) print(elem+"\t")
    println("=============")
    //删除元素
   /* buffer.-(5)
    buffer.-=(4)
    buffer.remove(3)*/
    buffer.-=(5)
    for(elem <- buffer) print(elem+"\t")
    buffer.remove(5)
    for(elem <- buffer) print(elem+"\t")

  }
}
