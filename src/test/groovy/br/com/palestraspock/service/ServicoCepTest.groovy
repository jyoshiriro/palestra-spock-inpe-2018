package br.com.palestraspock.service

import br.com.palestraspock.servico.ClienteRestCep
import br.com.palestraspock.servico.ServicoCep
import spock.lang.Specification

class ServicoCepTest extends Specification {

    ClienteRestCep clienteRest = Mock()
	
    def 'Deve retornar o logradouro encontrado'() {
        given:
        def logradouro = 'Rua da Abobrinha'

        clienteRest.getLogradouro(_) >> logradouro

        def servico = new ServicoCep(cliente: clienteRest)

        when:
        def encontrado = servico.pesquisaLogradouro('04259688')

        then:
        encontrado == 'Rua de Abobrimha'
    }

    def 'Deve retornar mensagem de erro para falha de comunicação'() {
        given:
        clienteRest.getLogradouro(_) >> {
            throw new IllegalStateException()
        }
        def servico = new ServicoCep(cliente: clienteRest)

        when:
        def encontrado = servico.pesquisaLogradouro('04259688')

        then:
        encontrado == "Falha de internet ou serviço indisponível"
    }
}
