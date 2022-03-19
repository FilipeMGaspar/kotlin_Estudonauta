fun main(args: Array<String>) {
    print("Digite um valor: ")
    val n1:Int = readLine()!!.toIntOrNull() ?: 0
    print("Digite outro valor: ")
    val n2 = readLine()!!.toIntOrNull() ?: 0
    val soma = n1 + n2 // Soma de dois números

    println()
    print("A soma de $n1 com $n2  tem o valor de $soma")
}