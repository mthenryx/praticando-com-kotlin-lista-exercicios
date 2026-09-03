package model

class Exercicio14 {
    fun calcularTotalPreco() {
        val lista = arrayOf(100, 200, 3003, 3, 4, 9009)

        val maiorValor = lista.reduce { item1, item2 -> item1 + item2 }

        println(maiorValor)
    }
}