package model

class ContaBancaria {
    private var nomeTitular: String = "Matheus Henry"
    private var saldo: Double = 0.0

    fun depositarValor(deposito: Double) {
        if (deposito < 0) {
            println("O valor de $deposito é menor que 0, por isso não é possível fazer um deposito")
        } else {
            saldo = deposito + saldo
        }

        println("$nomeTitular você depositou $deposito e o valor atual da sua conta é $saldo")
    }

    fun sacarValor(sacar: Double) {
        var result: Double = 0.0

        if (sacar > 0) {
            result = sacar
        } else {
            result = sacar * 2
        }

        if (saldo <= 0) {
            println("$nomeTitular você está zerado")
        } else if (sacar > saldo) {
            println("$nomeTitular não é possível sacar um valor superior que você tem na conta")
        } else {
            saldo = saldo - result
            println("$nomeTitular você sacou $result e o valor atual da sua conta é $saldo")
        }
    }

    fun consultarSaldo() {
        println("$nomeTitular seu saldo atual é $saldo")
    }
}