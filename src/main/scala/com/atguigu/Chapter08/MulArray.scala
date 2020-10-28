package com.atguigu.Chapter08

object MulArray {
  def main(args: Array[String]): Unit = {
    val arr:Array[Array[Int]] = Array.ofDim[Int](2,3)

    //访问数组中的元素，进行读写
    println(arr(1)(0))
    arr(1)(0) = 27
    println(arr(1)(0))
    arr(0)(2) = 59

    //遍历数组
    for(i <- 0 until arr.length;j <- 0 until arr(i).length )
      println(arr(i)(j))
    for( i <- arr.indices; j <- arr(i).indices) {
      println(arr(i)(j))
      if(j == arr(i).length - 1) println()
    }

    arr.foreach(line => line.foreach(elem => println(elem)))
    arr.foreach(_.foreach(println))
    println("=======================")
    //创建一个五维数组，2*3*4*5*6 （0，2，1，3，4）元素值为100，遍历数组

    val arr2: Array[Array[Array[Array[Array[Int]]]]] = Array.ofDim[Int](2,3,4,5,6)

  }
}
