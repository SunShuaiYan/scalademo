package com.atguigu.practise

object Test1 {
  def main(args: Array[String]): Unit = {
      // 1.实现一个三参数(Int, String, Char)函数，返回一. 个Boolean
      // 要求: f(0, ”"， '0')得到false, 其他情况得到true
      def func1(a:String,b:String,c:Char):Boolean = {
        if(a == 0 && b == "" && c == '0'){
          false
        }else{
          true
        }
      }


  }
}
