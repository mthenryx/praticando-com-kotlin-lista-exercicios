package model

class Exercicio17 {
    fun exibirDados() {
        var pessoa = mapOf(
            "Nome" to "Matheus",
            "Idade" to 17,
            "Cidade" to "Osasco"
        )

        println("${pessoa["Nome"]} tem ${pessoa["Idade"]} e mora na cidade de ${pessoa["Cidade"]}")
    }
}