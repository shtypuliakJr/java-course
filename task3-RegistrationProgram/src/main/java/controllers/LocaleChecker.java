package controllers;

import controllers.exceptions.LocaleSyntaxException;
import views.TextConstant;
import views.View;

import java.util.Locale;
import java.util.Scanner;

public class LocaleChecker {
    View view;

    LocaleChecker(View view) {
        this.view = view;
    }

    protected Locale getLocaleFromInput(Scanner scanner) {

        Locale locale;

        do {
            view.printLocaleTask(TextConstant.LANGUAGE_SET);
            locale = getLocale(scanner.nextLine());
        } while (locale == null);

        return locale;
    }

    private Locale getLocale(String dataInput) {
        try {
            return checkLanguageInput(dataInput);
        } catch (LocaleSyntaxException exception) {
            view.printLocaleTask(exception.getMessage());
        }
        return null;
    }

    private Locale checkLanguageInput(String language) {

        if (language.equals("en")) {
            return new Locale("en");
        } else if (language.equals("ua")) {
            return new Locale("ua", "UA");
        }
        throw new LocaleSyntaxException(TextConstant.WRONG_LOCALE);
    }
}
