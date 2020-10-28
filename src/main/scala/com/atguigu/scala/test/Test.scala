package com.atguigu.scala.test

class Perosn3 {
  val name:String = "person"

  def hello():Unit = {
    println("hello person")
  }
}

class Teacher extends Perosn3{
  override val name: String = "teacher"

  override def hello(): Unit = {
    println("hello teacher")
  }
}

object Test{
  def main(args: Array[String]): Unit = {
    val teacher = new Teacher()
    println(teacher.name)
    teacher.hello()

    val teacher2:Perosn3 = new Teacher
    println(teacher2.name)
    teacher2.hello()
  }
}
