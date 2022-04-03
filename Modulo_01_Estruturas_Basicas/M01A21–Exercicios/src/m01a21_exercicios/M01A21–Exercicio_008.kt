package m01a21_exercicios

fun main(args: Array<String>) {

    var valorSacar:Int
    var valorRestante:Int = 0
    var notas50:Int
    var notas10:Int
    var notas2:Int
    var moeda1:Int

    println(VERMELHO)
    println("------------------------------------")
    println("\t\tBANCO ESTUDONAUTA")
    println("------------------------------------${RESET}")

    print("Que valor você quer sacar? R$ ")
    valorSacar = readLine()!!.toIntOrNull()?:0

    notas50 = valorSacar / 50

    valorRestante = valorSacar - notas50 * 50
    notas10 = valorRestante / 10

    //println("Valor restante ${valorRestante}")
    //valorRestante = valorSacar - valorRestante * 10
    //println("Valor restante ${valorRestante}")
    notas2 = valorRestante / 2

    moeda1 = (valorSacar - (notas50 *50 + notas10 * 10 + notas2 * 2)) / 1

    println()
    println("${ AMARELO}--------- SAQUE REALIZADO ---------${RESET}")
    println("${AMARELO}R$50,00\t\t=${RESET}${AZUL}${notas50} ${RESET}")
    println("${AMARELO}R$10,00\t\t=${RESET}${AZUL}${notas10} ${RESET}")
    println("${AMARELO}R$2,00\t\t=${RESET}${AZUL}${notas2}")
    println("${AMARELO}R$1,00\t\t=${RESET}${AZUL}${moeda1} ${RESET}")
    println("${AMARELO}------------------------------------${RESET}")
}

/**
 *
 *     Exercício 8         Somente 50, 10, 2, 1
 *
 *  -----------------------------
 *       Banco Estudonauta
 *  -----------------------------
 *
 *       Que valor você quer sacar? R$ 1235
 *
 *   ---------- saque realizado  ----------
 *   R$50,00      =  24  cédula(s)
 *   R$10,00      =  3   cédula(s)
 *   R$2,00       =  2   cédula(s)
 *   R$1,00       =  1   moeda(s)
 *   ---------------------------------------
 *
 **/