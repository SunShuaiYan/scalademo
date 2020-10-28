package com.atguigu.practise

object Test07_ApplicationCase {
  def main(args: Array[String]): Unit = {
    //需求,提供一个函数，对一个数组中的元素进行处理，完成之后返回一个新的数组
    def arrayOps(arr:Array[Int],op:Int=>Int):Array[Int] = {
      for(elem <- arr ) yield op(elem)
    }

    //每个元素加1
    def addOne(a:Int):Int = {a+1}

    //调用map函数进行数组转换
    val arr:Array[Int] = Array(1,2,3,4)
    val newArr:Array[Int] = arrayOps(arr,addOne)
    println(newArr.mkString(" "))

    val newArr2 = arrayOps(arr,_ * 3)
    val newArr3 = arrayOps(arr,elem => elem * elem)
    println(newArr2.mkString(" "))
    println(newArr3.mkString(","))

  }
}
