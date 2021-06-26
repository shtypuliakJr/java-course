package edu.lesson2.GameRandom;

import java.util.ArrayList;

class View {
    private static final String MAIN_TASK = "A random number from 0 to 100 is given.\nYour task is to guess this number.";
    private static final String ENTER_NUMBER_RANGE = "Enter number from %s to %s:";
    private static final String HIDDEN_NUMBER_COMPARISON = "Hidden number is %s than %s";
    private static final String NUMBER_ALREADY_IN_ARRAY = "The number %s has already been entered earlier.";

    private static final String NUMBER_EQUALS_TO_HIDDEN = "Entered number %s equals to hidden number." + "\n\nYOU WIN! GG";
    private static final String OUTPUT_STATISTIC = "Your statistic:" +
            "\nFull count of inputs: %s" +
            "\nCount of correct inputs: %s" +
            "\nYour correct inputs: %s";


    public void printTask() {
        System.out.println(View.MAIN_TASK);
    }

    public void printCurrentRange(int min, int max) {
        System.out.println(View.ENTER_NUMBER_RANGE.formatted(min, max));
    }

    public void printProximityOfNumberToHiddenNumber(int inputNumber, String biggerOrCloser) {
        System.out.println(HIDDEN_NUMBER_COMPARISON.formatted(biggerOrCloser, inputNumber));
    }

    public void printNumberAlreadyInArray(int inputNumber) {
        System.out.println(NUMBER_ALREADY_IN_ARRAY.formatted(inputNumber));
    }

    public void printResults(int guessedNumber, ArrayList arrayList, int countOfAllInputData) {
        System.out.println(NUMBER_EQUALS_TO_HIDDEN.formatted(guessedNumber));
        System.out.println(OUTPUT_STATISTIC.formatted(countOfAllInputData, arrayList.size(), arrayList.toString()));
    }
}
