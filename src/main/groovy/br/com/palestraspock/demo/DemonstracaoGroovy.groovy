package br.com.palestraspock.demo

class DemonstracaoGroovy {

    static void main(String[] args) {
		def bairro = 'copacabana'

        def consulta = """
        select * from minha_tabela
        where campo1 > 10
        order by campo2 desc
        """
		
        println("O bairro ${bairro} é mó da hora!")
		
        def frutas = ['Mamão','Abacaxi','Banana']
        frutas.sort()
        println(frutas)

        def comx = frutas.findAll{ it.contains('x') }
        println(comx)

        def usuarios = [new Usuario(email:'HAHAHA@gmail.com'), new Usuario(email: 'emailoko@inpe.br')]

        usuarios*.corrigirEmail()
        println(usuarios*.getEmail())

        usuarios.sort{it.email}
        println(usuarios*.getEmail())

        def capitais = [SP:'São Paulo', RJ:'Rio de Janeiro', MG:'Belo Horizonte']
		
        println("Capital de São Paulo: ${capitais.SP}")

        println("Digite uma palavra: ")
        def palavra = new Scanner(System.in).next()
		
        if (palavra == 'amor') {
            println('Só o amor constrói')
        } else {
            println('Deu ruim no amor')
        }
    }
}

class Usuario {

    String email

    void corrigirEmail() {
        email = email.toLowerCase()
    }
}