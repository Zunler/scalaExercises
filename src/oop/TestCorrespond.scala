package oop

object TestCorrespond {
  def main(args: Array[String]): Unit = {
    val a=Array("aa","bb","cc","dd")
    val b=Array(2,2,2,2)
    val c=Array(1,2,3)
    val d=Array(1,2,3,4)
    println(a.corresponds(b)(_.length==_))
    println(a.corresponds(c)(_.length==_))
    println(a.corresponds(d)(_.length==_))
  }
}
