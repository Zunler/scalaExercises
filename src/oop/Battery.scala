package oop

trait BatteryPower {
  def monitor(power: Double): String
}

trait EnergySource {
  def is(result: String): Unit
}
class Battery extends EnergySource with BatteryPower {
  override def is(result: String): Unit = {

  }

  override def monitor(power: Double): String  = {
    if (power >= 40) {
      "green"
    }
    else if (power >= 20 && power <= 39) {
      "yellow"
    }
    else {
      "red"
    }
  }

}
object BatteryTest {
  def main(args: Array[String]): Unit = {
    val battery = new Battery
    println(battery.monitor(80))
    println(battery.monitor(30))
    println(battery.monitor(10))
  }
}

