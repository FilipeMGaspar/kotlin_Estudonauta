package m01a21_exercicios

import java.time.LocalDateTime

fun main(args: Array<String>) {
    var dataAtual = LocalDateTime.now()

    println(VERMELHO)
    println("----------------------------------------")
    println("\tANALISANDO O MÊS ATUAL")
    println("----------------------------------------${RESET}")
    println("${AMARELO}Estamos no mês${RESET}${AZUL}${dataAtual.monthValue} de ${dataAtual.year}${RESET}")
    println("${AMARELO}Esse mês está no${RESET}${AZUL}${((dataAtual.monthValue - 1) / 6) + 1}º semestre${RESET}")
    println("${ AMARELO}E pertense ao${RESET}${AZUL}${((dataAtual.monthValue - 1) / 3) + 1}º trimestre${RESET}")
    println("${AMARELO}----------------------------------------${RESET}")
}

/*
*
*     Exercício 11
*
*  -----------------------------
*       Analisando o Mês Atual
*  -----------------------------
*   Estamos no mês 1 de 2019
*   Esse mês está no 1º semestre
*   E está no 1º trimestre
*   ---------------------------------------
*
* */