package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {
    private IntegerList integerList = new IntegerListImpl();
    Integer item = 4;
    int index = 1;

    @Test
    void add_shouldAddAndReturnNewItem() {
        Integer result = integerList.add(item);
        assertEquals(result, integerList.get(0));
    }

    @Test
    void add_shouldReturnNewItemOnIndex() {
        int item1 = 1;
        int item2 = 2;
        integerList.add(item1);
        integerList.add(item2);
        int result = integerList.add(index, item);
        assertEquals(result, integerList.get(1));
    }

    @Test
    void set() {
    }

    @Test
    void remove() {
    }

    @Test
    void contains() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void get() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void clear() {
    }

    @Test
    void toArray() {
    }
}