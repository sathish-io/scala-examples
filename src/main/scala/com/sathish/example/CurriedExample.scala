package com.sathish.example


object CurriedExample extends App {

  def add(x: Int) (y: Int): Int =  x + y

  def addOne(a: Int): Int = add(1)(a)

  val restult = addOne(5)

  printf(s"restult = $restult)")

}
