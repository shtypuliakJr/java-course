package edu.lesson2.GameRandom;

import java.util.Scanner;

public class Controller {

    private final Scanner scanner = new Scanner(System.in);

    private int countOfAllInputData = 0;
    private int inputNumber;

    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {

        view.printTask();
        view.printCurrentRange(model.getMinBound(), model.getMaxBound());

        while (scanner.hasNextLine()) {
            if (isCorrectInput(scanner.nextLine())) {
                break;
            }
        }

        view.printResults(inputNumber, model.getList(), countOfAllInputData);
    }

    public boolean isCorrectInput(String inputData) {

        Comparison comparison;

        countOfAllInputData++;

        if (isNumberInsideBounds(inputData)) {

            inputNumber = Integer.parseInt(inputData);
            comparison = model.checkInputInArray(inputNumber);

            switch (comparison) {
                case EQUALS:
                    return true;
                case IN_ARRAY:
                    view.printNumberAlreadyInArray(inputNumber);
                    break;
                default:
                    if (model.isSetNewBounds(comparison, inputNumber)) {
                        view.printProximityOfNumberToHiddenNumber(inputNumber, comparison.toString());
                    }
                    break;
            }
        }
        view.printCurrentRange(model.getMinBound(), model.getMaxBound());
        return false;
    }

    public boolean isNumberInsideBounds(String inputData) {

        try {
            int number = Integer.parseInt(inputData);
            return number > model.getMinBound() && number < model.getMaxBound();
        } catch (Exception e) {
            return false;
        }
    }
}
