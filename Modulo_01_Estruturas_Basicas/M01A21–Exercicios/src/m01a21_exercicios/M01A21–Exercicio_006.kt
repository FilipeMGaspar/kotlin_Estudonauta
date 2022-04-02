package m01a21_exercicios

fun main(args: Array<String>) {
    var base:Int
    var expoent:Int

    println(VERMELHO)
    println("----------------------------------------")
    println("\t\t CÁCULO DE POTÊNCIA")
    println("----------------------------------------${RESET}")
    print("Base: ")
    base = readLine()!!.toIntOrNull()?:0
    print("Expoênte: ")
    expoent = readLine()!!.toIntOrNull()?:0
    println()
    println("${AMARELO}---------- Resultados ---------${RESET}")
    println("${AMARELO}Calculando${RESET}${AZUL} ${base}${RESET}${AMARELO} elevado a${RESET}${AZUL} ${expoent} ${RESET}")
    println("")
    println("${AMARELO}-------------------------------${RESET}")
}

/*
  Exercício 6
*
*  -----------------------------
*       Cálculo de Potência
*  -----------------------------
*
*       Base: 5
*       Expoente: 2
*
*   ---------- Resultados  ----------
*   Calculando 5 elevado a 2
*   O resultado é 25.0
*   ---------------------------------------
* */