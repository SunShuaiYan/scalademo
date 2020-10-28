package com.atguigu.practise

object Test05_Lamdba {
  def main(args: Array[String]): Unit = {
    //定义一个匿名函数
    val f = (name:String) => println(name)
    f("atguigu")

    //定义一个以函数作为参数的函数
    def fun(f:(String) => Unit):Unit = {
      f("DongLiang")
    }
    fun(f)

    //匿名函数作为函数参数传入
    fun((name:String)=>{
      println(name)
    })

    //匿名函数的简化
    //(1)参数的类型可以省略，会根据形参进行自动的推导
    fun((name) =>{
      println(name)
    })

    //(2)类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况；没有参数和参数超过1不能省略
    fun(name => {
      println(name)
    })

    //匿名函数如果只有一行，那么大括号可以省略
    fun(name => println(name))

    //如果参数只出现一次，则参数省略且后面参数可以用_代替
    fun(println(_))
    println("==================================")
    fun(println)

    //扩展两个参数的函数
    def dualFunctionOneAndTwo(fun:(Int,Int) => Int) = {
      fun(1,2)
    }

    val add = (a:Int,b:Int) => a + b
    val minus = (a:Int,b:Int) => a - b

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    dualFunctionOneAndTwo((a:Int,b:Int) => a+b)
    dualFunctionOneAndTwo((a,b)=>a+b)
    dualFunctionOneAndTwo( _ + _ )
    dualFunctionOneAndTwo( _ - _ )
  }
}
