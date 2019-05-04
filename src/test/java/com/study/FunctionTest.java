package com.study;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class FunctionTest {

    @Test
    public void Function(){
        Function<String, Integer> f = String::length;

        int result = f.apply("hi");

        assertEquals(2, result);
    }
}