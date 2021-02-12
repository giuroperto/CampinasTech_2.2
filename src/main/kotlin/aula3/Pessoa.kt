package aula3

// quando temos atributos/ caracteristicas em comum -> temos heranca
// entao todos os atributos sao herdados dessa classe, e os especificos permanecem para outras classes

// para heranca em UML usava extends -> Java
// Kotlin usa dois pontos :
// para indicar que a superclasse, que pode ser herdada, tem que usar uma palavra reservada OPEN

// data class e para armazenar dados, portanto como vamos trabalhar com herancas, utilizamos apenas class

// superclasse e o topo -> a mae

// heranca no java nao permite heranca multipla -> heranca de mais de uma classe
// para trabalhar com heranca multipla -> interfaces
// java usa super para instanciar a classe pessoa

open class Pessoa(
    val nome: String,
    val cpf: String,
    val dataNascimento: String
) {
    fun falar() : String {
        return "Oi Mundo"
    }

    protected open fun twittar() : String {
        return "Hoje vou xingar muito no Twitter!"
    }
}

// classe abstrata -> nao podem ser instanciadas, serve como modelo para que outras classes herdem atributos e metodos dela
// nao podem ter corpo nos metodos, etc e as classes filhas herdam da sua maneira

// abstract class