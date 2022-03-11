fun main(args: Array<String>) {
    println("Minimo Byte: " + Short.MIN_VALUE)
    println("Máximo Byte: " + Short.MAX_VALUE)
    println("Tamanho Byte: " + Short.SIZE_BYTES + " bytes")

    println()
    var nome:String = "Gustavo"
    println(nome.length)
    println()

    var n1:Int = 10
    var n2 = 25F // Declaração por inferencia
    println(n1 is Int)
    println(n2 is Float) // is Verifica se um objeto é de uma determinada classe

    var x:Int // Qualquer tipo de dado deve ser evitado, utilizado em funções
    x = 20
    X = "Estudonauta"

}