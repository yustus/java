package com.artem;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class OurArrayList extends List {

    private Object[] source;
    private static final int DEFAULT_CAPACITY = 16;
    private int size;
    private int value;

    OurArrayList() {
        source = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public OurArrayList(Object[] source, int size) {
        source = new Object[DEFAULT_CAPACITY];
    }

    public void append() {
        if (source.length == size) {
            Object[] newSource = new Object[source.length * 2];
            System.arraycopy(source, 0, newSource, 0, source.length);
            source = newSource;
        }
        source[size] = value;
        size++;
    }


    public Object get(int index) {
        return source[index];
    }

    public void set(Object o, int index) {
        Object[] newSource = new Object[source.length];

        if (index < source.length && source[index] != null) {
            System.arraycopy(source, 0, newSource, 0, index);
            System.arraycopy(source, index + 1, newSource, index + 1, source.length - (index + 1));
            newSource[index] = value;
            source = newSource;
            size++;
        } else {
            System.out.println("invalid index \"" + index + "\". Enter index from \"0 to " + (source.length - 1) + "\"");
        }
    }



    public Object removeById(int index) {

            if (index >= size || index < 0)
                throw new IndexOutOfBoundsException();

            Object result = source[index];

            System.arraycopy(source, index + 1, source, index, source.length - (index + 1));
            size--;
            return result;
        }


    public boolean remove(Object o) {
        return false;
    }
}