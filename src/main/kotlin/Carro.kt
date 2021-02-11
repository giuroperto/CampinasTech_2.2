class Carro(val nome: String,
            val placa : String ) {

    var novo : Boolean = true

    // precisa chamar um construtor primario para utilizar o secundario
    constructor(nomeInserido : String,
                placaInserida: String,
                modeloNovo : Boolean) : this(nomeInserido, placaInserida) {
                    novo = modeloNovo
                }
}