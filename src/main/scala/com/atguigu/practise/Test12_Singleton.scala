package com.atguigu.practise

object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val student = Student12.getInstance()
    student.printInfo()
  }
}

class Student12 private(var name:String,var age :Int){
  def printInfo():Unit = {
    println(s"student12:$name $age")
  }
}

//懒汉式
/*object Student12{
  //声明出单例对象
  private var student:Student1
  def getInstance():Student12 = {
    //判断student是否为null，如果是，创建一个；如果不是直接返回
    if(student == null)
      student = new Student12("default", 0)
      student
  }
}
 */
//饿汉式
object Student12{
  private val student = new Student12("default",0)

  def getInstance():Student12 = student
}