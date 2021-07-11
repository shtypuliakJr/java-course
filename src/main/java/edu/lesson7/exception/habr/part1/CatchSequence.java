package edu.lesson7.exception.habr.part1;

public class CatchSequence {
    public static void main(String[] args) {
        try {
        } catch (Exception e) {
            // нельзя ставить потомка после предка
            // } catch (RuntimeException e) {
        }
        // можно ставить брата поcле брата
        try {
        } catch (Error e) {
        } catch (RuntimeException e) {
        }
    }
}

//------------------------------------------

class CatchSequence1 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
}

//------------------------------------------

// Выбор catch осуществляется в runtime (а не в compile-time),
// значит учитывается не тип ССЫЛКИ (Throwable), а тип ССЫЛАЕМОГО (Exception)

class CatchSequence2 {
    public static void main(String[] args) {
        try {
            Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
}

//------------------------------------------
