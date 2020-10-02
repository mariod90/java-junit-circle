package com.mmader1.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    @DisplayName("Sumar dos numeros enteros")
    public void testSumar() {
        int suma = new Calculadora().sumar(8,4);
        assertEquals(12, suma);
    }
}