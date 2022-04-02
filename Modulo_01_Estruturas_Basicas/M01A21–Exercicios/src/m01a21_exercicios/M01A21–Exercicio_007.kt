package m01a21_exercicios

fun main(args: Array<String>) {
    var salario:Float
    var reajuste:Float

    println(VERMELHO)
    println("---------------------------------")
    println("\t\tREAJUSTE SALARIAL")
    println("---------------------------------${RESET}")
    print("Salário: R$ ")
    salario = readLine()!!.toFloatOrNull()?:0f
    print("Reajuste (%): ")
    reajuste = readLine()!!.toFloatOrNull()?:0f
    println()
    println("${AMARELO}---------- REAJUSTANDO ----------")
    println("O salário anterior era${RESET}${AZUL} R$ ${salario}${RESET}")
    println("${AMARELO}O aumento será de${RESET}${AZUL} ${reajuste}%${RESET}")
    println("E passará a ganha R$ ${salario+(salario * reajuste/100)}")
    println("---------------------------------")

}

/*
*     Exercício 7
*
*  -----------------------------
*       Reajuste Salarial
*  -----------------------------
*
*       Salário: R$  1000
*       Reajuste (%): 10
*
*   ---------- Reajustando  ----------
*   O salário anterior era R$ 1000,00
*   O aumento será de      10.0%
*   E passará a ganhar     R$ 1100,00
*   ---------------------------------------
*
* */