package edu.lesson2.gamerandom;

public enum Comparison {
    GREATER,
    LESS,
    EQUALS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}