package edu.lesson11.task2;

public interface MyArrayList<T> {
    boolean add(T obj);

    boolean add(int index, T obj);

    int size();

    T get(int index);

    int capacity();

    boolean remove(T obj);

    void ensureCapacity(int minCapacity);

    void trimToSize();

    void clear();

    T set(int index, T obj);

    int indexOf(T obj);
}
