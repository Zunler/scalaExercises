package lottery

class Lottery {
  val nums: Array[Int] = new Array[Int](7);
  val results: Array[Int] = new Array[Int](7);

  def isNumeric(num: String): Boolean = {
    val pattern = """^(\d+)$""".r
    num match {
      case pattern(_*) => true
      case _ => false
    }
  }

  def inputNums(): Unit = {
    println("please input 7 integers you predict in (1,35)")
    for (i <- 0 to 6) {
      var num = readLine();

      while (!isNumeric(num)) {
        println("input invalid ,please enter again!")
        num = readLine();
      }
      var newNum = num.toInt
      while (newNum < 1 || newNum > 35) {
        println("input out of range,please enter again!")
        num = readLine()
        newNum = num.toInt
      }
      nums(i) = num.toInt
    }

  }


  def getResults(): Unit = {
    println("Getting Result.....")
    for (i <- 0 to 6) {
      results(i) = scala.util.Random.nextInt(36)
    }
    var accuracy=0.0
    var count=0.0
    for (i <- 0 to 6) {

      if(results(i)==nums(i)){
        count+=1
      }

    }
    accuracy=count/7;
    println("Result:" + results.mkString(","), " Your prediction:" + nums.mkString(",")+" Accuracy:"+accuracy)


  }
}
object Test {
  def main(args: Array[String]): Unit = {
    val lottery=new Lottery();
    lottery.inputNums();
    lottery.getResults();
  }
}
