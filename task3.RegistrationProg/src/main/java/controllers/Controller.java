package controllers;


import models.Model;
import sun.util.locale.LocaleSyntaxException;
import views.TextConstant;
import views.View;

import java.util.Locale;
import java.util.Scanner;


/**
 * @author Arthur Shtypuliak
 * @version 1.3
 * @since 1.0
 * {@link Controller} gets information from input and check it (validate).
 * Have instance of {@link View} for displaying information.
 * Methods in these class process input and validate it
 * @see View
 * @see user.User
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

        Scanner scanner = new Scanner(System.in);

        UserRegistrationForm userRegistrationForm = new UserRegistrationForm(scanner, view);

        try {
            view.setLocale(setLanguage(scanner));
        } catch (LocaleSyntaxException e) {
            e.printStackTrace();
        }
        model.createUserList();
        view.printMessage(TextConstant.MAIN_TASK);
        model.addUser(userRegistrationForm.registerUser());
        view.printMessage(TextConstant.SUCCESSFUL_REGISTRATION);
    }

    public Locale setLanguage(Scanner scanner) throws LocaleSyntaxException {

        view.printEnterLanguage();

        String language = scanner.nextLine();

        if (language.equals("en")) {
            return new Locale("en");
        } else if (language.equals("ua")) {
            return new Locale("ua", "UA");
        }
        throw new LocaleSyntaxException("Wrong entered locale");
    }
}