package aula4.model

// funciona como classe abstrata com metodos e atributos abstratos
// por ser interface nao precisa da palavra reservada abstract -> ja sabe que tudo la dentro e abstrato

// java nao permite trabalhar com heranca multipla mas podemos utilizar inumeras interfaces

// Tem super classe? sim. Tem uma ou mais superclasses (precisa de mais herancas)? Sim (certifique-se que sao duas, e nao redundancia, etc)
// Precisa priorizar uma superclasse -> a que tiver mais infos relevantes para o contexto
// A outra pode vir a ser uma Interface -> componentes e acoes sao frequentemente usados via interfaces
interface TouchScreen {
    // metodo abstrato -> sem corpo
    fun tocar() : String
}