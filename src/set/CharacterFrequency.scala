package set

import scala.collection.immutable.HashMap

object CharacterFrequency {
  def main(args: Array[String]) = {

    val a = "scalajavajavascript".par.aggregate(HashMap[Char, Int]())(
      (k, v) => { //匿名函数,k打印得kMap(),是要返回的HashMap,v是单个字母
        k + (v -> (k.getOrElse(v, 0) + 1)) //返回一个HashMap[Char,Int]
      }
      , //当不使用并行的时候，只有上部分就已经可以,这部分直接返回就可以
      (k, v) => (k.keySet ++ v.keySet).foldLeft((HashMap[Char, Int]())) { //k打印得kMap(),v打印得vMap()\
        (res, keys) => res + (keys -> (k.getOrElse(keys, 0) + v.getOrElse(keys, 0)))
      }

    )
    println(a)
  }
}
