object Question2 {
  def main(args: Array[String]): Unit = {
    println("Enter number : ")
    val input = scala.io.StdIn.readLine().toInt

    input match {
      case n if n < 0 => println("Negative")
      case n if n == 0 => println("zero")
      case n if n % 2 == 0 => println("Even Number")
      case n if n % 2 == 1 => println("Odd Number")
    }
  }
}
