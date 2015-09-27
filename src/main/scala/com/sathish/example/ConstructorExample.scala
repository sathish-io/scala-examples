package com.sathish.example


class ConstructorExample(var name: String, passwd: String) {

  println("this is constructor body execution")

  name match {
    case "" =>
      printf("name is empty string")
      name = "abc"
    case _ =>
  }

  def login(): Boolean = {
    printf("performing login")

    name match {
      case "sathish" => true
      case _ => false
    }
  }
}

object ConstructorExample {
  def main(args: Array[String]) {
    val example = new ConstructorExample("", "pass123")
    val loggedIn = example.login()

    println(s"Result = $loggedIn")
  }
}
