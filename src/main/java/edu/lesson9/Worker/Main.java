package edu.lesson9.Worker;

import java.util.Hashtable;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker();

        worker1.setName("Worker_1");
        worker1.setAge(25);
        worker1.setRank(4);

        Worker worker2 = new Worker("Worker_2", 30, 4);

        System.out.println(worker1.equals(new Object()));
        System.out.println(worker1.equals(worker2));
        System.out.println(worker1.equals(new Worker("Worker_1", 25, 4)));

        System.out.println("worker1 hash = " + worker1.hashCode());
        System.out.println("worker2 hash = " + worker2.hashCode());

        System.out.println("\nInstances hash using Objects util");
        System.out.println("worker1 hash = " + Objects.hashCode(worker1));
        System.out.println("worker2 hash = " + Objects.hashCode(worker2));
    }
}
