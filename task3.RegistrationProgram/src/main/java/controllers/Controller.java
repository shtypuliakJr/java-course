package controllers;


import models.Model;
import models.exception.LoginExistException;
import models.user.User;
import views.TextConstant;
import views.View;

import java.util.Scanner;


/**
 * @author Arthur Shtypuliak
 * @version 1.3
 * @see View
 * @see User
 * @see Model
 * @since 1.0
 * {@link Controller} gets information from input and check it (validate).
 * Have instance of {@link View} for displaying information.
 * Methods in these class process input and validate it
 */
public class Controller {

    private final View view;
    private final Model model;
    private final Scanner scanner = new Scanner(System.in);


    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void startRegistration() {

        View.setLocale(new LocaleChecker(view).getLocaleFromInput(scanner));
        view.printMainTask(TextConstant.MAIN_TASK);

        User user = new UserRegistrationForm(scanner, view).registerUser();
        addUserToDatabase(user);

        view.printUserData(user);
    }

    private void addUserToDatabase(User user) {
        while (true) {
            try {
                if (model.addUser(user)) {
                    view.printSuccessfulRegistration(TextConstant.SUCCESSFUL_REGISTRATION);
                    return;
                }
            } catch (LoginExistException e) {
                view.printLoginIsTaken(TextConstant.DATA_ERROR_LOGIN_TAKEN);
                String login = new UserDataChecker(scanner, view).getUserDataInput(RegExpression.LOGIN, TextConstant.DATA_TYPE_LOGIN);
                user.setLogin(login);
            }
        }
    }
}