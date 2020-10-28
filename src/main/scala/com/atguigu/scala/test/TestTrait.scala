package com.atguigu.scala.test

trait PersonTrait{

  //特质可以拥有抽象方法和具体方法
  //具体属性
  var name:String = _
  //抽象属性
  var age:Int

  //声明方法
  def eat():Unit = {
    println("eat")
  }
  //抽象方法
  def say():Unit
}

trait SexTrait{
  var sex:String
}

//一个类可以实现/继承多个特质
class Teacher6 extends PersonTrait with Serializable{
  override def say(): Unit = {
    println("say")
  }

  override var age: Int = 18
}

object TestTrait {
  def main(args: Array[String]): Unit = {
    val teacher = new Teacher6
    teacher.say()
    teacher.eat()
    //动态混入，可灵活的扩展类的功能
    val t2 = new Teacher6 with SexTrait{
      override var sex: String = "男"
    }

    println(t2.sex)
  }
}
