object Test {

  def main(args:Array[String]):Unit={

    val list1= List(1,2,3,4)
    list1.filter((x)=>x>2)
    list1.filter(_>2)

  }
}
