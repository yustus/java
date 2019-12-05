package com.artem;



public abstract class List {

    public abstract int size();

    public abstract void append();

    public abstract Object get(int index);

    public abstract void set(Object o, int index);

    public abstract Object removeById(int index);

    public abstract boolean remove(Object o);

}