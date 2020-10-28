package com.atguigu.scala.test

object Person7 {
  def main(args: Array[String]): Unit = {
    val person7 = new Person7
    //判断对象是否为某个类型的实例
    val bool:Boolean = person7.isInstanceOf[Person7]
    if(bool){
      val p1:Person7 = person7.asInstanceOf[Person7]
      println(p1)
    }

    //获取类的信息
    val pClass:Class[Person7] = classOf[Person7]
    println(pClass)


    println(bool)
  }
}

class Person7{

}