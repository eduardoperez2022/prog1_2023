package calculadora_mvc.model;

import calculadora_mvc.controller.ConversorEuros;

public class ConversorEurosPesetasModelo { // Adaptador de objetos

    private ConversorEuros conversor;

    public ConversorEurosPesetasModelo() {
        conversor = new ConversorEuros(166.386D);
    }

    public double eurosApesetas(double cantidad) {
        return conversor.eurosAmoneda(cantidad);
    }

    public double pesetasAeuros(double cantidad) {
        return conversor.monedaAeuros(cantidad);
    }
}
