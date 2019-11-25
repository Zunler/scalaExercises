package oop

abstract class Animal {
  def animal(): String

  def sound(): String

  def food(): String

  def templateMethod(): Unit = {
    animal()
    sound()
  }
}

class Duck() extends Animal {
  override def animal(): String = {
    "Duck"
  }

  override def sound(): String = {
    "Gua"
  }

  override def food(): String = {
    "plants"
  }


}

class Cow() extends Animal {
  override def animal(): String = {
    "Cow"
  }

  override def sound(): String = {
    "mow"
  }

  override def food(): String = {
    "Grass"
  }

}

object TestAnimal {
  def main(args: Array[String]): Unit = {
    val duck = new Duck
    duck.templateMethod()
    println("-----")
    println(duck.sound())
    println(duck.food())
    val cow = new Cow
    println(cow.sound())
    println(cow.food())
  }

}
