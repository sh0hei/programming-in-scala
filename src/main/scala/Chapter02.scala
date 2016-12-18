/**
  * First Steps in Scala
  */
object Chapter02 {

  def run(): Unit = {
    println("======================== Chapter02 ========================")

    // Scala REPL
    // scala> 1 + 2
    // res0: Int = 3 // Scala has package same as Java
    // res0 * 3      // Scala has Class corresponding Java primitive types
    // res1: 9       // scalac use Java primitive types as much as possible when compile Scala code to Java bytecode for performance
    // println("Hello, world")
    // Hello, world!
    // :quit

    // Scala has type inference
    val msg = "Hello, world!"

    // explicit type annotation as intended by programmer, and as a document
    val msg2: java.lang.String = "Hello again, world!"
    val msg3: String = "Hello yet again, world!"

    // val is similar to Java final variable
    // var is similar to Java not final variable
    //
    // scala> msg = "Goodbye cruel world!"
    // <console>:12: error: reassignment to val
    //        msg = "Goodbye cruel world!"
    //            ^
    //
    var greeting = "Hello, world!"
    greeting = "Leave me alone, world!"

    // multiline input
    //
    // scala> val multiLine =
    //      | "This is the next ine."
    // multiLine: String = This is the next line.

    // Typing 2 [Enter], escaping from waiting input (e.g. typo)
    //
    // scala> val oops =
    //      |
    //      |
    // You typed two blank lines.  Starting a new command.

    // scalac doesn't use type inference for parameter list
    // max: (x: Int, y: Int)Int
    def max(x: Int, y: Int): Int = {
      if (x > y) x
      else y
    }
    println(max(3, 4))

    // max2: (x: Int, y: Int)Int
    //                        ^
    // Scala called `result type`
    // Java  called `return type`
    def max2(x: Int, y: Int): Int = if (x > y) x else y
    println(max2(7, 11))

    // greet: ()Unit
    // result type is Unit means greet() doesn't return value have meaning
    // * a method result type is Unit is executes for side effects only *
    def greet() = println("Hello, world!")

    // hello.scala
    // println("Hello, world, from a script!")
    // $ scala hello.scala
    // Hello, world, from a script!

    // helloarg.scala
    // println("Hello, " + args(0) + "!")
    // $ scala helloarg.scala planet
    // Hello, planet!

    // printargs.scala
    // var i = 0
    // while (i < args.length) {
    //   println(args(i))
    //   i += 1
    // }
    // $ scala printargs.scala foo bar fizz buzz
    // foo
    // bar
    // fizz
    // buzz

    // echoargs.scala
    // var i = 0
    // while (i < args.length) {
    //   if (i != 0)
    //     print(" ")
    //   print(args(i))
    //   i += 1
    // }
    // println()
    // $ scala echoargs.scala alice bob chris
    // alich bob chris
    
  }
}
