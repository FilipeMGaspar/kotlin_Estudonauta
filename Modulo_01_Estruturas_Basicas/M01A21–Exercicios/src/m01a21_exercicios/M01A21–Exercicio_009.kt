package m01a21_exercicios

fun main(args: Array<String>) {
    var palpite:Int

    println(VERMELHO)
    println("------------------------------------")
    println("\t\tTENTE ADIVINHAR")
    println("------------------------------------${RESET}")
    println("${AZUL}Vou \"Pensar\" em um número entre 0 e 5"${RESET}")
    print("O seu palpite : ")
    palpite = readLine()!!.toIntOrNull()?:0
}

/*
*     Exercício 9
*
*  -----------------------------
*       Tente Adivinhar
*  -----------------------------
*   Vou "pensar" em um número entre 0 e 5
*   Seu palpite: 1
*
*   ---------- Resultados  ----------
*   você disse que seria o valor 1
*   Eu pensei no número 3
*   A diferença foi de 2
*   ---------------------------------------
* */