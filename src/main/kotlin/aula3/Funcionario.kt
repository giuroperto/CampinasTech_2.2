package aula3

// sealed class so existe nesse contexto, nao precisa criar inumeros arquivos
// nao eh ma pratica criar varias classes no mesmo arquivo
// restringe todos o uso da classe no arquivo -> so quem tiver dentro desse file pode acessar -> restringir ainda mais o codigo

// nao existe uma boa pratica, uma regra para implementacao e sim o bom senso
// caso exista classes com diversos metodos, regras de negocio complexas, diversos atributos, cogite em separa-los
// e nao coloca-los em uma sealed class
sealed class Funcionario(val nome : String, val salario : Double)

class Gerente(nomeGerente : String,
              salarioGerente :Double,
              val senha : String) : Funcionario (nome = nomeGerente, salario = salarioGerente)

// como sao passagem de parametros, o val e opcional, entao para demonstrar que sao parametros seria interessante deixar sem o val
// como vamos passar para a classe pai, pode ficar sem o val
class Vendedor(nomeVendedor : String,
               salarioVendedor : Double,
               val comissao : String) : Funcionario(nome = nomeVendedor, salario = salarioVendedor)

// tem como parametro um funcionario do tipo Funcionario (classe)
fun retornarFuncionario(funcionario: Funcionario) : String {
    return when (funcionario) {
        // compara se o objeto funcionario eh da classe gerente
            // usando is ele converte para a classe/tipo -> ex Gerente -> ai tem acesso a tudo que e do vendedor
        is Gerente -> "Esse cara e um gerente ${funcionario.nome}"
        is Vendedor -> "Esse cara e um vendedor"
        else -> "Esse cara sou eu"
    }
}

// as para conversao de casting
// is casting para comparar se e do mesmo tipo/classe