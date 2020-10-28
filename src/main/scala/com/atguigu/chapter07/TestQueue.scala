package com.atguigu.chapter07

import scala.collection.mutable

object TestQueue {
  def main(args: Array[String]): Unit = {
    val que = new mutable.Queue[String]
    que.enqueue("a","b","c")
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())

  }
}
