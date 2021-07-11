package edu.lesson7.exception.habr.part1;

public class SystemErrAndOut {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
        // System.out - buffered-stream output, could be different order
        // System.err - not
    }
}
