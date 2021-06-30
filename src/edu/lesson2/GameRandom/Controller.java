package edu.lesson2.GameRandom;

import java.util.Scanner;

public class Controller {

    private final Scanner scanner = new Scanner(System.in);
    private int countOfAllInputData = 0;
    private int inputNumber;
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {

        String inputData;

        view.printTask();
        view.printCurrentRange(model.getMin(), model.getMax());

        while (scanner.hasNextLine() && (inputData = scanner.nextLine()) != null) {
            if (processInput(inputData)) {
                break;
            }
        }
        view.printResults(inputNumber, model.getList(), countOfAllInputData);
    }

    public boolean processInput(String inputData) {

        Comparison comparison;

        countOfAllInputData++;

        if (checkInput(inputData)) {

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
        view.printCurrentRange(model.getMin(), model.getMax());
        return false;
    }

    public boolean checkInput(String inputData) {
        if (inputData == null) {
            return false;
        }
        try {
            int number = Integer.parseInt(inputData);
            if (number > model.getMin() && number < model.getMax()) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
