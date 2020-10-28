package com.atguigu.chapter07

object TestMap {
  def main(args: Array[String]): Unit = {
    val map = Map("a"->1,"b"->2,"c"->3)
    //访问数据
    for(elem <- map.keys){
      //使用get访问map集合的数据，会返回特殊类型option Some和None
      println(elem + "=" + map.get(elem).get)
    }

    //如果key不存在返回0
    println(map.get("d").getOrElse(0))

    //循环打印
    map.foreach((kv)=>{println(kv)})

  }
}
