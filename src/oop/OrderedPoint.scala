package oop

import java.awt.Point

import scala.math.Ordered


class OrderedPoint(x: Int, y: Int) extends Point(x: Int, y: Int) with Ordered[Point] {


  def compare(that: Point): Int = if (this.x <= that.x && this.y < that.y) -1
  else if (this.x == that.x && this.y == that.y) 0
  else 1
}

object TestOrderPoint {
  def main(args: Array[String]): Unit = {
    val point1 = new OrderedPoint(1, 2);
    val point2 = new OrderedPoint(3, 4);
    val point3 = new OrderedPoint(2, 4);
    print(point1.toString+" "+point2.toString+" ")
    println(point1.compare(point2))
    print(point2.toString+" "+point3.toString+" ")
    println(point2.compare(point3))
  }
}