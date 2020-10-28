package com.atguigu.chapter07

object Test01_Array {
  def main(args: Array[String]): Unit = {

  }

  val arr1:Array[Int] = new Array[Int](5)

  //用伴生对象的apply方法
  val arr2:Array[Int] = Array(1,2,3,4,5)

  //访问数组中元素，做读写操作
  println(arr1(1))
  println(s"${arr1(0)} ${arr1(1)} ${arr1(2)} ${arr1(3)} ${arr1(4)}")
  arr1(3) = 13
  arr1(0) = 48
  arr2(2) = 27

  println(arr1.mkString(" "))
  println(arr2.mkString("-"))

  //遍历所有的元素
  //for循环
  for(i <- 0 until  arr2.length){
    println(arr2(i)+"\t")
  }

  for(i <- arr2.indices ) print(arr2(i)+"\t")
  println()

  //for循环直接遍历元素
  for(elem <- arr2) print(elem+"\t")
  println()

  //迭代器
  val iter:Iterator[Int] = arr2.iterator
  while(iter.hasNext)
    print(iter.next()+"\t")
  println()

  //foreach方法
  arr2.foreach(elem => print(elem + "\t"))
  println()
  arr2.foreach(println)


  

}
