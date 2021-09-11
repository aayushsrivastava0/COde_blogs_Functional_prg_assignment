package Liskov_SP

object LspMain extends App{
  val rectangleArea = (length: Int, width: Int) => length * width
  println(rectangleArea(10, 25))

  val squareArea = (length: Int, width: Int) => length * width
  println(squareArea(20, 20))

  val rectangle = Rectangle(10, 25)
  println(rectangle.calculateArea(rectangle))

}
