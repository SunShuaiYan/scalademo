package com.atguigu.Inner

import scala.collection.mutable.ArrayBuffer

object HighLevelFunction {
  def main(args: Array[String]): Unit = {
    /* //调用foo函数，把返回值给变量f
    val f = foo
    println(f)
    //在被调用函数foo后面加上_,相当于把函数foo当作一个整体，传递给变量f1
    val f1 = foo _
    foo()
    f1()
    //如果明确变量类型，那么不使用下划线也可以将函数作为整体传递给变量
    var f2:() =>Int = foo
  }

  def foo():Int = {
    println("foo...")
    1
  }*/

/*    def f1(f:(Int,Int)=>Int):Int = {
      f(2,4)
    }

    //定义一个函数，参数和返回值类型和f1的输入参数一致
    def add(a:Int,b:Int):Int = a + b

    println(f1(add))
    println(f1(add _))

    //函数可以作为函数返回值返回
    def main(args: Array[String]): Unit = {
      def f1() = {
        def f2() = {

        }
        f2 _
      }
      val f = f1()
      f()

      f1()()
    }*/

  /*  //定义一个函数：参数包括数据和逻辑函数
    def operation(arr:Array[Int],op:Int=>Int) = {
      for(elem <- arr) yield op(elem)
    }

    //定义逻辑函数
    def op(ele:Int):Int = {
      ele+1
    }

    //标准函数调用
    val arr = operation(Array(1,2,3,4),op)
    println(arr.mkString(","))

    //采用匿名函数
    val arr1 = operation(Array(1,2,3,4),(ele:Int)=>{
      ele +1
    })
    println(arr1.mkString(","))

    //参数的类型可以省略，会根据形参进行自动的推导
    val arr2 = operation(Array(1,2,3,4),(ele)=>{
      ele + 1
    })
    println(arr2.mkString(","))


    //类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况：没有参数和参数超过1的永远不能省略圆括号
    val arr3 = operation(Array(1,2,3,4),ele=>{
      ele + 1
    })
    println(arr3.mkString(","))

    //匿名函数如果只有一行，则大括号也可以省略
    val arr4 = operation(Array(1,2,3,4),ele=>ele +1)
    println(arr4.mkString(","))

    //如果参数只出现一次，则参数省略且后面参数为_代替
    val arr5 = operation(Array(1,2,3,4),_+1)
    println(arr5.mkString(","))*/

    //传递的函数有两个参数
  /*  def calculator(a:Int,b:Int,op:(Int,Int)=>Int):Int = {
      op(a,b)
    }
    //标准版
    println(calculator(2,3,(x:Int,y:Int)=>{x+y}))

    //如果只有一行，则大括号可以省略
    println(calculator(2,3,(x:Int,y:Int)=>x+y))

    //参数的类型可以省略，会根据形参进行自动的推导
    println(calculator(2,3,(x,y)=>x+y))

    //如果参数只出现一次，则参数省略且后面参数可以_代替
    println(calculator(2,3,_+_))

    //扩展两个参数的函数
    def dualFunctionOneAndTwo(fun:(Int,Int)=>Int) = {
      fun(1,2)
    }
    val add = (a:Int,b:Int) => a+b
    val minus = (a:Int,b:Int) => a - b

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    dualFunctionOneAndTwo((a:Int,b:Int)=>a+b)
    dualFunctionOneAndTwo((a,b)=>a-b)

    dualFunctionOneAndTwo(_ + _)
    dualFunctionOneAndTwo(_ - _)*/

    //函数正常声明
    //def f():Int = {
/*      println("f()")
      10
    }

    //函数调用和函数返回值
    println(f())

    //函数可以作为值进行传递
    val f1:() =>Int = f
    println(f1)
    val f2:()=>Int = f _
    println(f2)

    //函数可以作为参数进行传递
    def dualFunction(a:Int,b:Int,op:(Int,Int)=>Int):Int = {
      op(a,b)
    }

    println(dualFunction(12,46,_+_))
    println(dualFunction(12,46,_*_))

    //函数可以作为函数返回值返回
    def f3():()=>Unit = {
      def f4():Unit = {

      }
      f4
    }

    def f7()={
      def f4():Unit = {
        println("f4()")
      }
      f4 _
    }
    val f5 = f3()
    println(f5)
    f5()

    f3()()*/

    def map(arr:Array[Int],op:Int=>Int) = {
      for(elem <- arr) yield op(elem)
    }
    val arr = map(Array(1,2,3,4),(x:Int)=>{
      x*x
    })
    println(arr.mkString(","))

    //Filter过滤。有参数，且参数再后面只使用一次，则参数省略且后面参数用_表示
    def filter(arr:Array[Int],op:Int=>Boolean) = {
      val arr1:ArrayBuffer[Int] = ArrayBuffer[Int]()
      for(elem <- arr if op(elem)){
        arr1.append(elem)
      }
      arr1.toArray
    }
    var arr1  =filter(Array(1,2,3,4),_%2==1)
    println(arr1.mkString(","))

    //reduce聚合。有多个参数，且每个参数再后面只使用一个，则参数省略后面用_表示，第n个_代表第n个参数
    def reduce(arr:Array[Int],op:(Int,Int)=>Int)= {
      var init:Int = arr(0)
      for(elem <- 1 until arr.length){
        init = op(init,elem)
      }
      init
    }
    val arr2 = reduce(Array(1,2,3,4),(x,y)=>x * y)
    println(arr2)
  }

}
