package com.atguigu.chapter07

object TestList3 {
  def main(args: Array[String]): Unit = {
    val list:List[Int] = List(1,2,3,4,5,6,7)
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

    println("-----------")
    //生成字符
    println(list.mkString(","))

    //查看是否包含
    println(list.contains(100))
  }
}
