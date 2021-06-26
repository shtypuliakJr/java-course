package edu.lesson2.GameRandom;

import java.util.ArrayList;
import java.util.Random;

public class Model {

    private ArrayList<Integer> arrayList = new ArrayList();

    private int hiddenNumber;
    private int min = 0;
    private int max = 100;

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

    public Model() {
        hiddenNumber = new Random().nextInt((max - min) + 1) + min;
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
