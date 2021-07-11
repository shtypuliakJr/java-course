package edu.lesson7.exception.habr.part1;

class App {
    public static void main(String[] args) throws Throwable {
        try {
        } catch (Throwable t) {
        }
        throw new Error();
    }
}

class App2 {
    public static void main(String[] args) {
        Error ref = new Error("gg");
        throw ref;
    }
}

class App3 {
    public static void main(String[] args) {
        f(null);
    }

    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NumberFormatException npe) {
          //  f(npe);
        }
    }
}