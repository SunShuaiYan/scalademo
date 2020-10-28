package com.atguigu.chapter07

object TestMatchVal {
  def main(args: Array[String]): Unit = {
    println(describe("true"))
  }

  def describe(x:Any) = x match{
    case 5 => "Int five"
    case "hello" => "String hello"
    case "true" => "Boolean true"
    case '+' => "Char +"
  }


}
