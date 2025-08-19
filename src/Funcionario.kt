import java.math.BigDecimal

class Funcionario(
     nome: String,
     idade: Int,
     cpf : Long,
     endereco : String,
     sexo : String,
    val funcao : String,
    val experiencia : Int,
    val habilidade : String,
    val salario : BigDecimal,
    val setor : Setor

    ) : Pessoa (
        nome = nome,
        idade = idade,
        cpf = cpf,
        endereco = endereco,
        sexo = sexo,

    )