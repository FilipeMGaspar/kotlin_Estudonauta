fun main(args: Array<String>) {
    /* Regras de nomeação das variaveis em KOTLIN

        Começa com uma letra ou sublinhado
        Maiúsculas e minúsculas fazem diferença
        Só usa letras, números e sublinhado
        Podemos utilizar acentos
        Não pode   conter espaço
        Não pode ter símbolos (só sublinhado)
        não pode ser uma palavra reservada

    * */

    var nome:String =  "Gustavo"
    var idade:Short = 40
    var peso:Float = 95.8F //Float termina com F
    var numGrande:Long = 5_000_000L //Long termina co L

    print("O seu nome é ")
    print(nome)
    print(", e tenho ")
    print(idade)
    print(" anos!")
 }