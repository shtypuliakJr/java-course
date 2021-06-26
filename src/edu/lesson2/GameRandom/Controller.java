package edu.lesson2.GameRandom;

import java.util.Scanner;

class Controller {

    private int min = 0, max = 100;
    private Scanner scanner = new Scanner(System.in);
    private String inputData;
    private int inputNumber;
    private Comparison comparison;
    private int countOfAllInputData = 0;

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void startGame() {

        view.printTask();
        view.printCurrentRange(min, max);

        while (scanner.hasNextLine() && (inputData = scanner.nextLine()) != null) {

            countOfAllInputData++;
            if (checkInput(inputData)) {
                inputNumber = Integer.parseInt(inputData);
                comparison = model.checkInputInArray(inputNumber);
                if (comparison == Comparison.EQUALS) {
                    view.printResults(inputNumber, model.getArrayList(), countOfAllInputData);
                    break;
                } else if (comparison == Comparison.IN_ARRAY) {
                    view.printNumberAlreadyInArray(inputNumber);
                } else {
                    model.setBounds(comparison, inputNumber);
                    view.printProximityOfNumberToHiddenNumber(inputNumber, comparison.toString());
                }
            }
            view.printCurrentRange(model.getMin(), model.getMax());
        }
    }

    private boolean checkInput(String inputData) {
        if (inputData.equals(null)) {
            return false;
        }
        try {
            int number = Integer.parseInt(inputData);
            if (number >= 0 && number <= 100) {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }
}
