package com.atguigu.loop

import scala.util.control.Breaks

object Test3 {
  def main(args: Array[String]): Unit = {
    /*try{
      for(elem <- 1 to 10){
        println(elem)
        if( elem == 5) throw new RuntimeException
      }
    }catch {
      case e =>
    }
    println("正常循环结束！")*/

    /*Breaks.breakable(
      for(elem <- 1 to 10){
        println(elem)
        if( elem ==5) Breaks.break()
      }
    )
    println("正常结束循环！")*/

   /* breakable {
      for (elem <- 1 to 10){
        println(elem)
        if(elem == 5) break
      }
    }
    println("正常结束循环")*/

   /* for(elem <- 1 to 10){
      if( elem % 2 == 1){
        println(elem)
      }else{
        println("continue")
      }
    }*/

    for(i <- 1 to 9){
      for(j <- 1 to i){
        print(j+"*"+i+"="+(i*j)+"\t")
      }
      println()
    }
  }
}
