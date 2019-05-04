package com.study;

import org.junit.Test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class BiPredicateTest {

    @Test
    public void BiPredicate(){
        BiPredicate<Integer, Integer> bi = (n1, n2) -> n1 > n2;

        boolean result = bi.test(1,2);

        assertEquals(false, result);
    }
}