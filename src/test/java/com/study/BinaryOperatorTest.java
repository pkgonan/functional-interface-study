package com.study;

import org.junit.Test;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import static org.junit.Assert.assertEquals;

public class BinaryOperatorTest {

    @Test
    public void BinaryOperator(){
        BinaryOperator<Integer> b = (num1, num2) -> num1 + num2;

        int result = b.apply(1,2);

        assertEquals(3, result);
    }
}