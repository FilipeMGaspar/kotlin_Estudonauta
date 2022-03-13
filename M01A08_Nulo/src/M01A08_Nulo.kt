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
    n = x!!

    println("A vale : " + x)
    println("B vale : " + n)
    
    /*
    *  ?  safe call
    *
    *  ?:  Operador Elvis
    *
    *  !!  null check
    * */
}