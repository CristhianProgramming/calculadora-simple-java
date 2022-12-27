package org.cristhian.calculadora.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {

    private BigDecimal numero1;
    private BigDecimal numero2;
    private Operaciones calculos;

    @BeforeEach
    void Definicion(){
        numero1 = new BigDecimal(10);
        numero2 = new BigDecimal(20);
        calculos = new Operaciones(numero1,numero2);
    }

    @Test
    void suma() {
        BigDecimal result = calculos.suma();
        assertEquals(result.toPlainString(),"30");
    }

    @Test
    void restar() {
        BigDecimal result = calculos.restar();
        assertEquals(result.toPlainString(),"-10");
    }

    @Test
    void multiplicar() {
        BigDecimal result = calculos.multiplicar();
        assertEquals(result.toPlainString(),"200");
    }

    @Test
    void division() {
        BigDecimal result = calculos.division();
        assertEquals(result.toPlainString(),"0.5");
    }
}