package br.com.palestraspock.util;

public class CalculadoraInss {

    private Double salarioBase;

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
        double desconto = this.salarioBase > 3000 ? 5 : this.salarioBase <= 1500 ? 10 : 20;
        return this.salarioBase * desconto/100;
    }
}
