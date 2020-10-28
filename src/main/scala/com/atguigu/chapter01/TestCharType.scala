package com.atguigu.chapter01

object TestCharType {
  def main(args:Array[String]): Unit ={
    var name:String = "jinlian"
    var age:Int = 18
    //（1）字符串，通过+号连接
    println(name+" "+age)
    println(name*10+" "+age*10)
    //(2) printf用法字符串，通过%传值
    printf("name=%s age=%d\n",name,age)
    //(3)多字符串，通过$引用
    val s =
      """
        |select
        |   name,
        |   age
        |from user
        |   where name="zhangsan"
        |""".stripMargin
    println(s)
      //如果需要对变量进行运算，那么可以加${}
    val s1 =
      s"""
         |select
         |    name,
         |    age
         |from user
         |where name="$name" and age = ${age+2}
         |""".stripMargin
    println(s1)

    var s2 = s"name = $name and ${age+100}"
    println(s2)

   println(s"$age 岁的$name 在0621班级学习")
   val avgScore = 87.32456547
   println(f"平均分数是$avgScore%.2f")

  }
}
