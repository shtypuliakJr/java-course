package edu.lesson4.RegistrationProg.controllers;

import edu.lesson4.RegistrationProg.user.User;
import edu.lesson4.RegistrationProg.views.View;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class UserRegistrationForm {
    private final Scanner scanner;
    private final View view;

    public UserRegistrationForm(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public User registerUser() {

        UserDataInput userDataInput = new UserDataInput(scanner, view);

        final String name = userDataInput.getUserDataInput(RegExpression.NAME, "name");
        final String surname = userDataInput.getUserDataInput(RegExpression.SURNAME, "surname");

        User user = new User();

        user.setName(name);
        user.setSurname(surname);

        return user;
    }


}
