package model

class Exercicio16 {
    fun calcularFatorial() {
        var fatorial = 10
        var resultado = 1

        for (i in 1..fatorial) {
            resultado *= i
        }

        println(resultado)
    }
}
