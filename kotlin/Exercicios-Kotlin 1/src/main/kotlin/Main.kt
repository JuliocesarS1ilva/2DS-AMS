
//Exercícios 1 e 2
fun main() {
    var nome = "Julio"
    println("Meu nome é $nome")




    //Exercício 3

    val a = 90
    val b = 40

    val multi = a * b
    val divis = a / b
    val soma = a + b
    val subtra = a - b

    println("Soma: $soma" + ", " + "subtração: $subtra" + ", " + "divisão: $divis" + ", " + "multiplicação: $multi")




 //Exercício 4

    val z = 90
    val y = 40

    val areaRetangulo = z * b

    println("A área do retângulo é: $areaRetangulo")




    //Exercício 5

    fun exibirMensagem(mensagem: String) {
        println(mensagem)
    }


        exibirMensagem("Toma uma mensagem na sua tela XD")





    //Exercício 6


        val arrayInt :Array<Int> = arrayOf(1, 2, 3, 4)

        //passando o índice 2 para acessar o valor da posição 2 do array

        val x = arrayInt[2]
        println(x)

        //na prática, ele vai mostrar o número 3, porque dentro do Array, os elementos são lidos como "0, 1, 2, 3"




        //Exercício 7

        val lista = mutableListOf(1, 2, 3, 4) //esse "mutable" serve para alterar os valores da lista mesmo sendo uma variável imutável
        lista.add(5)

        println(lista)




        //Exercício 8

        val senha = "123"

        if(senha == "123"){
            println("Acesso concedido")
        } else {
            println("Senha incorreta")
        }




        //Exercício 9

        val c = 10
        val d = 5

        if(c > d){
            println("$c é maior que $d")
        } else {
            println("$c é menor que $d")
        }




        //Exercício 10

        val lista2 = listOf(1, 2, 3, 4)

        for (i in lista2) {
            println("Item: $i")
        }

    }