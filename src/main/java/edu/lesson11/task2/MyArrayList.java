package edu.lesson11.task2;

import java.io.Serializable;

public interface MyArrayList<T> extends Iterable<T>, Serializable {
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

    void delete(int index);
}
