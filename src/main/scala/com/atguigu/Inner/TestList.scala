package com.atguigu.Inner

import scala.collection.mutable

object TestList {
  def main(args: Array[String]): Unit = {
    /*val list:List[Int] = List(1,2,3,4,5,6,7,8,9)
    val nestedList:List[List[Int]] = List(List(1,2,3),List(4,5),List(7,8,9))
    val wordList:List[String] = List("hello world","hello atguigu","hello scala")

    //过滤
    println(list.filter(x=> x % 2 == 0))
    //转化/映射
    println(list.map(x => x+1))
    //扁平化
    println(nestedList.flatten)
    //扁平化+映射
    println(wordList.flatMap(x=>x.split(" ")))
    //分组
    println(list.groupBy(x=>x%2))*/

    val list = List(1, 2, 3, 4)
    //将数据两两结合,实现运算规则
    /*val i:Int = list.reduce((x,y)=>x-y)
    println("i = "+i)*/

    val i = list.foldLeft(1)((x, y) => x - y)
    val i1 = list.foldRight(10)((x, y) => x - y)
    println(i)
    println(i1)

    //两个Map的数据合并
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = mutable.Map("a" -> 4, "b" -> 5, "d" -> 6)


  }




}
