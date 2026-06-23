

fun main() {
    // Caso 1: IF ELSE
    val numero = 10
    if (numero > 5) {
        println("O número é maior que 5")
    } else {
        println("O número é menor ou igual a 5")
    }

    // Caso 2: WHEN
    val dia = 3
    val resultado = when (dia) {
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> "Dia inválido"
    }
    println("O dia da semana é: $resultado")

    // Caso 3: FOR
    for (i in 1..5) {
        println("Número: $i")
    }


    // Caso 4: Exibir todos os itens de um array
    val numeros = arrayOf(1, 2, 3, 4, 5)
    for (numero in numeros) {
        println("Número do array: $numero")
    }

    // Caso 5: Exibir o 6º elemento do array (se existir)
    if (numeros.size >= 6) {
        println("O 6º elemento do array é: ${numeros[5]}")
    } else {
        println("Não há 6º elemento no array.")
    }

    // Caso 6: Usando While para exibir números de 1 a 5
    var i = 1
    while (i <= 5) {
        println("Número com While: $i")
        i++
    }

    // Caso 7: Função de soma
    val calculadora = Calculadora()
    val soma = calculadora.soma(5, 3)
    println("Soma: $soma")

    // Caso 8: Função de subtração
    val subtracao = calculadora.subtracao(5, 3)
    println("Subtração: $subtracao")

    // Caso 9: Função de multiplicação
    val multiplicacao = calculadora.multiplicacao(5, 3)
    println("Multiplicação: $multiplicacao")

    // Caso 10: Função de divisão
    val divisao = calculadora.divisao(5, 3)
    println("Divisão: $divisao")
}

// Soma, subtração, multiplicação e divisão
class Calculadora {
    fun soma(a: Int, b: Int): Int {
        return a + b
    }

    fun subtracao(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplicacao(a: Int, b: Int): Int {
        return a * b
    }

    fun divisao(a: Int, b: Int): Double {
        return if (b != 0) a.toDouble() / b else Double.NaN
    }
}
