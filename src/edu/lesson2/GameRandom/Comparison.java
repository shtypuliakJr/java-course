package edu.lesson2.GameRandom;

public enum Comparison {
    GREATER,
    LESS,
    EQUALS,
    IN_ARRAY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}