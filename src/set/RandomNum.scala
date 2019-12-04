package set

import scala.collection.BitSet
import scala.util.Random

object RandomNum {
  def main(args: Array[String]) = {

    time {
      var b: BitSet = BitSet()
      var c: BitSet = BitSet()

     // 用较小数据集测试
            val bat = c++(1 to 10).par.toList
            val bit = b ++ (1 to 5).map(_ => Random.nextInt(9) + 1).toList

//      val bit = b ++ (1 to 1e8.toInt).map(_ => Random.nextInt(99999999) + 1).toList
//      val bat = c ++ (1 to 1e8.toInt).par.toList //并没有要求随机数不重复

      //只计算未出现的数字的数量
//            val r=1e8.toInt-bit.size
//            println(r)

     // 求出所有未出现的数字
      val r: BitSet = bat -- bit
      println("未出现数字")
      println(r)
      println(r.size)
    }
  }

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) + "ns")
    result
  }


}

