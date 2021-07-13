package edu.lesson9.Worker;

public class Worker {

    private String name;
    private int age;
    private int rank;

    Worker() {
    }

    Worker(String name, int age, int rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getRank() {
        return this.rank;
    }

    public String toString() {
        return "Worker { "
                + "name = " + this.name + "; "
                + "age = " + this.age + "; "
                + "rank = " + this.rank + " "
                + "}";
    }

    public boolean equals(Object worker) {
        if (worker == null) {
            return false;
        }
        if (worker == this) {
            return true;
        }
        if (worker instanceof Worker) {

            return this.name.equals(((Worker) worker).name) &&
                    this.age == ((Worker) worker).age &&
                    this.rank == ((Worker) worker).rank;
        } else {
            return false;
        }
    }

    public int hashCode() {

        int hashcode = 0;
        hashcode += this.name == null ? 0 : this.name.hashCode();
        hashcode += 31 * this.age;
        hashcode += 31 * this.rank;

        return hashcode;
        //return Objects.hash(this);
    }

}