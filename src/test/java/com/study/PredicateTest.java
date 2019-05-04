package com.study;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class PredicateTest {

    @Test
    public void Predicate(){
        Predicate<String> predicate = String::isEmpty;

        boolean result = predicate.test("hello");

        assertEquals(false, result);
    }
}