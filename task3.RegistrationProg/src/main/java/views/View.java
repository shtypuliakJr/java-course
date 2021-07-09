package views;

import controllers.Controller;
import models.user.User;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Arthur Shtypuliak
 * @version 1.3
 * @see Controller
 * @since 1.0
 * Main view of the program, display all information.
 */
public class View {

    private static final String MESSAGES_BUNDLE_NAME = "messages";

    private static ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    public static void setLocale(Locale locale) {
        bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, locale);
    }

    public void printLocaleTask(String message) {
        System.out.print(bundle.getString(message) + " ");
    }

    public void printMainTask(String message) {
        System.out.println("\n" + bundle.getString(message));
    }

    public void printCurrentTask(String task, String dataType) {
        System.out.printf("\n" + bundle.getString(task) + " ", bundle.getString(dataType));
    }

    public void printSuccessfulRegistration(String message) {
        System.out.println("\n\n" + bundle.getString(message));
    }

    public void printWrongInput(String dataType) {
        System.out.printf(bundle.getString(TextConstant.WRONG_INPUT) + " " + bundle.getString(TextConstant.ENTER_DATA), bundle.getString(dataType));
    }

    public void printLoginIsTaken(String message) {
        System.out.print("\n" + bundle.getString(message));
    }

    public void printUserData(User user) {
        StringBuffer userInfo
                = new StringBuffer().append("\n").append(bundle.getString(TextConstant.DATA_OUTPUT_TYPE_USER)).append("\n")
                .append("* " + bundle.getString(TextConstant.DATA_OUTPUT_FULLNAME_USER) + ": ").append(user.getFullName()).append("\n")
                .append("* " + bundle.getString(TextConstant.DATA_OUTPUT_LOGIN_USER) + ": ").append(user.getLogin()).append("\n")
                .append("* " + bundle.getString(TextConstant.DATA_OUTPUT_EMAIL_USER) + ": ").append(user.getEmail()).append("\n");
        System.out.println(userInfo);
    }
}
