fun main(args: Array<String>) {
    /*
    *   Lendo Strings
    *   Val nome:String
    *   print("Qual é o seu nome: ")
    *   nome = readLine()
    * */


    println()
    print("Qual é o seu nome? ")
    var nome:String = readLine()!! // Null Check
    println("Olá ${nome}, seja bem vindo!")
    println()

}