package com.study;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

public class ConsumerTest {

    @Test
    public void Consumer(){
        StringBuilder sb = new StringBuilder();
        Consumer<Integer> consumer = (number) -> sb.append("-").append(number);
        consumer.accept(10000);

        assertEquals("-10000", sb.toString());
    }
}