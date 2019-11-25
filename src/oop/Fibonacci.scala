package oop

class Fibonacci {
  //递归
  final def fib(n: Int): Int={
    if (n==1) 0
    else if (n==2) 1
    else fib(n-1)+fib(n-2)
  }
  @scala.annotation.tailrec
  //尾递归
  final def fibTailRec(n: Int,ret1:Int,ret2:Int): Int={
    if (n==1)ret1

    else fibTailRec(n-1,ret2,ret1+ret2)
  }
}
object TestFib{
  def main(args:Array[String]): Unit ={
    val fibonacci=new Fibonacci
    print("Recursive:")
    println(fibonacci.fib(10))
    print("TailRecursive:")
    println(fibonacci.fibTailRec(10,0,1))
  }
}
