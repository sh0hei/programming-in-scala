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

    // actor example named recipient
    // ```
    // recipient ! msg
    // ```

    // actor has mailbox queued received message
    // ```
    // receive {
    //   case Msg1 => ... // Msg1 の処理
    //   case Msg2 => ... // Msg2 の処理
    //   ...
    // }
    // ```

    // actor example for calculate checksum service
    // ```
    // actor {
    //   var sum = 0
    //   loop {
    //     receive {
    //       case Data(bytes)       => sum += hash(bytes)
    //       case GetSum(requester) => requester ! sum
    //     }
    //   }
    // }
    // ```

    // implicit conversion
    val s: String = "42" // java.lang.String
    val i: Int = s.toInt // java.lang.String has not toInt method
                         // s cast java.lang.String to scala.collection.immutable.StringOps with implicit conversion
                         // scala.collection.immutable.StringOps has toInt
    println(i)
  }

}
