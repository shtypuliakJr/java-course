package edu.lesson4.RegistrationProg.controllers;

import edu.lesson4.RegistrationProg.views.View;

import java.util.Scanner;

public class UserDataInput {

    private final Scanner scanner;
    private final View view;

    public UserDataInput(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String getUserDataInput(String regExpression, String dataType) {

        String userData;

        view.printCurrentTask(dataType);

        while (!(scanner.hasNext() && (userData = scanner.nextLine()).matches(regExpression))) {
            view.printWrongInput(dataType);
        }

        return userData;
    }
}
