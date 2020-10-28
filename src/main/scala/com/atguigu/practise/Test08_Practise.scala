package com.atguigu.practise

object Test08_Practise {
  def main(args: Array[String]): Unit = {
    def f1 = (i:Int,s:String,c:Char) => {
      if(i == 0 && s == "" && c == '0' ) false else true
    }

    val f2 :(Int,String,Char) => Boolean = (i:Int,s:String,c:Char) =>{
      if(i == 0 && s == "" && c =='0') false else true
    }

    println(f2(0,"",'0'))
    println(f2(0,"",'1'))
    println(f2(10,"",'0'))
    println(f2(0,"hello",'0'))

    val f3:(Int,String,Char) => Boolean = (i,s,c)=> !(i == 0 && s == "" && c == '0')

    //实现一个高阶函数，多次调用返回一个Booelean
    //要求：f(0)("")('0')得到false，其他得到true
    def f5(i:Int) = {
      def foo(s:String) = {
        def bar(c:Char):Boolean = {
          if(i==0 && s == "" && c == '0' ) false else true
        }
        bar _
      }
      foo _
    }

    println(f5(0)("")('0'))
    println(f5(1)("")('0'))
    println(f5(0)("")('1'))
    println(f5(0)("hello")('0'))

    def f6(i:Int):(String)=>Char=>Boolean={
      def foo(s:String):Char=>Boolean = {
        def bar(c:Char):Boolean = {
          if(i == 0 && s == "" && c=='0') false else true
        }
        bar
      }
      foo
    }



  }
}
