package br.com.palestraspock.util

import spock.lang.Specification


class CalculadoraInssTest extends Specification {

    def 'Salário de 0 não deve ter desconto'() {
        given:
        def salario = 0

        when:
        def desconto = new CalculadoraInss(salario).getDesconto()

        then:
        desconto == 0
    }

    def 'Salário de 1000 deve ter desconto de 50'() {
        given:
        def salario = 1000

        when:
        def desconto = new CalculadoraInss(salario).getDesconto()

        then:
        desconto == 50
    }

    def 'Salário não pode ser menor que 0'() {
        given:
        def salario = -1

        when:
        new CalculadoraInss(salario)

        then:
        thrown(IllegalArgumentException)
    }

    def 'Faixas de INSS são calculadas corretamente'() {
        expect:
        new CalculadoraInss(salario).getDesconto() == inss

        where:
        salario | inss
        0       | 0
        1000    | 50
        2000    | 200
        4000    | 800
    }
}
