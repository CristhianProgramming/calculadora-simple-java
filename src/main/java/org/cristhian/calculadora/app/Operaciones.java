package org.cristhian.calculadora.app;

import java.math.BigDecimal;

public class Operaciones {


    private BigDecimal primerNumero;
    private BigDecimal segundoNumero;

    public Operaciones() {
    }

    public Operaciones(BigDecimal primerNumero, BigDecimal segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public BigDecimal getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(BigDecimal primerNumero) {
        this.primerNumero = primerNumero;
    }

    public BigDecimal getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(BigDecimal segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public BigDecimal suma(){
        return primerNumero.add(segundoNumero);
    }

    public BigDecimal restar(){
        return primerNumero.subtract(segundoNumero);
    }

    public BigDecimal multiplicar(){
        return primerNumero.multiply(segundoNumero);
    }

    public BigDecimal division(){
        return primerNumero.divide(segundoNumero);
    }
}
