package edu.lesson7.exception.habr.part1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryAndFinally {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            throw new RuntimeException();
            // Runtime.getRuntime().exit(42); // не вызывается блок finally
            // Runtime.getRuntime().halt(42); // не вызывается блок finally
        } finally {
            System.err.println("finally");
        }
    }
}

//---------------------------------------------------

class TryAndFinally1 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            if (true) {
                throw new RuntimeException();
            } // finally-блок не может "починить" try-блок
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
}

//---------------------------------------------------

class TryAndFinally2 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
        // System.err.println("more"); // Unrechable statement
    }
}

//---------------------------------------------------

class TryAndFinally3 {
    public static void main(String[] args) {
        try {
            System.err.println("try");
            if (true) {
                return;
            }
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
}

//---------------------------------------------------

class TryAndFinally4 {
    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        try {
            return 0;
            // throw new RuntimeException();
        } finally {
            return 1; // вместо 0 или runtime exception вернеться 1
        }
    }
}

//---------------------------------------------------

class TryAndFinally5 {
    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }
}

//---------------------------------------------------

class TryAndFinally6 {
    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        try {
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
    }
}

//---------------------------------------------------

class TryAndFinally7 {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("...");
        try {
            // some code
        } finally {
            input.close(); // для закрытия файлового потока
        }
    }
}