package com.study;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class ComparatorTest {

    @Test
    public void Comparator() {
        Comparator<Integer> comparator = Comparator.naturalOrder();

        int compare = comparator.compare(1, 5);

        assertEquals(-1, compare);
    }
}