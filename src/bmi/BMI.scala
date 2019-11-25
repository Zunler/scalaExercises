package bmi

class BMI {
  def bmiStatus(weight: Double, height: Double): String = {
    var bmi=0.0
    if(weight<=height){
      bmi = (weight *10000)/ (height*height)
    }
    else{
       bmi = (height *10000)/ (weight*weight)
    }

    if(bmi<18.5|| bmi>24){"Abnormal weight"}
    else {
      "Normal weight"
    }

  }
}
object Test {
  def main(args: Array[String]): Unit = {
    var bmi = new BMI()
    val normal = bmi.bmiStatus(75, 183)
    println(normal)
    assert("Normal weight" == normal, "Expected Normal Weight, Got" + normal)
    val normal1 = bmi.bmiStatus(50, 170)
    println(normal1)
    assert("Abnormal weight" == normal1, "Expected Abnormal Weight, Got" + normal1)
    val normal2 = bmi.bmiStatus(160, 68)
    println(normal2)
    assert("Abnormal weight" == normal2, "Expected Abnormal Weight, Got" + normal2)
  }
}
