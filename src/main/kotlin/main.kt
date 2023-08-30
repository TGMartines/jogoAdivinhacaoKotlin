import kotlin.random.Random

fun main() {
    var min = 1
    var max = 100
    var acertou = false

    println("Pense em um número de 1 à 100.")
    while(!acertou) {
        var numeroAdivinhado = Random.nextInt(min, max + 1)
        println("Eu adivinho: $numeroAdivinhado. Acertei (a), o número correto é maior (+), o número correto é menor (-).")
        var resposta = readLine()
        when(resposta) {
            "a" -> {
                acertou = true
                println("Ahaaaaaa, eu sabia! Adivinhei.")
            }
            "+" -> min = numeroAdivinhado + 1
            "-" -> max = numeroAdivinhado - 1
            else -> println("Opção inválida!")
        }
    }
}