package com.atguigu.loop

object Test1 {
  def main(args: Array[String]): Unit = {
/*    for(i <- 1 to 9){
      for(j <- 1 to i){
        print(j+"*"+i+"="+(i*j)+"\t")
      }
      println()
    }*/
    for(i <- 1 to 9; j <- 1 to i ){
      print(j+"😄"+i+"="+(i*j)+"\t")
      if(i == j){
        println()
      }
    }

   for(i <- 1 to 9){
     println(" " * (9 -i) + "😄️" *(2 * i - 1))
   }

   for{
     i <- 1 to 9
     j = 9 - i
     k = 2 * i -1
   }
     println(" "*j+"😄"*k)
  }

}
