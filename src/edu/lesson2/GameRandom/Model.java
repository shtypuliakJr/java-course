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
        return this.minBound;
    }

    public int getMaxBound() {
        return this.maxBound;
    }

    public int getHiddenNumber() {
        return this.hiddenNumber;
    }

    public List<Integer> getList() {
        return list;
    }

    public Comparison checkInputNumber(int inputNumber) {

        Comparison comparison;

        list.add(inputNumber);

        if (inputNumber == hiddenNumber) {
            comparison = Comparison.EQUALS;
        } else if (inputNumber > hiddenNumber) {
            comparison = Comparison.LESS;
        } else {
            comparison = Comparison.GREATER;
        }

        this.setNewBounds(comparison, inputNumber);

        return comparison;
    }

    private void setNewBounds(Comparison comparison, int inputNumber) {
        this.minBound = (comparison == Comparison.LESS) ? minBound : inputNumber;
        this.maxBound = (comparison == Comparison.GREATER) ? maxBound : inputNumber;
    }
}
