package edu.lesson2.gamerandom;

import java.util.List;

public class View {
    private static final String MAIN_TASK = "A random number from 0 to 100 is given.\nYour task is to guess this number.";
    private static final String ENTER_NUMBER_RANGE = "Enter number from %s to %s:";
    private static final String HIDDEN_NUMBER_COMPARISON = "Hidden number is %s than %s";

    private static final String NUMBER_EQUALS_TO_HIDDEN = "\nEntered number %s equals to hidden number." + "\nYOU WIN! GG";


    private static final String OUTPUT_STATISTIC = "\nYour statistic:" +
            "\nCount of all inputs: %s" +
            "\nCount of correct inputs: %s" +
            "\nYour correct inputs: %s";


    public void printTask() {
        System.out.println(View.MAIN_TASK);
    }

    public void printCurrentBounds(int min, int max) {
        System.out.printf((View.ENTER_NUMBER_RANGE) + "%n", min, max);
    }

    public void printProximityOfNumberToHiddenNumber(int inputNumber, Comparison comparison) {
        System.out.printf((HIDDEN_NUMBER_COMPARISON) + "%n", comparison.toString(), inputNumber);
    }

    public void printResults(int guessedNumber, List<Integer> list, int countOfAllInputData) {
        System.out.printf((NUMBER_EQUALS_TO_HIDDEN) + "%n", guessedNumber);
        System.out.printf((OUTPUT_STATISTIC) + "%n", countOfAllInputData, list.size(), list);
    }

}
