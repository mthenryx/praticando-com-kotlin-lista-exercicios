package model

class Exercicio19 {
    val contaBancaria = ContaBancaria()

    fun depositar(deposito: Double) {
        contaBancaria.depositarValor(deposito)
    }

    fun sacar(saque: Double) {
        contaBancaria.sacarValor(saque)
    }

    fun exibirSaldo() {
        contaBancaria.consultarSaldo()
    }
}