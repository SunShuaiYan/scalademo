package com.atguigu.chapter07

object DimArray {
  def main(args: Array[String]): Unit = {
    val arr = Array.ofDim[Int](3,4)
    arr(1)(2) = 88

    //遍历二维数组
    for(i <- arr){
      for(j <- i){
        print(j+" ")
      }
      println()
    }

  }
}
