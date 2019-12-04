package oop

class Change {
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (coins.size == 0 || money < 0) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  }
//  def countChangeTailRec(money: Int, coins: List[Int],before:Int,after:Int): Int = {
//    if (money == 0) before
//    else if (coins.size == 0 || money < 0) before
//    else countChangeTailRec(money, coins.tail,before+1)
//  }


object TestChange {
  def main(args: Array[String]): Unit = {
    val change = new Change();

    //    print(change.countChange(100, List(1, 5, 10, 20, 50,100)))
  }
}}
