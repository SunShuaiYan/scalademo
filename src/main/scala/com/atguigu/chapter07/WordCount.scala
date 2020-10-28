package com.atguigu.chapter07

object WordCount {
  def main(args: Array[String]): Unit = {
    // 一、简单版本
    val textLines: List[String] = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark",
      "hello spark from scala",
      "hello flink spark from scala"
    )

    //分词
    val wordList: List[String] = textLines.flatMap(_.split(" "))
    //分组
    val groupWordMap: Map[String, List[String]] = wordList.groupBy(word => word)
    //println(groupWordMap)
    //统计每个key的value的个数
    val wordCountMap: Map[String, Int] = groupWordMap.map(kv => (kv._1,kv._2.size))
    //println(wordCountMap)

    //排序取topN
    val topNWordCountList: List[(String, Int)] = wordCountMap.toList.sortBy(_._2)(Ordering[Int].reverse).take(3)
    println(topNWordCountList)
  }
}
