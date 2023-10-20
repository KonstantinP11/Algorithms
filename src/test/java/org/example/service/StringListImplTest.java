package org.example.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListImplTest {
    private final StringListImpl stringList = new StringListImpl();
    String item = "four";
    int index = 1;
//    private String[] storage = new String[]{"one", "two", "three"};

    @Test
    void add_shouldAddAndReturnNewItem() {
        String result = stringList.add(item);
        assertEquals(result, stringList.get(0));

    }

    @Test
    void add_shouldReturnNewItemOnIndex() {
        String item1 = "one";
        String item2 = "two";
        stringList.add(item1);
        stringList.add(item2);
        String result = stringList.add(index, item);
        assertEquals(result, stringList.get(1));

    }

    @Test
    void set_shouldReturnItemOnIndex() {
        String item1 = "one";
        String item2 = "two";
        stringList.add(item1);
        stringList.add(item2);
        String result = stringList.add(index, item);
        assertEquals(result, stringList.get(1));
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
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