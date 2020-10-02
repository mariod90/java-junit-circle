package com.mmader1.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {
    private Empleado empleado;

    @BeforeEach
    public void init(){
        empleado = new Empleado();
        ReflectionTestUtils.setField(empleado,"id",201);
    }

    @Test
    void testPrivate(){
        int actualId = (Integer) ReflectionTestUtils.invokeGetterMethod(empleado,"id");
        assertEquals(201, actualId);
    }

    @Test
    public void testModifyIdFromUser(){
        Empleado empleado = new Empleado();
        ReflectionTestUtils.setField(empleado, "id", 101);
        assertEquals(101, empleado.getId());
    }
}