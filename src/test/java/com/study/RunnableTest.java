package com.study;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class RunnableTest {

    @Test
    public void Runnable(){
        StringBuilder result = new StringBuilder();

        Runnable runnable = () -> result.append("DONE");
        runnable.run();

        assertEquals("DONE", result.toString());
    }
}