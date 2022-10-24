package model.entities;

public class operacoes {
    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    double valor1, valor2;
    double somar;
    double diminuir;
    double dividir;
    double multiplicar;

    public double getDiminuir() {
        return diminuir = valor1 - valor2;
    }

    public double getDividir() {
        return dividir = valor1 / valor2;
    }

    public double getMultiplicar() {
        return multiplicar = valor1 * valor2;
    }

    public double getSomar() {

        return somar = valor1 + valor2;
    }



}
