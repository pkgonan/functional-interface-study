package com.study;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class BiFunctionTest {

    @Test
    public void BiFunction(){
        BiFunction<Integer, Integer, Boolean> bf = (n1, n2) -> n1 > n2;

        boolean result = bf.apply(2, 1);

        assertEquals(true, result);
    }
}