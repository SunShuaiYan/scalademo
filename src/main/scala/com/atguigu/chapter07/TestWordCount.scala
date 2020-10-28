package com.atguigu.chapter07

object TestWordCount {
  def main(args: Array[String]): Unit = {
    // 单词计数：将集合中出现的相同的单词，进行计数，取计数排名前三的结果
    val stringList = List("Hello Scala Hbase kafka", "Hello Scala Hbase", "Hello Scala", "Hello")

    //将每个字符串转换成一个一个单词
    val wordList: List[String] = stringList.flatMap(str=>str.split(" "))
    println(wordList)

    //将相同的单词进行计数
    val wordToWordsMap:Map[String,List[String]] = wordList.groupBy(word=>word)

    //对相同的单词进行计数
   val wordToCountMap: Map[String, Int] = wordToWordsMap.map(tuple=>(tuple._1,tuple._2.size))
    
    //对计数完成后的结果进行排序
    val sortList: List[(String, Int)] = wordToCountMap.toList.sortWith {
      (left, right) => {
        left._2 > right._2
      }
    }

    val resultList: List[(String, Int)] = sortList.take(3)
    println(resultList)

  }
}
