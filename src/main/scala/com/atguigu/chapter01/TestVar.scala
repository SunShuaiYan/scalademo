package com.atguigu.chapter01

object TestVar {
  def main(args: Array[String]): Unit = {
    //声明变量时，类型可以省略，编译器自动推导，即类型推导
    var age = 18
    age = 30

    //类型确定后，就不能修改
    //age = "tom"

    //变量声明时，必须要有初始值
    //var name

    //在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的不能改变
    var num1 = 10
    val num2 = 20

    num1 = 30
    //num2 = 30

    //var修饰的对象引用可以改变，val修饰的对象不可改变，但对象的状态是可以改变的
    var p1 = new Person()
    p1.name = "dalang"
    p1 = null

    val p2 = new Person()
    p2.name = "jinlian"
    p2.name="fangfang"
    //p2 = null

  }
}
class  Person{
  var name:String="jinlian"
}
