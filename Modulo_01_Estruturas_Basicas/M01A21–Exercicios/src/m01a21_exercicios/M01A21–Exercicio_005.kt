package m01a21_exercicios

fun main(args: Array<String>) {
    var nota1:Float
    var nota2:Float

    println("${VERMELHO}--------------------------------------")
    println("\tNOTAS ESTUDONAUTA")
    println("--------------------------------------${RESET}")
    print("Nota 1: ")
    nota1 = readLine()!!.toFloatOrNull()?:0f
    print("Nota 2: ")
    nota2 = readLine()!!.toFloatOrNull()?:0f
    println("${AMARELO}------------ RESULTADOS ----------------")
    println("As notas do aluno foram${RESET}${MAGENTA} ${nota1}${RESET}${AMARELO} e${RESET}${MAGENTA} ${nota2}${RESET}")
    println("${AMARELO}----------------------------------------${RESET}")
}

/*
*     Exercício 5
*
*  -----------------------------
*        Notas Estudonauta
*   -----------------------------
*
*       Nota 1: 7.5
*       Nota 2: 2
*
*   ---------- Resultados  ----------
*   As notas do aluno foram 7.5 e 2.0
*   A média final foi 4.75
*   ---------------------------------------
 */