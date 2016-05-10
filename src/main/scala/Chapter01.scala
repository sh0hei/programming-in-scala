/**
  * A Scalable Language
  */
object Chapter01 {

  def run(): Unit = {
    println("======================== Chapter01 ========================")

    val capital = scala.collection.mutable.Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))

    def factorial(x: BigInt): BigInt =
      if (x == 0) 1 else x * factorial(x - 1)
    println(factorial(30))

    import java.math.BigInteger
    def factorial2(x: BigInteger): BigInteger =
      if (x == BigInteger.ZERO)
        BigInteger.ONE
      else
        x.multiply(factorial2(x.subtract(BigInteger.ONE)))
    println(factorial2(BigInteger.valueOf(30)))
  }

}
