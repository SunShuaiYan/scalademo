package com.atguigu.loop

import scala.io.StdIn

object Test2 {
  def main(args:Array[String]):Unit = {
    var r2 : Double = 10.0/3
    println("r3="+r2)
    var r3 : Double = 10.0/3
    println("r3="+r3.formatted("%.2f"))

    var r4 = 10 % 3
    println("r4="+r4)

    var a = true
    var b = false

    var i:Int = 1.+(1)
    var j:Int = 1+(1)
    val k:Int = 1+1

    println(i)
    println(j)
    println(k)

    println(1.toString)
    println(1 toString)
    println(1 toString)

    /*println("input age")
    var age = StdIn.readInt();
    if(age < 18){
      println("童年")
    }else if(age < 30){
      println("中年")
    }else{
      println("老年")
    }*/

  /*  println("input age")
    var age = StdIn.readInt()
    val res:String = if(age < 18){
      "童年"
    }else if(age < 50){
      "中年"
    }else{
      "老年"
    }
    println(res)*/

/*    println("input age")
    var age = StdIn.readInt()
    val res:Any = if(age  < 18){
      "童年"
    }else if(age < 35){
      70
    }else{
      100.0
    }

    println(res)*/

    println("input age")
    var age = StdIn.readInt()

    val res:String = if(age < 18){
      "童年"
    }else{
      if(age >= 18 && age < 30){
        "中年"
      }else{
        "老年"
      }
    }
  println(res)















  }
}
