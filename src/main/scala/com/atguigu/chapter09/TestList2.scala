package com.atguigu.chapter09

object TestList2 {
  def main(args: Array[String]): Unit = {
    val list1:List[Int] = List(1,2,3,4,5,6,7)
    val list2:List[Int] = List(4,5,6,7,8,9,10)

    //获取集合的头
    println(list1.head)
    //获取集合的尾
    println(list1.tail)
    //集合最后一个数据
    println(list1.last)
    //集合初识数据
    println(list1.init)
    //反转
    println(list1.reverse)
    //去掉前后n个元素
    println(list1.drop(3))
    println(list1.dropRight(3))
    //并集
    println(list1.union(list2))
    //交集
    println(list1.intersect(list2))
    println("====================")
    //差集
    println(list1.diff(list2))
    println(list2.diff(list1))
    //（11）拉链 注:如果两个集合的元素个数不相等，那么会将同等数量的数据进行拉链，多余的数据省略不用
    println(list1.zip(list2))
    //滑窗
    list2.sliding(2,5).foreach(println)

  }
}
