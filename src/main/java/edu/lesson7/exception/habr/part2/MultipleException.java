package edu.lesson7.exception.habr.part2;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class MultipleException {
    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException { // or throws IOException
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}
