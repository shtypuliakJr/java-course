package edu.lesson2.GameRandom;

public enum Comparison {
    GREATER,
    LESS,
    EQUALS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}