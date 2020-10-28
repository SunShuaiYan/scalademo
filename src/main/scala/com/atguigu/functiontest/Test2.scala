package com.atguigu.functiontest

object Test2 {
  def main(args: Array[String]): Unit = {
    //函数标准写法
    def f(s:String):String = {
      return s + "jinlian"
    }
    println(f("Hello"))

    //return可以省略，Scala会使用函数体的最后一行代码作为返回值
    def f1(s:String):String = {
      s+" jianlian"
    }
    println(f1("Hello"))

    //如果函数体只有一行代码，可以省略花括号
    def f2(s:String):String = s + " 德玛西亚"
    println(f2("Hello"))

    //返回值类型可以推断出来，那么可以省略
    def f3(s:String) = s + " jinlian"
    println(f3("Hello3"))

    //如果有return，则不能省略返回值类型，必须指定
    def f4():String = {
      return "ximengqing"
    }
    println(f4())

    //如果函数声明为unit，那么即使函数体中使用return关键字也不起作用
    def f5():Unit = {
      return "dalang5"
    }
    println(f5())

    //Scala如果期望是无返回值类型，可以省略等号
    //将无返回值的函数称之为过程
    def f6(){
      "dalang6"
    }
    println(f6())

    //如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    def f7() = "dalang7"
    println(f7())
    println(f7)

    //如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8 = "dalang8"
    println(f8)

    //如果不关心名称，只关心处理逻辑，那么函数名def 可以省略

  }
}
