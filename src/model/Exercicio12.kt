package model

class Exercicio12 {
    fun contador() {
        val iniciador: Int = 100
        var i: Int = 1

        while (i <= iniciador) {
            if (i % 3 == 0 && i % 5 == 0) {
                println("BatataQuente")
            } else if (i % 5 == 0) {
                println("Quente")
            } else if (i % 3 == 0) {
                println("Batata")
            } else {
                println(i)
            }

            i++
        }
    }
}