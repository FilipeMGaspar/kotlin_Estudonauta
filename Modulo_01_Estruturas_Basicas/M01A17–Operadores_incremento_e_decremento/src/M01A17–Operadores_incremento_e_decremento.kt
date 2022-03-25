fun main(args: Array<String>) {
    /*
    *   ++      .inc()
    *
    *   --      .dec()
    *
    *   a++   -> a = a + 1
    *
    *   a--   -> a = a - 1
    *
    * */

    var x = 4
   // var y = x++  // a++ pós incremento

    var y = ++x  // ++a pré incremento

    println("\nOs valores são $x e $y")

    /*
    var n:Int = 7
    //n++  // n = n +1
    n = n.inc() // n = n + 1    não funciona só colocar n.inc
    println("\nA variavel tem o valor de $n")
    */
}