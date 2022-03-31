package m01a21_exercicios

fun main(args: Array<String>) {
    println(VERMELHO)
    println("------------------------------------")
    println("\t\tCADASTRO ESTUDONAUTA")
    println("------------------------------------")
    print(RESET)
    print("Nome do Funcionário: ")
    var nome:String = readLine()!!
    print("Ano de Nascimento: ")
    var anoNascimento:Int = readLine()!!.toIntOrNull()?:0
    print("Salário: R$ ")
    var salario:Float = readLine()!!.toFloatOrNull()?:0f
    println(AMARELO)
    println("--------- FICHA FUNCIONAL ---------")
    println("Nome:${RESET}\t\t\t ${CIANO} ${nome} ${RESET}")
    println("${AMARELO}Nascimento:${RESET}\t\t ${CIANO} ${anoNascimento} ${RESET}")
    println("${AMARELO}Salário:${RESET}\t\t ${CIANO} ${salario} ${RESET}")

    println("${AMARELO}-----------------------------------")
    print(RESET)
}

/*
*   Ecercício 3
*
*   -----------------------------
*        Cadastro Estudonauta
*   -----------------------------
*       Nome de Funcionário: João da Silva
*       Ano de Nascimento: 2003
*       Salário: R$ 1525
*
*   ---------- Ficha Funcional  ----------
*   Nome:           João da Silva
*   Nascimento:     2003
*   Salário:        R$ 1525,00
*   ---------------------------------------
 */