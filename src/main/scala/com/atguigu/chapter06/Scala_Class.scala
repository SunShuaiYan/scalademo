package com.atguigu.chapter06

import scala.beans.BeanProperty

object Scala_Class {
  def main(args: Array[String]): Unit = {

    //Scala中声明类和java一致，
    //访问权限 class 类名 {类体}、
    //Scala中的类可以声明在其他的地方
    //如果类声明前没有任何的访问权限修饰符，那么这个类就是公共访问的
    //Scala中如果什么都不写,就是公共访问权限

    val user = new User()

    //类的属性
    //类的属性就是类的局部变量


    //类属性的使用
    //在类中的声明属性，其实质是声明方法
    //在编译时，编译器会将类的属性自动编译成类的私有属性
    //在编译的同时,编译器会给这个属性编译成两个公共的set/get方法
    //如果属性声明时使用private关键字，那么编译时的属性和set、get的方法都是私有的

    val user05 = new User05()
    println(user05.name)
    println(user05.age)

    user05.setAddress("上海")
    println(user05.getAddress())




  }

  //声明类
  class User{

  }
}

class User05{
  var name:String = "zhangsan"
  val age:Int = 20
  //Scala类的属性必须显示初始化
  var sex:String = "男"

  //如果想要Scala中的类属性方法符合Bean规范，需要增加注解 @BeanProperty
  //底层编译时会自动添加符合Bean规范的Set Get方法
  @BeanProperty var address:String = _

}