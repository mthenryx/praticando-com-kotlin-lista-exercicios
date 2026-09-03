package model

class Exercicio15 {
    fun calcularMediaIdade(): Int {
        val listaIdades = arrayOf(18, 12, 30, 11, 8, 90)
        val listaMaioresDeIdade = mutableListOf(0)

        for (idade in listaIdades) {
            if (idade >= 18) {
                listaMaioresDeIdade.add(idade)
            }
        }

        val valorTotal = listaMaioresDeIdade.reduce { item1, item2 -> item1 + item2 }
        val quantidade = listaIdades.size
        val result = valorTotal / quantidade
        return result
    }
}