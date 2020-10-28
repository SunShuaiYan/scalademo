package com.atguigu.chapter07

object TestTuple {
  def main(args: Array[String]): Unit = {
    //声明元组的方式
    val tuple:(Int,String,Boolean) = (40,"bobo",true)
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

    val map1 = Map("a"->1,"b"->2,"c"->3)
    val map2 = Map(("a",1),("b",2),("c",3))

    map1.foreach(tuple=>{println(tuple._1)+"="+tuple._2})

  }
}
