package aula3

// precisa inicializar a classe mae e passar valores, por isso repetimos os dados na classe filha
// servirao como parametros para a classe pessoa e so sera instanciado mesmo o convenio Medico

data class Paciente(val nomePaciente: String,
               val cpfPaciente: String,
               val dataNascimentoPaciente: String,
               val convenioMedico : String) : Pessoa(nome = nomePaciente,
                                                    cpf = cpfPaciente,
                                                    dataNascimento = dataNascimentoPaciente) {
}