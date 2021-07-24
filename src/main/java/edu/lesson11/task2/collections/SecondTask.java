package edu.lesson11.task2.collections;

import edu.lesson11.task2.collections.arraylist.MyArrayList;
import edu.lesson11.task2.collections.arraylist.MyArrayListImpl;

public class SecondTask {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayListImpl<>();

        System.out.println("capacity = " + myArrayList.capacity());
        System.out.println("size = " + myArrayList.size());

        try {
            System.out.println(myArrayList.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("get element by index in empty arraylist = " + e.getCause());
        }

        for (int i = 0; i < 10; i+=2) {
            myArrayList.add(i);
        }

        System.out.println("\nGetting elements from arraylist:");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        System.out.println("\n\ncapacity = " + myArrayList.capacity());
        System.out.println("size = " + myArrayList.size());

        for (int i = 0; i < 10; i+=2) {
            myArrayList.add(i);
        }

        System.out.println("\nGetting elements from arraylist 2:");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        System.out.println("\n\ncapacity = " + myArrayList.capacity());
        System.out.println("size = " + myArrayList.size());

        System.out.println();
        myArrayList.delete(2);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
        System.out.println("\n\ncapacity = " + myArrayList.capacity());
        System.out.println("size = " + myArrayList.size());
        System.out.println();
        for (Integer element : myArrayList) {
            System.out.print(element + " ");
        }
    }
}
