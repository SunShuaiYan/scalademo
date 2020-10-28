package com.atguigu.chapter07

object TestArray {
  def main(args: Array[String]): Unit = {
    //数组定义
    val arr01 = new Array[Int](4)
    println(arr01.length)

    //数组赋值
    arr01(3)  = 10
    arr01.update(0,1)

    //查看数组
    println(arr01.mkString(","))

    //遍历数组
    for(i <- arr01){
      println(i)
    }
    println("-----------------")
    //增加元素
    arr01.foreach(println)
    val ints:Array[Int] = arr01:+5
    ints.foreach(println)

    var arr02 = Array(1,3,"bobo")
    println(arr02.length)
    for(i<- arr02){
      println(i)
    }

  }
}
