package edu.lesson4.RegistrationProg.controllers;


import edu.lesson4.RegistrationProg.models.UsersModel;
import edu.lesson4.RegistrationProg.views.View;
import edu.lesson4.RegistrationProg.user.User;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @since 1.0
 * {@link Controller} gets information from input and check it (validate).
 * Have instance of {@link View} for displaying information.
 * Methods in these class process input and validate it
 * @see View
 * @see User
 * @see UsersModel
 */
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

    /**
     * Process all input data and create new user using received data from console.
     */
    private void processInput() {

        user = new User();

        final String name = processUserName();
        final String surname = processUserSurname();
        final String patronymic = processUserPatronymic();
        final String fullName = addUserFullName(name, surname);
        final String nickname = processUserNickname();

        user.setName(name);
        user.setSurname(surname);
        user.setPatronymic(patronymic);
        user.setFullName(fullName);
        user.setNickname(nickname);
    }

    /**
     * @param regex Regex string for pattern.
     * @param dataType Used for displaying current required data type of user field {@link User}
     */
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

    private String addUserFullName(final String name, final String surname) {

        StringBuilder fullname = new StringBuilder().append(surname).append(" ").append(name.charAt(0)).append(".");

        return fullname.toString();
    }

    private String processUserNickname() {
        return processData(RegExpression.NICKNAME, "nickname");
    }
}
