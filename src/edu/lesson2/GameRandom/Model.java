package edu.lesson2.GameRandom;

import java.util.ArrayList;
import java.util.Random;

public class Model {

    private final ArrayList<Integer> arrayList = new ArrayList<>();

    private final int hiddenNumber;

    private final int START_MIN = 0;
    private final int START_MAX = 100;

    private int min = START_MIN;
    private int max = START_MAX;

    public Model() {
        // [0-100]
        //hiddenNumber = new Random().nextInt((START_MAX - START_MIN) + 1) + START_MIN;
        // [1-99]
        hiddenNumber = (int) Math.ceil(Math.random() * (START_MAX - START_MIN - 1) + START_MIN);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getHiddenNumber() {
        return this.hiddenNumber;
    }

    public boolean setBounds(Comparison comparison, int inputNumber) {
        if (inputNumber < max && inputNumber > min) {
            this.min = (comparison == Comparison.LESS) ? min : inputNumber;
            this.max = (comparison == Comparison.GREATER) ? max : inputNumber;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public Comparison checkInputInArray(int enteredNumber) {
        if (arrayList.contains(enteredNumber)) {
            return Comparison.IN_ARRAY;
        }

        arrayList.add(enteredNumber);

        if (enteredNumber == hiddenNumber) {
            return Comparison.EQUALS;
        } else if (enteredNumber > hiddenNumber) {
            return Comparison.LESS;
        } else {
            return Comparison.GREATER;
        }
    }
}
