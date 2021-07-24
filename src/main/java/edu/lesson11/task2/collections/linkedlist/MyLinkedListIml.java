package edu.lesson11.task2.collections.linkedlist;

import java.util.Iterator;

public class MyLinkedListIml<T> implements MyLinkedList<T>{

    @Override
    public boolean add(T obj) {
        return false;
    }

    @Override
    public boolean add(int index, T obj) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(T obj) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
