package m01a21_exercicios

import java.time.LocalDateTime

fun main(args: Array<String>) {
    var anoNascimento:Int

    var dataAtual = LocalDateTime.now()

    println(VERMELHO)
    println("------------------------------")
    println("\t\tSUA IDADE")
    println("------------------------------${RESET}")
    println("${AZUL}Vou conseguir descobrir a sua idade${RESET}")
    print("Em que ano você nasceu? ")
    anoNascimento = readLine()!!.toIntOrNull()?:0
}

/*
*
*     Exercício 10
*
*  -----------------------------
*       Sua idade
*  -----------------------------
*   Vou conseguir descobrir a sua idade
*   em que ano você nasceu? 2000
*
*   ---------- Resultados  ----------
*   Atualmente estamos em 2019
*   Você, que nasceu em 2000
*   Completa 19 anos neste ano.
*   ---------------------------------------
*
* */