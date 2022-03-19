fun main(args: Array<String>) {
// String interpoladas
    val ano = 2022  //Constante
    val nasc = 1985

    println("você nasceu em $nasc e hoje estamos em $ano então você tem ${ano - nasc} anos de idade!")

    println()

    println("""
       Olá! Tudo bem!
       você nasceu em $nasc, certo?
       E atualmente estamos em $ano
       Logo, fazendo as contas, você
       faz ${ano - nasc} anos até ao fim do ano de $ano        
    """)

/*
//Strings cruas
    println("""
       Menu Principal
         [1] Menu
         [2] Editar
         [3] Formatar
         [4] ....
    """)
*/

/*  println("Menu principal")
    println("[1]  Novo")
    println("[2]  Editar")*/
}