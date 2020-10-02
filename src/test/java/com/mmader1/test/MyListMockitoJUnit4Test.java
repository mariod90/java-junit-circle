package com.mmader1.test;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyListMockitoJUnit4Test {
    @Mock
    private MyList lstMockito;

    @BeforeEach
    void init(){
        lstMockito = Mockito.mock(MyList.class);
    }

    @Test
    public void testAddFruit(){
        Mockito.doNothing().when(lstMockito).add(Mockito.isA(String.class));
        lstMockito.add(" ");
        Mockito.verify(lstMockito, Mockito.times(1)).add(" ");
    }

    @Test(expected = NoSuchElementException.class)
    //@Test
    public void testRemoveFruit(){
        Mockito.doThrow(NoSuchElementException.class).when(lstMockito).remove(Mockito.isA(String.class));
        lstMockito.remove(" ");
    }

    @Test
    public void testCustomActionsAdd() {
        Mockito.doAnswer(invocationOnMock -> {
            Object arg0 = invocationOnMock.getArguments()[0];
            assertEquals("Orange", arg0);
            return null;
        }).when(lstMockito).add(Mockito.any(String.class));
        lstMockito.add("Orange");
    }
}
