package com.atguigu.chapter07

object TestList6 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
    val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")

    //过滤
    println(list.filter(x => x % 2 != 0))
    //转化和映射
    println(list.map(x => x +1))
    //扁平化
    println(nestedList.flatten)
    //扁平化和映射
    println(wordList.flatMap(x => x.split(" ")))
    //分组
    println(list.groupBy(x => x % 2))

  }
}
