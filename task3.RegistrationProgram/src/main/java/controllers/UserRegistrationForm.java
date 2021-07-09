package controllers;


import models.user.User;
import views.TextConstant;
import views.View;

import java.util.Scanner;

public class UserRegistrationForm {
    private final Scanner scanner;
    private final View view;

    public UserRegistrationForm(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public User registerUser() {

        UserDataChecker userDataChecker = new UserDataChecker(scanner, view);

        final String name = userDataChecker.getUserDataInput(RegExpression.NAME, TextConstant.DATA_TYPE_NAME);
        final String surname = userDataChecker.getUserDataInput(RegExpression.SURNAME, TextConstant.DATA_TYPE_SURNAME);
        final String patronymic = userDataChecker.getUserDataInput(RegExpression.PATRONYMIC, TextConstant.DATA_TYPE_PATRONYMIC);
        final String nickname = userDataChecker.getUserDataInput(RegExpression.LOGIN, TextConstant.DATA_TYPE_LOGIN);
        final String email = userDataChecker.getUserDataInput(RegExpression.EMAIL, TextConstant.DATA_TYPE_EMAIL);

        User user = new User();

        user.setName(name);
        user.setSurname(surname);
        user.setPatronymic(patronymic);
        user.setFullName();
        user.setLogin(nickname);
        user.setEmail(email);

        return user;
    }

}
