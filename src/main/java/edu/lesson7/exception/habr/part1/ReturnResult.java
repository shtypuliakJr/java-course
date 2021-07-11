package edu.lesson7.exception.habr.part1;

public class ReturnResult {
    public static void main(String[] args) {

        System.out.println(sqr(2));
        System.out.println(sqrReturnDouble(2));

        //double d = sqrWhileLoop(4); // infinite loop, value d will not get any value

        double d1 = sqrRuntimeException(4);
        System.out.println(d1);
    }

    public static double sqrReturnDouble(double arg) {
        return arg * arg;
    }

    public static double sqr(double arg) {
        int k = 1;
        return k;
        // Compiler generate byte code for its explicit conversion
        // int -> double : return (double) k;
    }

    public static double sqrReturnString(double arg) {
        // compilation error
        //return "Hello";
        return 0;
    }

    public static double sqrReturnNothing(double arg) {
        // compilation error without return keyword

        return 0;
    }

    public static double sqrReturnInsideIfStatement(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg;
        }
        // compilation error if there is no return
        return 0;
    }

    public static double sqrWhileLoop(double arg) {
        while (true) ; // compile
    }

    public static double sqrWhileLoopInElse(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg; // return double
        } else {
            while (true) ;     // infinite loop
        }

    }

    public static double sqrRuntimeException(double arg) {
        throw new RuntimeException();
    }

    public static double sqrReturnCases(double arg) {// согласно объявлению метода ты должен вернуть double
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;             // ок, вот твой double
        } else if (time % 2 == 1) {
            while (true) ;                 // не, я решил "повиснуть"
        } else {
            throw new RuntimeException(); // или бросить исключение
        }
    }

    public static int area(int width, int height) {
        return width * height; // multiply
    }

    public static int areaWithCheckingSignOfSides(int width, int height) {
        if (width < 0 || height < 0) {
            // throw exception if width or height less than 0
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height; //
    }
}
