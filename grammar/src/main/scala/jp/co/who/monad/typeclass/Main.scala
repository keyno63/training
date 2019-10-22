package jp.co.who.monad.typeclass

import Who._
import Sum._

object Main extends App {

  val i = 1
  val d = 1.0
  val s = "Hello"

  println(i.whoMethod) //=> Int
  println(d.whoMethod) //=> Double
  println(s.whoMethod)

  // test Sum object.
  val x = List(1,2,3,4).summ
  println(x)
}
