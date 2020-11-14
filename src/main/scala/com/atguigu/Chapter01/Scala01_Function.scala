package com.atguigu.Chapter01

object Scala01_Function {

  def main(args: Array[String]): Unit = {

    //声明函数
    //函数，就是封装的功能代码
    //函数编程关心的不是逻辑实现，而是功能本身(名字参数返回值)
    def f1():Unit = {
      println("f1")
    }
    f1()
    //如果函数没有参数，那么可以在调用的时候省略小括号
    f1

    //无参，有返回值
    def f2():String = {
      "zhangzhen"
    }

    println(f2())
    println(f2)

    //有参，无返回值
    def f3(name:String):Unit = {
      println(s"name=${name}")
    }
    //函数有参时调用时需要传递参数
    f3("zhangzhen")

    //有参，有返回值
    //函数的参数使用val声明，无法进行修改
    def f4(name:String):String = {
      return "Hello "+name
    }

    println(f4("zhangzhen4"))

    //多参，无返回值
    def f5(name:String,password:String):Unit = {
      println(s"name=${name},password=${password}")
    }

    f5("zhangzhen5","11111")

    //多参，有返回值
    def f6(name1:String,name2:String):String = {
      return name1+","+name2
    }
    println(f6("zhangsan","lisi"))


    //可变参数
    def f7(name:String*):Unit = {
      println(name)
    }
    f7("zhangsan","lisi")

    //可变参数一般声明在最后
    def f8(password:String,name:String*):Unit = {
      println(name)
    }

    f8("zhangsan","lisii","wangwu","找刘")


    //默认参数
    def f9(name:String,password:String = "000000"):Unit = {
      println(s"name=${name},password=${password}")
    }

    //调用函数时，如果传递了指定的参数，那么会覆盖值
    f9("zhangsan99","123456")

    def f10(password:String="000000",name:String):Unit = {
      println(s"name=${name},password=${password}")
    }

    def f11(password:String = "000000",name:String):Unit = {
      println(s"name=${name},password=${password}")
    }

    f11("123123","zhangsan")

    // f11("zhangsan")

    f11(name="zhangsan")



  }

}
