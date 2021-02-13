package aula4.model

// classes ficam em model pois sao modelos

abstract class Calculadora {
    // metodo abstrato nao tem corpo, as classes que forem implementar esses metodos podem adapta-los
    // e apenas como se tivesse reservando esse espaco nessa funcao para ser implementada futuramente
    abstract fun calcular(x: Int, y : Int) : Int
}

// precisa importar/ implementar membros -> e fazer da maneira que quiser nessa classe
class Soma : Calculadora() {
    // override e para substituir com o metodo da forma que quiser
    override fun calcular(x: Int, y: Int): Int {
        return x + y
    }
}

class Subtracao : Calculadora() {
    // implementar o metodo calcular de maneiras diferentes -> aqui e realizada a subtracao e acima a soma
    // cada um implementa esse metodo a sua maneira, mas todos utilizam esse metodo
    override fun calcular(x: Int, y: Int): Int {
        return x - y
    }
}

class Divisao : Calculadora() {
    override fun calcular(x: Int, y: Int): Int {
        return x / y
    }
}

class Multiplicacao : Calculadora() {
    override fun calcular(x: Int, y: Int): Int {
        return x * y
    }
}