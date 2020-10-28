package com.atguigu.scala.test

object Test2 {
  def main(args: Array[String]): Unit = {
    val person = new Person {
      override val name: String = "teacher"

      override def hello(): Unit = println("hello teacher")
    }
    println(person)
  }
}

abstract class Person{
  val name:String
  def hello():Unit
}
