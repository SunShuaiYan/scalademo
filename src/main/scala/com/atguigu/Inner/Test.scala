package com.atguigu.Inner

import scala.io.StdIn

object Test {
  def main(args: Array[String]): Unit = {
    /*
    var name:String = "jianlian"
    var age:Int = 18

    val s =
      """
        |select
        |   name，
        |   age
        |from user
        |where name = "zhangsan"
        |
        |""".stripMargin
    println(s)

    //如果需要对变量进行运算，那么可以加${}
    val s1 =
      s"""
         |select
         |  name,
         |  age
         |from user
         |where name = "$name" and age = ${age+2}
         |""".stripMargin
    println(s1)

    var s2 = s"name = ${name}"
    println(s2)*/

    /*println("请输入姓名:")
    var name = StdIn.readLine()

    println("请输入年龄：")
    var age = StdIn.readShort()

    println("请输入薪水: ")
    var sal = StdIn.readDouble()

    println("name = "+name)
    println("age = "+age)
    println("sal = "+sal)*/

/*    var c1:Char = 'a'
    println("c1="+c1)

    var c2:Char = 'a'+1
    println(c2)

    println("c:\\岛国\\avi")

    println("同学们都说:\"大海哥\"")*/

   /* def sayOk:Unit = {

    }

    println(sayOk)*/

  /* var cat = new Cat()
   cat = null
   println(cat)*/

   /* def test():Nothing = {
      throw new Exception()
    }
    test*/

  /*  var n = 1+2.0
    println(n)

    var n2:Double = 1.0
    //var n3:Int = n2

    var n4:Byte = 1
    //var c1:Char = n4
    var n5:Int = n4

    //byte,short,char可以计算，在计算时可转为Int
    var n6:Byte = 1
    var c2:Char = 1*/

  /*  var n1:Int = 2.5.toInt
    var r1:Int = 10*3.5.toInt+6*1.5.toInt
    var r2:Int = (10*3.5+6*1.5).toInt
    println(n1)
    println("r1="+r1+" r2="+r2)*/

    var str1:String = true+""
    var str2:String = 4.5+""
    var str3:String = 100+""

    println(str1)
    println(str2)
    println(str3)

    var s1:String = "12"
    var n1:Byte = s1.toByte
    var n2:Short = s1.toShort
    var n3:Int = s1.toInt
    var n4:Long = s1.toLong

    println(n1)
    println(n2)
    println(n3)
    println(n4)

  }
}

class Cat{

}
