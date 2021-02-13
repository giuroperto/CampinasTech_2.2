package aula4.model

interface Instrumento {
    val possuiCordas : Boolean

    fun emitirSom() : String
}