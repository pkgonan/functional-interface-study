package com.study;

import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.assertEquals;

public class CallableTest {

    @Test
    public void Callable(){
        StringBuilder result = new StringBuilder();

        Callable<Integer> callable = () -> 10000;

        try {
            result.append(callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals("10000", result.toString());
    }
}