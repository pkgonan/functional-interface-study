package com.study;

import org.junit.Test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;

public class BiConsumerTest {

    @Test
    public void BiConsumer(){
        StringBuilder sb = new StringBuilder();
        BiConsumer<Integer, String> bi = (n1, n2) -> sb.append("-").append(n1).append(n2);
        bi.accept(1,"+TEST");

        assertEquals("-1+TEST", sb.toString());
    }
}