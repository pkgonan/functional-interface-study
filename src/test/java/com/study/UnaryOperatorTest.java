package com.study;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import static org.junit.Assert.assertEquals;

public class UnaryOperatorTest {

    @Test
    public void UnaryOperator(){
        UnaryOperator<String> u = (str) -> str + " operator";
        String result = u.apply("hello unary");

        assertEquals("hello unary operator", result);
    }
}