package com.atguigu.chapter07

import scala.collection.mutable

object TestMap2 {
  def main(args: Array[String]): Unit = {
    //创建可变集合
    val map = mutable.Map("a"->1,"b"->2,"c"->3)

    //向集合中增加数据
    map.+=("d"->4)

    //将数值4添加到集合中,并把集合集合中原值1返回
    val maybeInt: Option[Int] = map.put("a",4)
    println(maybeInt.getOrElse(0))

    //删除数据
    map.-=("b","c")
    //修改数据
    map.update("d",5)
    map("d") = 5

    //打印集合
    map.foreach((kv)=>{println(kv)})

  }
}
