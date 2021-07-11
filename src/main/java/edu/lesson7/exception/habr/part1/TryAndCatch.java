package edu.lesson7.exception.habr.part1;

public class TryAndCatch {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {
                throw new RuntimeException();
            }
            System.err.print(" 1");
        } catch (Exception e) { // catch по Exception перехватывает RuntimeException
            System.err.print(" 2");
        }
        System.err.println(" 3");
    }
}

//---------------------------------------------------------

class TryAndCatch1 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                RuntimeException re = (RuntimeException) e;
                System.err.print("Это RuntimeException на самом деле!!!");
            } else {
                System.err.print("В каком смысле не RuntimeException???");
            }
        }
    }
}

//---------------------------------------------------------

class TryAndCatch2 {
    public static void main(String[] args) throws Exception { // пока игнорируйте 'throws'
        try {
            System.err.print(" 0");
            if (true) {
                throw new Exception();
                // throw new Error();
            }
            System.err.print(" 1");
        } catch (RuntimeException e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
}

//---------------------------------------------------------

class TryAndCatch3 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) { // перехватили RuntimeException
            System.err.print(" 2");
            if (true) {throw e;}       // и бросили ВТОРОЙ раз ЕГО ЖЕ
        }
        System.err.println(" 3");      // пропускаем - опять летит RuntimeException
    }
}

//---------------------------------------------------------

class TryAndCatch4 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {     // перехватили RuntimeException
            System.err.print(" 2");
            if (true) {throw new Error();} // и бросили новый Error
        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
}

//---------------------------------------------------------

class TryAndCatch5 {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) { // перехватили RuntimeException
            System.err.print(" 2.1");
            try {
                System.err.print(" 2.2");
                if (true) {throw new Error();} // и бросили новый Error
                System.err.print(" 2.3");
            } catch (Throwable t) {            // перехватили Error
                System.err.print(" 2.4");
            }
            System.err.print(" 2.5");
        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
}