package com.study;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayObjectTest {

    @Test
    public void int_array_new() {
        int[] array = new int[5];

        String name = array.getClass().getName();
        assertEquals("[I", name);
    }

    @Test
    public void int_array_not_new() {
        int[] array = {1,2,3};

        String name = array.getClass().getName();
        assertEquals("[I", name);
    }

    @Test
    public void double_int_array_new() {
        int[][] array = { {1,2,3}, {4,5,6} };

        String name = array.getClass().getName();
        assertEquals("[[I", name);
    }

    @Test
    public void double_int_array_not_new() {
        int[][] array = { {1,2,3}, {4,5,6} };

        String name = array.getClass().getName();
        assertEquals("[[I", name);
    }

    @Test
    public void triple_int_array_new() {
        int[][][] array = { { {1,2,3}, {4,5,6} } };

        String name = array.getClass().getName();
        assertEquals("[[[I", name);
    }

    @Test
    public void triple_int_array_not_new() {
        int[][][] array = { { {1,2,3}, {4,5,6} } };

        String name = array.getClass().getName();
        assertEquals("[[[I", name);
    }

    @Test
    public void char_array_new() {
        char[] array = new char[5];

        String name = array.getClass().getName();
        assertEquals("[C", name);
    }

    @Test
    public void char_array_not_new() {
        char[] array = {'a', 'b', 'c'};

        String name = array.getClass().getName();
        assertEquals("[C", name);
    }

    @Test
    public void String_array_new() {
        String[] array = new String[5];

        String name = array.getClass().getName();
        assertEquals("[Ljava.lang.String;", name);
    }

    @Test
    public void String_array_not_new() {
        String[] array = {"a", "b", "c"};

        String name = array.getClass().getName();
        assertEquals("[Ljava.lang.String;", name);
    }
}
