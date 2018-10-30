package br.com.palestraspock.util


class CalculadoraInssTest {

    def 'Faixas de INSS são calculadas corretamente'() {
        expect:
        new CalculadoraInss(salario).getDesconto() == inss

        //começar com esse bloco
        where:
        salario | inss
        100     | inss * 0.05
        950     | 950 * 0.08
        2000    | 2000 * 0.11
        3500    | 3500 * 0.11
    }
}
