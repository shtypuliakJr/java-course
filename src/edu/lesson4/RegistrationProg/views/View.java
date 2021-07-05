package edu.lesson4.RegistrationProg.views;

public class View {

    public static final String MAIN_TASK = "Enter all necessary information one by one.";
    public static final String SUCCESSFUL_REGISTRATION = "Successful registration";
    public static final String ENTER_DATA ="Enter %s: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printCurrentTask(String dataType) {
        System.out.printf("\n" + ENTER_DATA, dataType);
    }

}
