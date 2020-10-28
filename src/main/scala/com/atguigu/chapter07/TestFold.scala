package com.atguigu.chapter07

import scala.collection.mutable

object TestFold {
  def main(args: Array[String]): Unit = {
/*    val list = List(1,2,3,4)
    val i = list.foldLeft(10)((x,y)=>x-y)
    val i2 = list.foldRight(10)((x,y)=>x-y)
    println(i2)
    println(i)*/

    val map1 = mutable.Map("a"->1,"b"->2,"c"->3)
    val map2 = mutable.Map("a"->4,"b"->5,"d"->6)

    val map3:mutable.Map[String,Int] = map2.foldLeft(map1){
      (map,kv)=>{
        val k = kv._1
        val v = kv._2
        map(k) = map.getOrElse(k,0)+v
        map
      }
    }
  println(map3)
  }
}
