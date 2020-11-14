package com.atguigu.chapter06

object Scala_Instance {
  def main(args: Array[String]): Unit = {

    //多态：一个对象在不同场合下的不同状态
    //如果类中声明了一个和类名一样的方法,这个方法并不是构造方法，就是一个普通方法

    val user = new User12()
    println(user)

  }

  //类其实也是函数，所有可以在类的后面声明参数列表
  //这个时候就可以将类名当成函数名，进行调用，这个调用其实就是构方法的调用
  //类在构建的时候完成类的初始化操作
  class User12(){
    println("user init....")
  }

}
