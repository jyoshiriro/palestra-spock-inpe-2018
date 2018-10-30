package br.com.palestraspock.demo

class DemonstracaoGroovy {

    static void main(String[] args) {
		def bairro = ''

        def consulta = """
        select * from minha_tabela
        where campo1 > 10
        order by campo2 desc
        """
		
        println("O bairro ${bairro.toUpperCase()} é mó da hora!")
		
        def frutas = ['mamão','abacaxi','banana']
        frutas.sort()
        println(frutas)
		
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
