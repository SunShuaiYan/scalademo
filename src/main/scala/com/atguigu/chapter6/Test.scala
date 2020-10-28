package com.atguigu.chapter6

object Test {
  def main(args: Array[String]): Unit = {
    var person = new Person("bobo",18,"男")
    //未使用任何修饰符修饰，这个参数就是局部变量

    person.age = 19
    println(person.age)


  }
}

class Person(name:String, var age:Int,val sex:String){
  println(name)
}