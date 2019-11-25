package oop

class AddPercent(x:Double) {
  def +%(y:Double)=x*y*0.01+x
}
object Test {
  implicit def addPercent(x:Double)=new AddPercent(x)
  def main(args: Array[String]): Unit = {
    val res=120 +% 10
    println(res)
  }
}
