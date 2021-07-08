package controllers;


import views.View;

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

        while (!(checkUserDataInput(userData = scanner.nextLine(), regExpression))) {
            view.printWrongInput(dataType);
        }

        return userData;
    }

    public boolean checkUserDataInput(String userData, String regExpression) {
        return userData.matches(regExpression);
    }
}
