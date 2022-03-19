fun main(args: Array<String>) {
    print("Qual é o seu nome? ")
    val nome:String = readLine()!! //Utilização do NullCheck !!
    print("Quantos anos você tem. ${nome}")
    val idade:Int = readLine()!!.toIntOrNull() ?: 0 // Do operador Elvis ?: para o caso do o dado recebido ser diferente do esperado, vai ser atribuido 0
    print("Finalizando, $nome tem $idade anos!")
}