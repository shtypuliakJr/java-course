package edu.lesson4.RegistrationProg;

public class View {

    public static String MAIN_TASK = "Enter all necessary information one by one.";
    public static String SUCCESSFUL_REGISTRATION = "Successful registration";
    public static String ENTER_DATA ="Enter %s: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printCurrentTask(String dataType) {
        System.out.printf("\n" + ENTER_DATA, dataType);
    }

}
