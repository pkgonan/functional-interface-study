package com.study;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionalInterfaceTest {

    @Test
    public void Functional_Interface_Test() {
        F1 f = String::valueOf;

        String result = f.test(100);

        assertEquals("100", result);
    }

    @Test
    public void Not_Functional_Interface_Test() {
        F2 f = String::length;

        int result = f.test("abcdef");

        assertEquals(6, result);
    }

    @FunctionalInterface
    public interface F1 {

        String test(int n);

    }

    public interface F2 {

        int test(String s);

    }
}
