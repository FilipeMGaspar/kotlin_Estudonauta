package m01a21_exercicios

import java.lang.Math.random

fun main(args: Array<String>) {
    var palpite:Int
    var numPensado:Int = (0..5).random()
    var diferenca:Int

    println(VERMELHO)
    println("------------------------------------")
    println("\t\tTENTE ADIVINHAR")
    println("------------------------------------${RESET}")
    println("${AZUL}Vou \"Pensar\" em um número entre 0 e 5${RESET}")
    print("O seu palpite : ")
    palpite = readLine()!!.toIntOrNull()?:0

    diferenca = palpite - numPensado

    println()
    println("${AMARELO}------------- RESULTADOS -------------")
    println("Você disse que seria o valor${RESET} ${AZUL}${palpite}${RESET}")
    println("${AMARELO}Eu pensei no número${RESET} ${MAGENTA}${numPensado}${RESET}")
    println("${AMARELO}A diferença foi de${RESET} ${VERDE}${diferenca}${RESET}")
    println("${AMARELO}--------------------------------------${RESET}")
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