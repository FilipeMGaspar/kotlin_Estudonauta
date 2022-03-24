/*  Operadores de Atribuição
*
*   +=      .plusAssign()
*   -=      .minusAssign()
*   *=      .timesAssign
*   /=      .divAssign
*   %=      .modAssign
*
 */
fun main(args: Array<String>) {
    var pass:Float = 8.65f
    var aumtoPass:Float
    println()
    println("O bilhete de autocarro custa $pass €")
    aumtoPass = 0.25f
    println("O bilhete de autocarro vai amentar $aumtoPass €")
    pass += aumtoPass
    println("Com o aumento o bilhete do autocarro custa $pass")

/*
    var tv:Int = 4;

    println()
    println("Você tem $tv aparelhos em casa!")
    tv += 3
    println("Neste momento você tem $tv aparelhos!")
*/
}