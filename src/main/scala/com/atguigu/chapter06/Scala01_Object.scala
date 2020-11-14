package com.atguigu.chapter06

/**
 *Scala的面向对象
 */
object Scala01_Object {

  def main(args: Array[String]): Unit = {

      //创建类的对象
    val user = new User()
    println(user)

  }

}

//TODO SCAL声明类
class User extends Parent {

}
class Parent{

}