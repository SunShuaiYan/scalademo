package com.atguigu.Chapter08

object TestTuple {
  def main(args: Array[String]): Unit = {
    //声明元祖的方式
    val tuple:(Int,String,Boolean) = (40,"bobo",true)
    //访问元组
    //通过元素的顺序进行访问，调用方式：_顺序号
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)

    //通过索引访问数据
    println(tuple.productElement(0))
    //通过迭代器访问数据
    for(elem <- tuple.productIterator){
      println(elem)
    }

    //Map中的键值对其实就是元祖，只不过元祖的元素个数为2
    val map = Map("a"->1,"b"->2,"c"->3)
    val map1 = Map(("a",1),("b",2),("c",3))

    map1.foreach(tuple=>{println(tuple._1+"="+tuple._2)})

  }
}
