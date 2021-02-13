package aula4.model

import java.lang.Error

interface ResponseListener {
    fun onSuccess(requisicao: String)

    fun onError(error: Error)
}