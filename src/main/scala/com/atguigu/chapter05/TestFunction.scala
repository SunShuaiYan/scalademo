package com.atguigu.chapter05

object TestFunction {
  def main(args: Array[String]): Unit = {
    //println(test(5))
    println(testAdd(10))
  }

  def test(i:Int):Int = {
    if(i == 1){
      1
    }else{
      i*test(i-1)
    }
  }

  /**
   * 累加
   */
  def testAdd(i:Int):Int = {
    if(i == 1){
      1
    }else{
      i+testAdd(i-1)
    }
  }
}
