package com.atguigu.Chapter08

object DimArray {
  def main(args: Array[String]): Unit = {
    //创建一个二维数组，有三个元素 含有4个元素一维数组
    val arr = Array.ofDim[Int](3,4)
    arr(1)(2) = 88

    //(2)遍历二维数组
    for(i <- arr){
      for(j <- i){
        print(j+" ")
      }
      println()
    }
  }
}
