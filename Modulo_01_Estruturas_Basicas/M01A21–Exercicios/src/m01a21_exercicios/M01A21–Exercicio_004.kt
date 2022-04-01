package m01a21_exercicios

fun main(args: Array<String>) {

    var val1:Int
    var val2:Int

    println()
    println("${VERMELHO}-----------------------------------------")
    println("\t\t\tDOIS VALORES")
    println("-----------------------------------------${RESET}")
    print("Valor 1: ")
    val1= readLine()!!.toIntOrNull()?:0
    print("Valor 2: ")
    val2 = readLine()!!.toIntOrNull()?:0

    println("${AMARELO}\n--------------- RESULTADOS ---------------")
    println("Soma: ${RESET} ${AZUL} \t\t\t ${val1} + ${val2} = ${RESET} ${MAGENTA} ${val1 + val2} ${RESET}")
    println("${AMARELO}Subtração: ${RESET} ${AZUL} \t\t ${val1} - ${val2} = ${RESET} ${MAGENTA} ${val1 - val2} ${RESET}")
    println("${AMARELO}Multiplicação: ${RESET} ${AZUL}\t ${val1} * ${val2} = ${RESET} ${MAGENTA} ${val1 * val2} ${RESET}")
    println("${AMARELO}Divisão: ${RESET} ${AZUL} \t\t ${val1} / ${val2} = ${RESET} ${MAGENTA} ${val1.toFloat() / val2.toFloat()} ${RESET}")
    println("${AMARELO}Módulo: ${RESET} ${AZUL} \t\t\t ${val1} % ${val2} = ${RESET} ${MAGENTA} ${val1 % val2} ${RESET}")
    println("${AMARELO}------------------------------------------${RESET}")
}

/*
*     Exercício 4
*
*  -----------------------------
*        Dois Valores
*   -----------------------------
*
*       Valor 1: 7
*       Valor 2: 3
*
*   ---------- Ficha Funcional  ----------
*   Soma:           7 + 3 = 10
*   Subtração:      7 - 3 = 4
*   Multiplicação:  7 * 3 = 21
*   Divisão:        7 / 3 = 2.3333
*   Módulo:         7 % 3 = 1
*   ---------------------------------------
* */