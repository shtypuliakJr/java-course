package edu.lesson2.gamerandom;

import java.util.Scanner;

public class Controller {

    private final Scanner scanner = new Scanner(System.in);

    private final Model model;
    private final View view;

    private int countOfAllInputData = 0;
    private int inputNumber;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {

        view.printTask();
        view.printCurrentBounds(model.getMinBound(), model.getMaxBound());

        while (scanner.hasNextLine()) {
            if (isCorrectInput(scanner.nextLine())) {
                break;
            }
        }

        view.printResults(inputNumber, model.getList(), countOfAllInputData);
    }

    private boolean isCorrectInput(String inputData) {

        Comparison comparison;

        countOfAllInputData++;

        if (isInsideBounds(inputData)) {

            inputNumber = Integer.parseInt(inputData);
            comparison = model.checkInputNumber(inputNumber);

            if (comparison.equals(Comparison.EQUALS)) {
                return true;
            } else {
                view.printProximityOfNumberToHiddenNumber(inputNumber, comparison);
            }
        }

        view.printCurrentBounds(model.getMinBound(), model.getMaxBound());
        return false;
    }

    private boolean isInsideBounds(String inputData) {

        try {
            int number = Integer.parseInt(inputData);
            return number > model.getMinBound() && number < model.getMaxBound();
        } catch (Exception e) {
            return false;
        }
    }
}
