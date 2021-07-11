package edu.lesson7.exception.habr.part1;

public class TryWithResourcesAndFinally {
    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        long rnd = System.currentTimeMillis();
        boolean finished = false;
        try {
            if (rnd % 3 == 0) {
                throw new Error();
            } else if (rnd % 3 == 1) {
                throw new RuntimeException();
            } else {
                // nothing
            }
            finished = true;
        } finally {
            if (finished) {
                // не было исключений
            } else {
                // было исключение, но какое?
            }
        }
        return 0;
    }
}
