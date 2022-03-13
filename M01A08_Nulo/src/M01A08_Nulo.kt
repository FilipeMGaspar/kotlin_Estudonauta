fun main(args: Array<String>) {
    var nome:Any?
    nome = null

    var a:Int?
    var b:Int

    a = null
    b = a?:0  //coloca o valr de a se não for null senao coloca 0

    println("A vale : " + a)
    println("B vale : " + b)

    /*
    *  ?  safe call
    *
    *  ?:  Operador Elvis
    *
    *  !!  null check
    * */
}