package aula4.model

abstract class InstrumentoMusical(val donoInstrumento: String,
                                  val valorInstrumento: Double) {
    // para propriedades/atributos comuns a todos -> passar por parametro

    // tudo que for abstrato sera substituido na classe que herdar -> ex Guitarra
    // tudo que for abstrato PRECISA ser reimplementado -> TUDO!

    //atributos abstratos
    abstract var possuiCordas : Boolean

    abstract fun emitirSom() : String

    abstract fun conectadoATomada() : Boolean

    // metodo nao abstrato -> no caso de metodos comuns a todos
    fun comprar() : String {
        return ("Compra realizada com sucesso!")
    }
}

class Guitarra(donoInstrumentoGuitarra: String,
               valorInstrumentoGuitarra: Double,
               possuiCordasGuitarra: Boolean) : InstrumentoMusical(donoInstrumento = donoInstrumentoGuitarra,
                                                                    valorInstrumento = valorInstrumentoGuitarra), TouchScreen, OutroExemplo {
    // ja vem por default com get e set, mas podemos substituir por
//    override var possuiCordas: Boolean
//        get() = TODO("Not yet implemented")
//        set(value) {}

    override var possuiCordas: Boolean = possuiCordasGuitarra
    override fun emitirSom(): String {
        return "TAAAAA"
    }

    override fun conectadoATomada(): Boolean {
        TODO("Not yet implemented")
    }

    override fun tocar() : String {
        return "TATAAAAAA"
    }

    override var atributoQualquer: Int = 0


}