package edu.lesson4.RegistrationProg.views;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @see edu.lesson4.RegistrationProg.controllers.Controller
 * @see edu.lesson4.RegistrationProg.Main
 * @since 1.0
 * <p>
 * Main view of the program, display all information.
 */
public class View {

    public static final String MAIN_TASK = "Enter all necessary information one by one.";
    public static final String SUCCESSFUL_REGISTRATION = "Successful registration";

    /**
     * String ENTER_DATA is used as default output for current task.
     * Has special symbol '%s' which take  input parameter in {@link View#printCurrentTask(String)}}
     *
     * @see View#printCurrentTask(String)
     */
    public static final String ENTER_DATA = "Enter %s: ";

    /**
     * Method for printing input message
     *
     * @param message String message, which will be output (used at the beginning of running program and at hte end)
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method for printing current task.
     *
     * @param dataType String value, which is used for displaying current required information type of data.
     * @see View#ENTER_DATA
     */
    public void printCurrentTask(String dataType) {
        System.out.printf("\n" + ENTER_DATA, dataType);
    }

}
