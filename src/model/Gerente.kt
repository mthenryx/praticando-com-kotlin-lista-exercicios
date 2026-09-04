package model

class Gerente: Funcionario() {
    override fun exibirInformacoes(){
        val novoSalario = salario + (salario * 0.2)
        println("$nome seu salário agora como gerente é $novoSalario")
    }
}