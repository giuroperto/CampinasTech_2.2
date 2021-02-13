package aula4.model

import java.lang.Error

// para genericos -> interface
// essas implementacoes podem ser usadas throughout the app... nao especificamente em um caso apenas
// relacao generica -> acontece em varios lugares -> potencial interface

class Requisicao : ResponseListener {
    override fun onSuccess(requisicao: String) {
        println("Sucesso!")
    }

    override fun onError(error: Error) {
        println("ERRO!!!")
    }
}