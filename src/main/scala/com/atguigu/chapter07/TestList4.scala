package com.atguigu.chapter07

object TestList4 {
  def main(args: Array[String]): Unit = {

    val list1:List[Int] = List(1,2,3,4,5,6,7)
    val list2:List[Int] = List(4,5,6,7,8,9,10)

    //获取集合的头
    println(list1.head)
    //获取集合的尾
    println(list1.tail)
    //获取集合中的最后一个元素
    println(list1.last)
    //获取集合初始元素
    println(list1.init)
    //反转
    println(list1.reverse)
    //取n个元素
    println(list1.take(3))
    println(list1.takeRight(3))
    //去掉n个元素
    println(list1.drop(3))
    //从右边去除n个元素
    println(list1.dropRight(3))
    //交集
    println(list1.intersect(list2))
    //并集(允许有重复的元素)
    println(list1.diff(list2))
    println(list1.union(list2))
    //差集
    println(list1.diff(list2))
    println(list2.diff(list1))
    //拉链
    println(list1.zip(list2))
    //滑窗
    list1.sliding(2,5).foreach(println)
  }
}
