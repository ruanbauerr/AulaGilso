import entidades.Funcionario
import entidades.Servico
import enumeradores.Setor
import enumeradores.Sexo

fun main() {
    println("Hello World!")

    val instalacao: Servico = Servico(
        valorDoservico = "800.50".toBigDecimal(),
        ferramentas = "serra de cano",
        funcionarios = Funcionario(
            nome = "joao",
            idade = 34,
            cpf = 113200000000007,
            endereco = "Francisco Beltrao",
            sexo = Sexo.MASCULINO,
            funcao = "encanador",
            experiencia = 10,
            habilidade = "Instalar caixa d'agua",
            salario = "2000".toBigDecimal(),
            setor = Setor.MONTAGEM

        ),
        tempo = 2.30,
        dataInstalacao = "13/08/2025",
        localInstalacao = "Francisco Beltrao",
        cliente = "Unipar",
        notaServico = 8.9,
    )

}