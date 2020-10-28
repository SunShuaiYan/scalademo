package com.atguigu.chapter01

object TestSpecialType {
  def main(args: Array[String]): Unit = {
    /*def sayOk:Unit={
      //unit表示没有返回值，即void
    }
    println(sayOk)*/

//    var cat = new Cat()
//    cat  = null
//    println(cat)
//    var n1:Int = null
//    println("n1"+n1)

/*     def m1():Unit={
        println("m1被调用")
      }
      val m:Unit = m1()
      println(m)*/

    def m2(n:Int):Nothing = {
      if(n == 0)
        throw new NullPointerException
      else
        throw new RuntimeException
    }
    println(m2(1))
  }
}

