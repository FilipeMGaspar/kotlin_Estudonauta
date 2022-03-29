fun main(args: Array<String>) {
    var v1 = 5
    var v2 = 8
    var v3 = 3
    var v4 = 2

    var res = v1 < v2 && v2 == v1 + v3

    println()
    println("O resultado da expressão é [$res]")

}

/*
    *   &&      Conjunção    AND
    *   ||      Disjunção    OR
    *    !      Negação      NOT
    *

*     Conjunção     AND (E)
*___________________________
*     A     B       A && B
* __________________________
*     V     V          V
*     V     F          F
*     F     V          F
*     F     F          F
*
*    Disjunção      (OR) OU
*___________________________
*     A     B       A || B
* __________________________
*     V     V          V
*     V     F          V
*     F     V          V
*     F     F          F
*
*    Negação        Not
*___________________________
*     A              !A
* __________________________
*     V               F
*     F               V
* */