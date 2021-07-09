package edu.lesson4.RegistrationProg.controllers;


import edu.lesson4.RegistrationProg.models.Model;
import edu.lesson4.RegistrationProg.user.User;
import edu.lesson4.RegistrationProg.views.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @since 1.0
 * {@link Controller} gets information from input and check it (validate).
 * Have instance of {@link View} for displaying information.
 * Methods in these class process input and validate it
 * @see View
 * @see User
 * @see Model
 */
public class Controller {

    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void start() {

        UserRegistrationForm userRegistrationForm = new UserRegistrationForm(new Scanner(System.in), view);

        model.createUserList();
        view.printMessage(View.MAIN_TASK);
        model.addUser(userRegistrationForm.registerUser());
        view.printMessage(View.SUCCESSFUL_REGISTRATION);

    }

    /**
     * @deprecated
     * @param regex Regex string for pattern.
     * @param dataType Used for displaying current required data type of models.user field {@link User}
     */
    private String processData(final String regex, final String dataType) {

        String userData;
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        do {
            view.printCurrentTask(dataType);

            userData = scanner.nextLine();
            matcher = pattern.matcher(userData);

        } while (!matcher.matches());

        return userData;
    }
}
