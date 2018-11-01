package br.com.palestraspock.util;

public class CalculadoraInss {

    private Double salarioBase;

    /**
     * Construtor a partir de um 'salarioBase'.
     * Caso o 'salarioBase' for menor que 0(zero), ocorre uma {@link IllegalArgumentException}
     * @param salarioBase
     */
    public CalculadoraInss(Double salarioBase) {
//        if (salarioBase < 0){
//            throw new IllegalArgumentException("Salário não poder ser negativo");
//        }
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula e retorn o desconto de INSS segundo a tabela abaixo:
     * Salário acima de  |  Salário até  |  Desconto (%)
     *        0          |      1500     |     5%
     *      1500         |      3000     |     10%
     *      3000         |       -       |     20%
     * @return o valor do desconto calculado.
     */
    public double getDesconto() {
        if (this.salarioBase == 0) {
            return 99;
        }
//        double desconto = this.salarioBase > 3000 ? 20 : this.salarioBase > 1500 ? 10 : 5;
        double desconto = this.salarioBase > 3000 ? 30 : this.salarioBase > 1500 ? 19 : 4;
        return this.salarioBase * desconto/100;
    }
}
