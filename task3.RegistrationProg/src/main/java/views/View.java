package views;

import controllers.Controller;
import user.User;

import java.util.Locale;
import java.util.ResourceBundle;

import static views.TextConstant.*;

/**
 * @author Arthur Shtypuliak
 * @version 1.3
 * @see Controller
 * @since 1.0
 * Main view of the program, display all information.
 */
public class View {

    static String MESSAGES_BUNDLE_NAME = "messages";

    private ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    public void setLocale(Locale locale) {
        bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, locale);
    }
    /**
     * Method for printing input message
     *
     * @param message String message, which will be output (used at the beginning of running program and at hte end)
     */
    public void printMessage(String message) {
        System.out.println("\n" + bundle.getString(message));
    }

    /**
     * Method for printing current task.
     *
     * @param dataType String value, which is used for displaying current required information type of data.
     * @see TextConstant
     */
    public void printCurrentTask(String dataType) {
        System.out.printf("\n" + bundle.getString(ENTER_DATA) + " ", bundle.getString(dataType));
    }

    public void printWrongInput(String dataType) {
        System.out.printf(bundle.getString(WRONG_INPUT) + " " + bundle.getString(ENTER_DATA), bundle.getString(dataType));
    }

    public void printEnterLanguage() {
        System.out.print(LANGUAGE_SET);
    }
    public void printUserData(User user) {
        System.out.println("\n" + user.toString());
    }
    public void printWrongLocale(String message) {
        System.out.println(message);
    }
}
