package edu.lesson4.RegistrationProg.controllers;


import edu.lesson4.RegistrationProg.models.UsersModel;
import edu.lesson4.RegistrationProg.views.View;
import edu.lesson4.RegistrationProg.notes.User;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    private final View view;
    private User user;
    private final UsersModel usersModel = new UsersModel();

    public Controller(View view, User user) {
        this.view = view;
        this.user = user;
    }

    public void startRegistration() {

        view.printMessage(View.MAIN_TASK);

        this.processInput();

        usersModel.addUser(user);

        view.printMessage(View.SUCCESSFUL_REGISTRATION);
    }

    private void processInput() {

        user = new User();

        final String name = processUserName();
        final String surname = processUserSurname();
        final String patronymic = processUserPatronymic();
        final String fullName = addUserFullName(name, surname, patronymic);
        final String nickname = processUserNickname();

        user.setName(name);
        user.setSurname(surname);
        user.setPatronymic(patronymic);
        user.setFullName(fullName);
        user.setNickname(nickname);
    }

    private String processData(final String regex, final String dataType) {

        String userData;
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        do {
            view.printCurrentTask(dataType);

            userData = scanner.nextLine();
            matcher = pattern.matcher(userData);

        } while (!matcher.matches());

        return userData;
    }

    private String processUserName() {
        return processData(RegExpression.NAME, "name");
    }

    private String processUserSurname() {
        return processData(RegExpression.SURNAME, "surname");
    }

    private String processUserPatronymic() {
        return processData(RegExpression.PATRONYMIC, "patronymic");
    }

    private String addUserFullName(final String name, final String surname, final String patronymic) {
        StringBuilder fullname = new StringBuilder().append(name)
                                                    .append(" ")
                                                    .append(surname)
                                                    .append(" ")
                                                    .append(patronymic);

        return fullname.toString();
    }

    private String processUserNickname() {
        return processData(RegExpression.NICKNAME, "nickname");
    }
}
