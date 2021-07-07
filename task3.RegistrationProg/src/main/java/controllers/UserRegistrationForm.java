package controllers;


import user.User;
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

        UserDataInput userDataInput = new UserDataInput(scanner, view);

        final String name = userDataInput.getUserDataInput(RegExpression.NAME, TextConstant.DATA_TYPE_NAME);
        final String surname = userDataInput.getUserDataInput(RegExpression.SURNAME, TextConstant.DATA_TYPE_SURNAME);
        final String patronymic = userDataInput.getUserDataInput(RegExpression.PATRONYMIC, TextConstant.DATA_TYPE_PATRONYMIC);
        final String nickname = userDataInput.getUserDataInput(RegExpression.NICKNAME, TextConstant.DATA_TYPE_NICKNAME);

        User user = new User();

        user.setName(name);
        user.setSurname(surname);
        user.setPatronymic(patronymic);
        user.setFullName();
        user.setNickname(nickname);

        return user;
    }
}
