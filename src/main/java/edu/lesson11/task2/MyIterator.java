package edu.lesson11.task2;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private int currentIndex = 0;
    private T[] elementData;

    MyIterator(T[] elementData) {
        if (elementData == null) {
            throw new NullPointerException();
        }
        this.elementData = elementData;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elementData.length;
    }

    @Override
    public T next() {
        return elementData[currentIndex++];
    }
}
