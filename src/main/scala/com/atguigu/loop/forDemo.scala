package com.atguigu.loop

object forDemo {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3) {
      print(i + " ")
    }
    println()

    for (i <- 1 to 5) {
      println("松松" + i)
    }

    for (i <- 1 until 3) {
      print(i + " ")
    }
    println()

    for (i <- 1 until 5 + 1) {
      println("宋宋，告别海狗人参丸吧" + i)
    }

    for (i <- 1 to 3 if i != 2) {
      print(i + " ")
    }
    println()

    for (i <- 1 to 5 if i != 3) {
      println(i + "宋宋！")
    }

    for (i <- 1 to 10 by 2) {
      println("i=" + i)
    }

    for (i <- 1 to 3; j <- 1 to 3) {
      println(" i =" + i + " j= " + j)
    }

    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println("i =" + i + " j=" + j)
      }
    }

    println("=====================================")

    for (i <- 1 to 3; j = 4 - i) {
      println("i=" + i + " j=" + j)
    }

    for {
      i <- 1 to 3
      j = 4 - i
    } {
      println("i=" + i + " j=" + j)
    }
    println("=====================================")

    for (i <- 1 to 3) {
      var j = 4 - i
      println("i=" + i + " j=" + j)
    }

    /*val res = for(i <- 1 to 10) yield i
    println(res)
    println("=====================================")*/

    var res = for (i <- 1 to 10) yield {
      i * 2
    }
    println(res)

    for (i <- 1 to 10 reverse) {
      println(i)
    }
    println("=====================================")

    var o = 0
    while (o < 10) {
      println("宋宋，喜欢海狗人参丸" + o)
      o += 1
    }
  }
}
