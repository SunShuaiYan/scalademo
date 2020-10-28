package com.atguigu.Chapter08

object TestSet {
  def main(args: Array[String]): Unit = {
    //Set默认是不可变集合，数据无序
    val set = Set(1,2,3,4,5,6)
    for(x <- set){
      println(x)
    }
    println("====================")
    //数据不可重复
    val set1 = Set(2,3,3,5,6,4,1)
    //遍历集合
    for(x <- set1){
      println(x)
    }
  }
}
