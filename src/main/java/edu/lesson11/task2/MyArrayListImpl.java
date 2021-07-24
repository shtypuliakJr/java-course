package edu.lesson11.task2;

import java.io.Serializable;
import java.util.Iterator;

public class MyArrayListImpl<Type> implements MyArrayList<Type>, Serializable {

    private static final int DEFAULT_SIZE = 10;

    private int currentSize = 0;

    transient Object[] array;

    public MyArrayListImpl() {
        this.array = (Type[]) new Object[DEFAULT_SIZE];
    }
    public MyArrayListImpl(int initialCapacity) throws IllegalArgumentException{
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity less than 0");
        }
        this.array = (Type[]) new Object[initialCapacity];
    }

    private Iterator<Type> iterator = new Iterator<Type>() {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < currentSize && array[currentIndex] != null;
        }

        @Override
        public Type next() {
            return (Type) array[currentIndex++];
        }
    };

    @Override
    public int capacity() {
        return array.length;
    }

    @Override
    public void add(Type obj) {
        this.currentSize++;
        if (array.length > this.currentSize) {
            array[currentSize - 1] = obj;
        } else {
            Type[] newArray = (Type[]) new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
            array[currentSize - 1] = obj;
        }
    }

    @Override
    public void add(int index, Type obj) {
        if (index >= this.capacity() && index < 0) {
            throw new IndexOutOfBoundsException();
        }
        currentSize++;
        if (array[index] == null) {
            array[index] = obj;
        } else if (array.length > currentSize) {
            Type[] bufType = (Type[]) new Object[array.length];

        }

    }

    @Override
    public int size() {
        return this.currentSize;
    }

    @Override
    public Type get(int index) {
        if (this.currentSize != 0 && index >= 0 && index < this.currentSize) {
            return (Type) array[index];
        }
        return null;
    }

    @Override
    public boolean remove(Type obj) {
        return false;
    }
}
