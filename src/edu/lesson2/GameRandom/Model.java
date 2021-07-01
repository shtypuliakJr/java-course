package edu.lesson2.GameRandom;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private final int MIN_START = 0;
    private final int MAX_START = 100;

    private final int hiddenNumber;

    private int minBound;
    private int maxBound;

    private final List<Integer> list = new ArrayList<>();

    public Model() {
        // [0-100]
        //hiddenNumber = new Random().nextInt((START_MAX - START_MIN) + 1) + START_MIN;
        // [1-99]
        this.hiddenNumber = (int) Math.ceil(Math.random() * (MAX_START - MIN_START - 1) + MIN_START);
        this.minBound = MIN_START;
        this.maxBound = MAX_START;
    }

    public int getMinBound() {
        return minBound;
    }

    public int getMaxBound() {
        return maxBound;
    }

    public int getHiddenNumber() {
        return this.hiddenNumber;
    }

    public boolean isSetNewBounds(Comparison comparison, int inputNumber) {
        if (inputNumber < maxBound && inputNumber > minBound) {
            this.minBound = (comparison == Comparison.LESS) ? minBound : inputNumber;
            this.maxBound = (comparison == Comparison.GREATER) ? maxBound : inputNumber;
            return true;
        }
        return false;
    }

    public List<Integer> getList() {
        return list;
    }

    public Comparison checkInputInArray(int enteredNumber) {

        list.add(enteredNumber);

        if (enteredNumber == hiddenNumber) {
            return Comparison.EQUALS;
        } else if (enteredNumber > hiddenNumber) {
            return Comparison.LESS;
        } else {
            return Comparison.GREATER;
        }
    }
}
