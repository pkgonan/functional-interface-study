package com.study;

import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

public class SupplierTest {

    @Test
    public void Supplier(){
        Supplier<Integer> supplier = () -> 10000;
        int result = supplier.get();

        assertEquals(10000, result);
    }

    @Test
    public void Supplier_With_Function(){
        Supplier<Integer> supplier = () -> 10000;

        int increased = increase(supplier);

        assertEquals(10001, increased);
    }

    private int increase(Supplier<Integer> supplier) {
        return supplier.get() + 1;
    }
}