//AULA 2 - Classes

fun main() {
    // criar objeto em JAVA
    // tipo da classe, variavel. New -> criacao do objeto a partir da classe e os valores a serem passados
    // Livro harryPotter = new Livro("", ""...);
    var harryPotter = Livro("Harry Potter e a Pedra Filosofal",
        200,
        "J. K. Rowling",
        "Saraiva",
        true)

    var senhorDosAneis = Livro("A sociedade do anel",
        1000,
        "J. R. R. Tolkien",
        "Saraiva",
        true)

    println(harryPotter)
    // equivalente ao get -> implicito
    println(harryPotter.titulo)
    // equivalente ao set -> implicito
    senhorDosAneis.titulo = "Alo"
    // caso tenha alguma propriedade privada, nao consegue ver fora da classe
    // para que a propriedade fosse vista fora, deveria criar um metodo que acessasse

    // temos os named arguments -> passa o nome do argumento e o valor, assim nao eh preciso escrever na ordem dos parametros

    val resultado = Soma(2,3).somar()

    // mesma classe, mas instanciadas de maneiras diferentes
    val carro1 = Carro(nome = "ABC", placa = "XPTO")
    val carro2 = Carro(nomeInserido = "DEF", placaInserida = "ABCD", modeloNovo = true)

    // so exibe de forma completa no log se for uma data class!
    println(carro1)

    val tipo = EnumTiposPokemon.FOGO
    // estrutura de decisao when
    val mensagem = when(tipo) {
        EnumTiposPokemon.AGUA -> "Vai nadar"
        EnumTiposPokemon.DRAGAO -> "Queimou a cidade toda"
        else -> "Precisamos decidir..."

    }
}