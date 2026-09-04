package model

class Exercicio20 {
    val funcionario = Funcionario()
    val gerente = Gerente()

    fun exibirSalarioFuncionario() {
        funcionario.exibirInformacoes()
    }

    fun exibirSalarioGerente() {
        gerente.exibirInformacoes()
    }
}