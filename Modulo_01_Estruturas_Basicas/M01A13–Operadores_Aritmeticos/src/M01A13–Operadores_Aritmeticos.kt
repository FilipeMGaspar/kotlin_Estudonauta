fun main(args: Array<String>) {
    /*
        operadores aritméticos, em Kotlyn antes da compilação são convertidos em métodos
                                            Métodos

        +   Soma                            .plus()
        -   Subtração                       .minus()
        *   Multiplicação                   .times()
        /   Divisão                         .div()
        %   Resto da divisão inteira        .mod()
                        OU
        %   Resto da divisão inteira        .ram()

    * */

    val n1:Int = 5
    val n2:Int = 2

    println()
    println("$n1 + $n2 = ${n1 + n2} ")
    println("$n1 - $n2 = ${n1 - n2} ")
    println("$n1 X $n2 = ${n1 * n2} ")
    println("$n1 / $n2 = ${n1.toFloat() / n2} ")
    println("$n1 % $n2 = ${n1 % n2} ")

    /*
    numa divisão

        Int/Int = Int
        Float/Int = Float
        Int/Float = Float
        Float/Float = Float
    * */
}
