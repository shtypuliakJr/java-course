package edu.lesson11.task2;

// ToDo Написать реализацию коллекции (например, ArrayList) в которую можно добавлять данные и нельзя удалять.

public class SecondTask {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayListImpl<>();

        System.out.println("capacity = " + myArrayList.capacity());
        System.out.println("size = " + myArrayList.size());

        System.out.println("get element by index in empty arraylist = " + myArrayList.get(5));

        for (int i = 0; i < 10; i+=2) {
            myArrayList.add(i);
        }

        System.out.println("\nGetting elements from arraylist:");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        System.out.println("\n\ncapacity = " + myArrayList.capacity());
        System.out.println("size = " + myArrayList.size());

    }
}
