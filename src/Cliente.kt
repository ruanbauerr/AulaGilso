class Cliente(
     nome : String,
    idade : Int,
     cpf : Long,
     endereco : String,
     sexo : String,
    val pedidos : Array<String>
)  : Pessoa (
    nome = nome,
    idade = idade,
    cpf = cpf,
    endereco = endereco,
    sexo = sexo,

)