package oop

import scala.collection.mutable.ArrayBuffer

abstract class Queue {
  def get: Int

  def put(x: Int)

  def show()

}

trait Doubling extends Queue {
  println("Doubing....")
//必须为abstract override
  abstract override def put(x: Int) = {
    super.put(2 * x)
  }
}

trait Incrementing extends Queue {
  println("Incrementing....")

  abstract override def put(x: Int) = {
    super.put(x + 1)
  }
}

trait FilterNegative extends Queue {
  println("filtering....")

  abstract override def put(x: Int): Unit = {
    if (x > 0) super.put(x)
    else println("input num should be negative!")

  }
}

class NewQueue extends Queue {
  val numArrayBuffer = new ArrayBuffer[Int]

  def get() = numArrayBuffer.remove(0)

  def put(x: Int) = {
    numArrayBuffer += x
  }

  def show(): Unit = {
    numArrayBuffer foreach println
  }
}

object TestQueue {
  def main(args: Array[String]): Unit = {
    val newQueue = new NewQueue() with Doubling with Incrementing with FilterNegative
    newQueue.put(1)
    newQueue.put(3)
    newQueue.put(4)
    newQueue.put(1)
    newQueue.show()
  }
}
