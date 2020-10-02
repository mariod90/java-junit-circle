package com.mmader1.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {
    private MyList lstTest = new MyList();

    @BeforeEach
    void init(){
        lstTest.add("Apple");
        lstTest.add("Orange");
        lstTest.add("Grapes");
    }

    @Test
    @DisplayName("Agregando un registro a la lista")
    void add() {
        lstTest.add("Banana");
        assertEquals(4, lstTest.size());
    }

    @Test
    @DisplayName("Eliminando un registro de lista")
    void remove() {
        lstTest.remove("Orange");
        assertEquals(2, lstTest.size());
    }

    @Test
    @DisplayName("Probando tamaño de lista")
    public void size() {
        assertEquals(3, lstTest.size());
    }
}