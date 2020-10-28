package com.atguigu.practise

class Person {
  def sum(n1:Int,n2:Int):Int = {
    n1+n2
  }
   var name:String="canglaoshi"
}

object Person{
  def main(args: Array[String]): Unit = {
    /*val person  = new Person()
    println(person.sum(10,20))*/
    var person = new Person()
    person = new Person()
    println(person.name)

  }
}