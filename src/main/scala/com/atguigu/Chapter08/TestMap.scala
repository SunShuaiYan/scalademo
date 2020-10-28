package com.atguigu.Chapter08

object TestMap {
  def main(args: Array[String]): Unit = {
    //创建不可变集合Map
    val map  = Map("a"->1,"b"->2,"c"->3)
    //访问数据
    for(elem <- map.keys){
      //使用get访问map集合的数据，会返回特殊类型Option:有值Some，无值Node
      println(elem+"="+map.get(elem).get)
    }
    //如果key不存在，返回0
    println(map.get("d").getOrElse(0))
    println(map.getOrElse("d",0))
    //循环打印
    map.foreach((kv)=>{println(kv)})
  }
}
