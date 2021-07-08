package controllers;


import models.Model;
import sun.util.locale.LocaleSyntaxException;
import user.User;
import views.TextConstant;
import views.View;

import java.util.Locale;
import java.util.Scanner;


/**
 * @author Arthur Shtypuliak
 * @version 1.3
 * @see View
 * @see user.User
 * @see Model
 * @since 1.0
 * {@link Controller} gets information from input and check it (validate).
 * Have instance of {@link View} for displaying information.
 * Methods in these class process input and validate it
 */
public class Controller {

    private final View view;
    private final Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void startRegistration() {

        Scanner scanner = new Scanner(System.in);
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm(scanner, view);
        model.createUserList();

        view.setLocale(getLocale(scanner));

        view.printMessage(TextConstant.MAIN_TASK);

        User user = userRegistrationForm.registerUser();
        model.addUser(user);
        System.out.println(user.toString());

        view.printMessage(TextConstant.SUCCESSFUL_REGISTRATION);
    }

    public Locale getLocale(Scanner scanner) {

        Locale locale;

        do {
            view.printEnterLanguage();
            locale = getLocaleFromInput(scanner.nextLine());
        } while (locale == null);

        return locale;
    }

    public Locale getLocaleFromInput(String dataInput) {
        try {
            return checkLanguageInput(dataInput);
        } catch (LocaleSyntaxException ignored) {
        }
        return null;
    }

    public Locale checkLanguageInput(String language) throws LocaleSyntaxException {

        if (language.equals("en")) {
            return new Locale("en");
        } else if (language.equals("ua")) {
            return new Locale("ua", "UA");
        }
        throw new LocaleSyntaxException("Wrong entered locale");
    }
}