package org.example.service;

public interface IntegerList {
    Integer add(int item);
    Integer add(int index,int item);
    Integer set(int index,int item);
    Integer remove(int index);
    boolean contains(int item);
    int indexOf(int item);
    int lastIndexOf(int item);
    Integer get(int index);
    boolean equals(IntegerList otherList);
    int size();
    boolean isEmpty();
    void clear();
    Integer[] toArray();
}
