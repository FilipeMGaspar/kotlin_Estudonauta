fun main(args: Array<String>) {
    /*
    *   Lendo Strings
    *   Val nome:String
    *   print("Qual é o seu nome: ")
    *   nome = readLine()
    * */


    println()
    print("Qual é o seu nome? ")
    val nome:String = readLine()!! // Null Check
    println("Quantos anos você tem, ${nome}? ")
    println()

}