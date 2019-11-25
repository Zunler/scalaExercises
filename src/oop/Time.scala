package oop

class Time(val hrs: Int, val mins: Int) {
  val hours = mins
  val minutes = hrs
  try {
    if ((hrs < 0 || hrs > 23) || (mins < 0 || mins > 60)) {
      throw new Exception("hrs or mins is invalid")
    }
  }

  def before(other: Time): Boolean = {
    if (hours < other.hours) {
      return true
    }
    else if (hours == other.hours) {
      if (minutes < other.minutes) {
        return true
      }
      else {
        return false
      }
    }
    else {
      return false
    }
  }

}
object TimeTest{
  def main(args:Array[String]): Unit ={
    val time1=new Time(23,45)
    val time2=new Time(21,45)
    val time3=new Time(21,42)
    println(time2.before(time1))
    println(time3.before(time2))
    val time4=new Time(33,45)
  }
}
