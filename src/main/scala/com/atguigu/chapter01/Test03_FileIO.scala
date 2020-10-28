package com.atguigu.chapter01

import java.io.{File, PrintWriter}

import scala.io.Source

object Test03_FileIO {

  def main(args:Array[String]):Unit = {
 /*   //写入数据到文件中
    val writer = new PrintWriter(new File("src/main/resources/out.txt"))
    writer.write("hello scala-->德玛西亚")
    writer.close()*/

    //从文件中读取数据
    Source.fromFile("src/main/resources/out.txt").foreach(print)
  }

}
