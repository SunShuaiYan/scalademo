package com.atguigu.Chapter01

object Scala_Function3 {

  def main(args: Array[String]): Unit = {

    //增加难度，简化函数的使用方式
    //至简原则
    //函数可以使用最后一行代码最为函数返回值
    def f1():String = {
      "zhangsan"
      null
    }
    //println(f1())

    //TODO 2 如果函数体中的代码只有一行可以省略花括弧
   def f2():String = "zhangsan"

  /*  println(f2())
    println(f2)*/


    //TODO3、如果函数声明中没有参数，那么参数列表的小括号可以省略
    def f3:String = "wangwu"
    //如果函数省略了参数列表，为了访问的一致性那么调用时不能增加小括号
    //println(f3())
    //println(f3)

    //TODO4 如果函数的返回值类型可以推断出来，那么可以省略
    def f4 = "zhaoliu"

    println(f4)

    //TODO5 如果函数只关心调用，而不关心名称,那么def关键字和函数名可以省略
    //如果函数每天def关键字和函数名，那么称之为匿名函数
    //小括号表示参数列表,不能省略 => 表示指向函数体
    //如果匿名函数想要调用，必修有名称，可以将匿名函数赋值给变量进行调用
    val t = ()=>{
      println("no method name")
    }

    t()

    //TODO6 等号可以省略
    //如果省略返回值类型，那么编译器会将函数体的最后一行代码作为返回值
    //如果函数体中明确使用return关键字，那么返回值类型不能省略
    //如果函数明确声明Unit，那么即使函数体中有return语法也不起作用
    //如果函数想要无返回值，但是又想省略Unit类型，那么可以使用省略等号的方式
    //将没有返回值类型和等号的函数称之为过程函数
    def f6(): Unit ={
      return "zhangsan"
    }

    println(f6())



    


  }

}
