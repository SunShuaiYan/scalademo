package com.atguigu.chapter07

import scala.collection.mutable.ArrayBuffer

object TestArrayBuffer03 {
  def main(args: Array[String]): Unit = {
    //创建一个空的可变数组
    val arr2 = ArrayBuffer[Int]()
    //追加值
    arr2.append(1,2,3)
    println(arr2)

    val newArr: Array[Int] = arr2.toArray
    println(newArr)

    val newArr2 = newArr.toBuffer
    newArr2.append(123)

    println(newArr2)
  }
}
