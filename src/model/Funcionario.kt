package model

open class Funcionario {
    val nome: String = "Matheus Henry"
    val salario: Double = 100.0

    open fun exibirInformacoes() {
        println("$nome seu salário como funcionario é $salario")
    }
}