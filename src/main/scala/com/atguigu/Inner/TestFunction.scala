package com.atguigu.Inner

import java.rmi.server.UnicastRemoteObject

object TestFunction {
 /* //方法可以进行重载和重写
  def main(): Unit = {

  }*/

  def main(args: Array[String]): Unit = {
    /*import java.util.Date
    new Date()

    //函数m没有重载和重写
    def test():Unit = {
      println("无参，无返回值")
    }
    test()

    //函数中可以嵌套定义
    def test2():Unit = {
      def test3(name:String):Unit = {
        println("函数可以嵌套定义啊！")

      }    }

    def test5(name:String,age:Int):Unit = {
      println(name+age)
    }
    test5("dalang",40)*/

    def test(s: String*): Unit = {
      println(s)
    }

    /*//有输入参数，输出Array
    test("Hello","Scala")

    //无输出参数：输出List()
    test()

    //如果参数列表中存在多个参数，那么可变参数一般防治在最后
    def test2(name:String,s:String*):Unit = {
      println(name+","+s)
    }

    test2("德玛西亚","人在塔在","我的功绩")

    //参数默认值
    def test3(name:String,age:Int = 30):Unit = {
      println(s"$name,$age")
    }

    //如果参数传了值，会覆盖默认值
    test3("jianlian")

    //一般情况下，将默认值的参数放置在参数列表的后面
    def test4(sex:String = "男",name:String):Unit = {
      println(s"$name,$sex")
    }
    test4("wusong","ss")

    //带名参数
    test4(name = "ximenqing")
*/

    //标准写法
   /* def f(s: String): String = {
      return s + "jinlian"
    }

    println(f("Hello"))

    //至简原则
    //(1)return可以省略。Scala会使用函数体的最后一行代码最为返回值
    def f1(s: String): String = {
      s + "德玛西亚"
    }

    println(f1("Hello"))

    //如果函数体只有一行代码，可以省略花括号
    def f2(s: String): String = s + "人在塔在"

    println(f2("盖伦"))

    //返回值类型如果可以推断出来，那么可以省略(:和返回值类型一起省略)
    def f3(s: String) = s + "jianlian"

    println(f3("Hello3"))

    //如果有return,则不能省略返回值类型，必须指定
    def f4(): String = {
      return "ximenqing4"
    }

    println(f4())

    //如果函数明确声明Unit，那么即使函数中使用return关键字也不起作用
    def f5(): Unit = {
      return "dalang5"
    }

    println(f5())

    //Scala如果期望是无返回值类型，那么可以省略等号
    //将无返回值的函数成为过程
    def f6() = {
      "dalang6"
    }

    println(f6())

    //如果函数无参，但是声明了参数列表，那么调用时，小括号可加可不加
    def f7() = "dalang7"

    println(f7())
    println(f7)

    //如果函数没有参数列表，那么小括号可以省略，调用小括号必须省略
    def f8 = "dalang8"

    println(f8)
    //println(f8())

    //如果不关心名称，只关心逻辑处理，那么函数名def可以省略
    def f9 = (x:String)=>{
      println(("wusong"))
    }

    def f10(f:String=>Unit) = {
      f("")
    }

    f10(f9)
    println(f10((x:String)=>println("wusong")))*/

      val f = (name:String)=>println(name)
      f("atguigu")

     //定义一个以函数作为参数的函数
    def fun(f:(String)=>Unit):Unit = {
      f("Dongliang")
    }
    fun(f)

    //匿名函数作为函数参数传入
    fun((name:String)=>{
      println(name)

    })


  }
}