package set

object Variances {
  def variances(xs: Seq[Double]): Option[Double] = {
    val l=xs.length
    val m = xs.sum / l
    Some(xs.map(x=>math.pow(x-m,2)).sum/l)//
  }
  def main(args:Array[String])={
    val a=Seq(1.1,2.2,3.3,4.4);
    println(variances(a))
  }
}
