package aula4

// importanto todas as classes do modelo -> pois como se encontram em files e pastas diferentes, devemos importar para conseguir utilizar
import aula4.model.*

// mesmo comportamento, mesmo atributo, mas implementado de formas diferentes -> polimorfismos
// polimorfismo -> conceito e nao implementacao
// classe abstrata e um exemplo

fun main() {
    var add: Calculadora = Soma()
    var resultAdd = add.calcular(2, 2)

//    println(resultAdd)

    var divide: Calculadora = Divisao()
    var resultDivide = divide.calcular(2, 2)

//    println(resultDivide)

    var multiply: Calculadora = Multiplicacao()
    var resultMultiply = multiply.calcular(2, 2)

//    println(resultMultiply)

    var subtraction: Calculadora = Subtracao()
    var resultSubtraction = subtraction.calcular(2, 2)

//    println(resultSubtraction)

    val guitarra = Guitarra(donoInstrumentoGuitarra = "Chimbinha", valorInstrumentoGuitarra = 4000.0, possuiCordasGuitarra = true)
//    println(guitarra.donoInstrumento)
//    println(guitarra.valorInstrumento)
//    println(guitarra.possuiCordas)
//    println(guitarra.emitirSom())
//    println(guitarra.comprar())

    // vindos de uma interface
//    println(guitarra.atributoQualquer)
//    println(guitarra.tocar())

    // exemplo de implementacao somente interface + heranca (heranca multipla)
    val flauta = Flauta(vendedor = "MC Fioti", valor = 100.0, possuiCordas = false)
    println(flauta.possuiCordas)
    println(flauta.valor)
    println(flauta.emitirSom())
    println(flauta.vendedor)

    val listaFlauta : List<Flauta> = listOf(Flauta(vendedor = "Mc Fioti", valor = 100.0, possuiCordas = false),
        Flauta(vendedor = "Mc Fioti", valor = 100.0, possuiCordas = false),
        Flauta(vendedor = "Mc Fioti", valor = 100.0, possuiCordas = false))

    // acessando dado da lista
    listaFlauta[1].emitirSom()



}