package oop

//object MyModule {
//def abs(n:Int):Int={
//  if (n>0) n
//  else -n
//}
//  private  def formatAbs(x:Int)={
//    val msg ="The absolute value of %d is %d"
//    msg.format(x,abs(x))
//  }
//  def main(args:Array[String]): Unit ={
//    println(formatAbs((-1)))
//  }
//}
object MyModule{

  private  def formatAbs(func:(Int)=>Int,x:Int)={
    val msg ="The absolute value of %d is %d"
    msg.format(x,func(x))
  }
  def main(args:Array[String]): Unit ={
    println(formatAbs((x:Int)=>if (x>=0) x else -x,-34))
  }

}