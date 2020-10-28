package com.atguigu.chapter09

object TestList {
  def main(args: Array[String]): Unit = {
    val list :List[Int] = List(1,2,3,4,5,6,7)
    //获取集合长度
    println(list.length)
    //获取集合大小
    println(list.size)
    //循环遍历
    list.foreach(println)
    //迭代器
    for(elem <- list.iterator){
      println(elem)
    }
    //生成字符串
    println(list.mkString(","))
    //是否包含
    println(list.contains(3))
    println(list.contains(10))

  }
}
