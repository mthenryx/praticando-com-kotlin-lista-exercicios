package model

class Exercicio18 {
    data class Produto(
        val nome: String,
        val preco: Double
    )

    val produtos = arrayOf(
        Produto("Arroz", 25.90),
        Produto("Feijão", 8.50),
        Produto("Macarrão", 5.99),
        Produto("Leite", 4.80)
    )

    fun exibirMaiorProduto() {
        var maiorValor = produtos[0]

        for (item in produtos) {
            if (item.preco > maiorValor.preco) {
                maiorValor = item
            }
        }

        println("O produto mais caro é ${maiorValor.nome} com um valor de ${maiorValor.preco}")
    }
}