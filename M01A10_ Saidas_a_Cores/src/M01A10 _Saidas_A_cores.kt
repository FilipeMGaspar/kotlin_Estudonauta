fun main(args: Array<String>) {
    /*
    *   \u001B[00m   RESET
    *   \u001B[30m   PRETO
    *   \u001B[31m   VERMELHO
    *   \u001B[32m   VERDE
    *   \u001B[33m   AMARELO
    *   \u001B[34m   AZUL
    *   \u001B[35m   MAGENTA
    *   \u001B[36m   CIANO
    *   \u001B[37m   BRANCO
    *
    * */

    //Códigos para Cores
    val PRETO:String = "\u001B[30m"
    val RESET:String = "\u001B[00m"
    val AMARELO:String = "\u001B[33m"


    println("\n")
    println("${AMARELO}Olá${RESET}, Mundo!")
}