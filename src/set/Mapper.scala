package set

object Mapper {
 def map(string:Array[String],map: Map[String,Int]):Array[Int]={
   string.flatMap(map.get(_))
 }
 def main(args:Array[String]): Unit ={
  println(map(Array("Tom","Fred","Harry"),Map("Tom"->3,"Dick"->4,"Harry"->5)).mkString(","))


 }

}
