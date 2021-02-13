package aula4.model

sealed class Produto(val vendedor: String, val valor: Double)

class Flauta(vendedor: String, valor: Double, possuiCordas: Boolean) : Produto(
    vendedor = vendedor,
    valor = valor
), Instrumento {
    override val possuiCordas: Boolean = possuiCordas

    override fun emitirSom(): String {
        return "Fluuuu"
    }

}