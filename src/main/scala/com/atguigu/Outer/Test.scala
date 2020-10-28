package com.atguigu.Outer

object Test {
  def main(args: Array[String]): Unit = {
    var person = new Person("bobo",18,"男")
    //未使用任何修饰符，这个参数就是局部变量
    //println(person.name)


    person.age = 19
    person.age = 50
    println(person.age)

    //person.sex = "女"
    println(person.sex)


  }
}

class Person(name:String,var age:Int,val sex:String){

}