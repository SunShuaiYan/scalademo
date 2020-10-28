
package com{
  object Outer{
    val out:String = "out"

    def main(args: Array[String]): Unit = {
      println(name)
    }
  }
}

package object com{
  val name:String = "com"
}
