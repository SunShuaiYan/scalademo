package com.atguigu.chapter07

object TestList5 {
  def main(args: Array[String]): Unit = {
    val list:List[Int] = List(1, 5, -3, 4, 2, -7, 6)

    //求和
    println(list.sum)
    //求乘积
    println(list.product)
    //最大值
    println(list.max)
    //最小值
    println(list.min)
    //排序
    println(list.sortBy(x => x))
    //按照元素的绝对值排序
    println(list.sortBy(x => x.abs))
    //按照元素大小升序排序
    println(list.sortWith((x,y)=>x < y))
    //按照元素大小降序排序
    println(list.sortWith((x,y)=> x > y))
  }
}
