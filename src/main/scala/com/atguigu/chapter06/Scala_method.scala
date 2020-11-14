package com.atguigu.chapter06

object Scala_method {
  def main(args: Array[String]): Unit = {


    //使用方法
    val user = new User09()
    user.test()

    }

}

//声明的类中，默认继承了Object的方法，所以可以直接调用
class User09{
  //声明方法
  def test():Unit = {
    println("test....")
  }
}