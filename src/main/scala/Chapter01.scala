import scala.collection.immutable.HashMap

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

    // Class having constructor in Java
    // class MyClass {
    //   private int index;
    //   private String name;
    //   public MyClass(int index, String name) {
    //     this.index = index;
    //     this.name = name;
    //   }
    // }

    // Class having constructor in Scala
    class MyClass(var index: Int, var name: String) {}

    // a String variable has uppercase letter or not ? in Java
    // ループで１文字ずつ処理する低水準の存在として文字列を扱っている
    // String name = "Alice";
    // boolean nameHasUpperCase = false;
    // for (int i = 0; i < name.length(); ++i) {
    //   if (Character.isUpperCase(name.charAt(i))) {
    //     nameHasUpperCase = true;
    //     break;
    //   }
    // }

    // a String variable has uppercase letter or not ? in Scala
    // 述語関数 (predicate) でテストできる高水準の存在として文字列を扱っている
    // 結果型が Boolean となる関数リテラルは述語関数と呼ぶ事ができる
    val name: String = "Alice"
    val nameHasUpperCase = name.exists(_.isUpper)

    // Java での実現例
    // 実際にはループを使ったチェックで済ます事が多い
    // interface CharacterProperty {
    //   boolean hasProperty(char ch);
    // }

    // exists(name, new CharacterProperty() {
    //   public boolean hasProperty(char ch) {
    //     return Character.isUpperCase(ch);
    //   }
    // });

    // Scala has Type inference
    val x: HashMap[Int, String] = new HashMap[Int, String]()

    val y = new HashMap[Int, String]()
    val z: Map[Int, String] = new HashMap()
  }

}
