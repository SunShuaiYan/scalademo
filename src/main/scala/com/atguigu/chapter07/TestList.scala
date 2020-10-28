package com.atguigu.chapter07

object TestList {
  def main(args: Array[String]): Unit = {
    //List默认为不可变集合
    //创建一个List(数据有顺序，可重复)
    val list:List[Int] = List(1,2,3,4,3)
    list.foreach(print)
    //空Nil
    val list5 = 1::2::3::4::Nil
    list5.foreach(println)
    val list1 = 7::6::5::list
    list1.foreach(print)
    println("-----------------")
    val list2 = list.+:(5)
    list2.foreach(print)
    println()
    //集合间合并，将整体拆分成一个一个的个体
    val list3 = List(8,9)
    val list4 = list3:::list1
    list4.foreach(print)
  }
}
