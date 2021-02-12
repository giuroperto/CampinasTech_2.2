package aula3

// AULA 03 - HERANCA

// Quando eu devo utilizar heranca?
// ao abstrair coisas do mundo real, eu perceber que:
// posso agrupar caracteristicas e comportamentos
// ex: medico, paciente e enfermeiro tem nome, cpf e data de nascimento

fun main() {
    val paciente = Paciente(nomePaciente = "Giulia",
                            cpfPaciente = "000.000.000-00",
                            dataNascimentoPaciente = "01/01/1991",
                            convenioMedico = "xpto")

    println(paciente)
    println(paciente.falar())

    val medico = Medico(nomeMedico = "Henrique", cpfMedico = "abcd", dataNascimentoMedico = "xpto", crm = "xyz")

    println(medico.plantao())

    val func = Gerente(nomeGerente = "Jessica", salarioGerente = 10000.0, senha = "123")
    println(retornarFuncionario(func))

}