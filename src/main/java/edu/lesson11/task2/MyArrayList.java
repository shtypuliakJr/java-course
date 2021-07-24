package edu.lesson11.task2;

public interface MyArrayList<Type>{
    void add(Type obj);
    void add(int index, Type obj);
    int size();
    Type get(int index);
    int capacity();
    boolean remove(Type obj);
}
