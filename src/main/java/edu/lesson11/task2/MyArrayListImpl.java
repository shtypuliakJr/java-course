package edu.lesson11.task2;

import java.util.Iterator;

public class MyArrayListImpl<Type> implements MyArrayList<Type> {

    private final int DEFAULT_SIZE = 10;

    private int currentSize = 0;

    private Type[] array;

    public MyArrayListImpl() {
        this.array = (Type[]) new Object[DEFAULT_SIZE];
    }

    private Iterator<Type> iterator = new Iterator<Type>() {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < currentSize && array[currentIndex] != null;
        }

        @Override
        public Type next() {
            return array[currentIndex++];
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
            Type[] newArray = (Type[]) new Object[array.length + array.length / 2 + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            array[currentSize - 1] = obj;
        }
    }

    @Override
    public int size() {
        return this.currentSize;
    }

    @Override
    public Type get(int index) {
        if (this.currentSize != 0 && index >= 0 && index < this.currentSize) {
            return array[index];
        }
        return null;
    }
}
