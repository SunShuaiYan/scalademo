package com.atguigu.Inner

object Test2 {
  def main(args: Array[String]): Unit = {
    /*for(i <- 1 to 3 if i != 2){
      print(i+" ")
    }
    println()

    for(i <- 1 to 5 if i != 3){
      print(i+" 宋宋 ")
    }*/

    //循环步长
    /*    for(i <- 1 to 10 by 2){
      println("i"+i)
    }

    for(i <- 1 to 3; j <- 1 to 3){

        println("i="+i+" j="+j)

    }

    for( i <-  1 to 3){
      for(j <- 1 to 3){
        println("i="+i+" j="+j)
      }
    }*/

    /*    for(i <- 1 to 3; j = 4 - i){
      println("i="+i+" j="+j)
    }*/


    //循环返回值
    /*val res = for(i <- 1 to 10) yield
      { i * 2}
      println(res)

    for(i <- 1 to 10 reverse){
      println(i)
    }*/

    /*    try{
      for(elem <- 1 to 10){
        println(elem)
        if(elem == 5) throw new RuntimeException
      }
    }catch {
      case e =>
    }
    println("正常循环结束")
  }*/

    def f(args:String):Unit = {
      println(args)
    }
    f("hello world")
  }


}
