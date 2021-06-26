package edu.lesson2.JUnitTest.Calculation;

public class Arithmetics {
    public double add(double a, double b) {
        return a + b;
    }

    public double deduct(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
}
