package com.atguigu.Chapter01

object HelloScalaCompile {
  def main(args: Array[String]): Unit = {

    /*val name:String = "zhangsan"
    println(s"name=$name")
    println(s"name=${name.length}")
    println(
      """
        |Hello Scala
        | Hello Hadoop
        |Hello Spark
        |""".stripMargin)*/

/*    val age: Int = scala.io.StdIn.readInt()
    println(age);*/

    //从文件中获得输出
    /*scala.io.Source.fromFile("/Users/mymac/Desktop/IDEADEMO/Scala/src/main/resources/out.txt").foreach(
      line => {
        print(line)
      }
    )*/

 /*   val writer = new PrintWriter(new File("/Users/mymac/Desktop/IDEADEMO/Scala/src/main/resources/out.txt"))
    writer.write("Hello Scala")
    writer.close()*/


/*
    val age = 30
    if(age < 18){
      println("童年")
    }else if(age <= 30){
      println("青年")
    }else if(age <= 50){
      println("中年")
    }else{
      println("老年")
    }
*/
/*    val age = 30
    val result = if(age<18){
      "童年"
    }else if (age <= 30){
      "青年"
    }else if(age <= 50){
      "中年"
    }else{
      "老年"
    }
    println(result)*/

/*    for(i <- Range(1,5)){
      println("i="+i)
    }
    for(i <- 1 to 5){
      println("i = "+i)
    }
    for(i <- 1 until( 5)){
      println("i = "+i)
    }*/

   /* for(i <- Range(1,5) if i != 3){
      println("i ="+i)
    }

    for(i <- 1 to 5 by 2){
      println("i ="+i)
    }*/

/*
    for(i <- Range(1,5,2)){
      println("i ="+ i)
    }
    for(i <- 1 to  5 by 2){
      println("i = " + i)
    }
*/

  /*  for(i <- Range(1,5); j <- Range(1,4)){
      println("i = "+i+",j = "+j)
    }

    for(i <-  Range(1,5)){
      for(j <- Range(1,4)){
        println("i = "+i+",j="+j)
      }
    }*/

   /* for(i <- Range(1,5); j = i-1){
      println("j = "+j)
    }*/

 /*   val result  = for(i <- Range(1,5)) yield {
      i * 2
    }
    println(result)*/

    //循环中断
    scala.util.control.Breaks.breakable{
      for(i <- 1 to 5){
        if(i==3){
          scala.util.control.Breaks.break()
        }
        println(i)
      }
    }
  }
}
