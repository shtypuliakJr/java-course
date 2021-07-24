package edu.lesson11.task2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayListImpl<T> implements MyArrayList<T>, Serializable {

    private static final int DEFAULT_SIZE = 10;

    private int currentSize = 0;

    transient T[] elementData;

    public MyArrayListImpl() {
        this.elementData = (T[]) new Object[DEFAULT_SIZE];
    }

    public MyArrayListImpl(int initialCapacity) throws IllegalArgumentException {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity less than 0");
        }
        this.elementData = (T[]) new Object[initialCapacity];
    }

    private Iterator<T> iterator = new Iterator<T>() {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < currentSize && elementData[currentIndex] != null;
        }

        @Override
        public T next() {
            return (T) elementData[currentIndex++];
        }
    };

    @Override
    public int capacity() {
        return elementData.length;
    }

    @Override
    public boolean add(T obj) {
        this.currentSize++;
        if (elementData.length > this.currentSize) {
            elementData[currentSize - 1] = obj;
        } else {
            T[] newArray = (T[]) new Object[elementData.length * 3 / 2 + 1];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
            elementData[currentSize - 1] = obj;
        }
        return true;
    }

    @Override
    public boolean add(int index, T obj) {
        if (index >= this.capacity() && index < 0) {
            throw new IndexOutOfBoundsException();
        }
        currentSize++;
        if (elementData[index] == null) {
            elementData[index] = obj;
        } else if (elementData.length > currentSize) {
            System.arraycopy(elementData, index, elementData, index + 1, this.currentSize - index);
        }
        return true;
    }

    @Override
    public int size() {
        return this.currentSize;
    }

    @Override
    public T get(int index) {
        if (!(index >= 0 && index < this.currentSize)) {
            throw new IndexOutOfBoundsException();
        }

        return (T) elementData[index];
    }

    @Override
    public boolean remove(T obj) {
        return false;
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        elementData = Arrays.copyOf(elementData, minCapacity);
    }

    @Override
    public void trimToSize() {
        elementData = Arrays.copyOf(elementData, size());

    }

    @Override
    public void clear() {
        Arrays.fill(elementData, null);
    }

    @Override
    public T set(int index, T obj) {
        if (index >= capacity() && index < 0) {
            throw new IndexOutOfBoundsException();
        }

        T bufElement = elementData[index];
        elementData[index] = obj;

        return bufElement;
    }

    @Override
    public int indexOf(T obj) {

        if (obj == null)
            throw new NullPointerException();

        for (int i = 0; i < size(); i++) {
            if (elementData[i] == obj) {
                return i;
            }
        }
        return -1;
    }

}
