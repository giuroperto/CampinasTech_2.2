// comunicar com o servidor
// recebe um cara que vai ter o redirecionamento da chamada
class Repositorio( val redirecionamento : Redirecionamento) {
    // parece redundante mas eh a arquitetura de quebrar bem

    fun irParaGoogle() {
        redirecionamento.irParaGoogle()
    }
}