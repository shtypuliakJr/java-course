package controllers;


import views.TextConstant;
import views.View;

import java.util.Scanner;

public class UserDataChecker {

    private final Scanner scanner;
    private final View view;

    public UserDataChecker(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String getUserDataInput(String regExpression, String dataType) {

        String userData = null;
        boolean isCorrectSyntax = false;
        view.printCurrentTask(TextConstant.ENTER_DATA, dataType);

        while (!isCorrectSyntax && scanner.hasNext() && (userData = scanner.next()) != null) {
            isCorrectSyntax = checkUserDataInput(userData, regExpression);
            if (!isCorrectSyntax) {
                view.printWrongInput(dataType);
            }
        }

        return userData;
    }

    public boolean checkUserDataInput(String userData, String regExpression) {
        return userData.matches(regExpression);
    }
}
