package set

object ListOperation {

  def main(args:Array[String])={
    val list = List(1, 2, 3, 4)
    println((list:\List[Int]())(_::_))
    println((List[Int]()/:list)(_:+_))
    println((List[Int]()/:list)((x,y)=>y::x))


  }
}
