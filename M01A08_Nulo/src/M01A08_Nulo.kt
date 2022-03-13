fun main(args: Array<String>) {
    var nome:Any?
    nome = null

    var a:Int?
    var b:Int

    a = 50
    b = a ?: 0  //coloca o valr de a se não for null senao coloca 0

    println("A vale : " + a)
    println("B vale : " + b)

    var x:Int?
    var n:Int

    x = null
    try {
        n = x!! // Tenta fazer, executar
    }catch (e: java.lang.NullPointerException){
        println("Deu problema mas estou a resolver!")
        n = 10;
    }finally {
        println("O valor de X é " + x)
        println("o valor de n é " + n)
    }




    /*
    *  ?  safe call
    *
    *  ?:  Operador Elvis
    *
    *  !!  null check
    * */
}