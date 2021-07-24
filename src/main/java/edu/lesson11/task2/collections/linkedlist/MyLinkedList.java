package edu.lesson11.task2.collections.linkedlist;

public interface MyLinkedList<T> extends Iterable<T> {

    boolean add(T obj);

    boolean add(int index, T obj);

    int size();

    boolean remove(int index);

    boolean remove(T obj);

    T get(int index);

    void clear();
}
