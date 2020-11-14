package com.atguigu.Chapter01

/**
 * 高阶函数编程
 */
object Scala_Function5 {


  def f33(function: (Int, Int) => Int): Unit = ???

  def main(args: Array[String]): Unit = {

    //TODO1 函数最为变量
    //声明函数
    def f1(name:String):Unit = {
      println("name = "+name)
    }

    //将函数赋值为变量
    //变量的类型就是函数的类型
    val v1 = f1("德玛西亚")

    //在当前场合下，不执行函数而是将函数作为一个整体赋值给变量
    //可以采用特殊符号 _
    val v2 = f1 _
    v2("atguigu")

    //如果不想使用下划线将函数作为整体使用，也可以明确变量类型
    //函数类型：（参数类型1，参数类型2）=> 返回值类型
    val v3:String => Unit = f1
    v3("lisi")

    //TODO2 将函数作为噢参数来使用
    /*def f2(i:Int,j:Int):Int = {
      i + j
    }*/

     //println(f2(10,20))

    println("-----------------------------")

    //TODO2 将函数作为参数来使用，等同于传递逻辑
    def f2(i:Int,j:Int):Int = {
      i + j
    }

    def f222(i:Int,j:Int):Int = {
      i * j
    }

    def f2222(i:Int,j:Int):Int = {
      i -j
    }


    def f22(f:(Int,Int)=>Int):Int = {
      f(10,20)
    }

    println(f22(f2222))
    //如果函数的参数类型不匹配，那么不匹配
    // 使用匿名函数作为参数
    //一般情况下，匿名函数就是函数作为参数时使用
    f33((a:Int,b:Int) => {
      a+b
    })
    //匿名函数也可以简化
    //如果函数体只有一行可以省略花括弧
    f33((a:Int,b:Int)=>
      a+b)

    //函数的参数类型可以推断出来的场合，参数类型可以省略
    f33((a,b)=>a+b)

    //如果函数逻辑中，只使用了参数一次，那么可以使用下划线来替代参数
    println(f33(_*_))

    //TODO3 函数作返回值使用
    def f4(i:Int):Int = {
      i * 2
    }
    def f44()={
      //将函数作为一个整体返回
      //使用下划线将函数作为一个整体返回
      f4 _
    }

    //如果不想使用下划线将函数作为整体返回
    //那么可以明确外部的函数的返回值类型为函数类型
    def f45():Int=>Int = {
      f4
    }






  }
}
