fun main(args: Array<String>) {
    //tudo em Kotlin é um objeto

    var n1:Short = 7
    var n2:Int

    n2 = n1.toInt() //conversão de Short para Int

    println(n1)
    println(n2)
    println()

    /*
    *   Desafio:  Fazer funcionar
    *       Var n1:Float = 21.5F
    *       Var n2:Double
    *
    *       n2 = n1
    * */

    var num1:Float = 21.5F
    var num2:Double

    num2=num1.toDouble()

    println(num1)
    println(num2)
}