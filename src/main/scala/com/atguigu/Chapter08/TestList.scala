package com.atguigu.Chapter08

object TestList {
  def main(args: Array[String]): Unit = {
    //创建一个List数据有顺序可重复
    val list: List[Int] = List(1,2,3,4,3)
    list.foreach(println)
    //空集合Nil
    val list5 = 1::2::3::4::Nil
    list5.foreach(println)

    //List增加数据
    //（4.1）：：的运算规则是从右到左
    val list1 = 7::6::5::list
    list1.foreach(println)
    println("=====================")
    //添加到第一个元素位置
    val list2 = list.+:(5)
    list2.foreach(println)
    println("=====================")
    //集合间合并：将一个整体拆成一个一个的个体，成为扁平化
    val list3 = List(8,9)
    list3.foreach(println)
    val list4 = list3:::list1
    list4.foreach(println)

    //取出指定的元素
    println(list(0))
  }
}
