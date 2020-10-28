object Test15_wordCount{
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
    val wordList:List[String] = textLines.flatMap(_.split(" "))
    //分组
    val groupWordMap: Map[String, List[String]] = wordList.groupBy(word=>word)
    println(groupWordMap)
  }
}