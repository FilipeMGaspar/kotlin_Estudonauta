import java.time.LocalDateTime
fun main(args: Array<String>) {
    /*
    *   Data e hora atuais
    * */
    var dh = LocalDateTime.now()

    println()
    println("Dia atual: ${dh.dayOfMonth}")
    println("Mês Atual: ${dh.monthValue}")
    println("Ano Atual: ${dh.year}")
    println("====================")
    println("Hora Atual: ${dh.hour}")
    println("Minuto Atual: ${dh.minute}")
    println("Segundo Atual: ${dh.second}")
}