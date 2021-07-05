package edu.lesson4.RegistrationProg.user;

import java.util.GregorianCalendar;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @since 1.0
 * User is used for containing all information about one user.
 * Used in {@link edu.lesson4.RegistrationProg.models.UsersModel}
 * @see edu.lesson4.RegistrationProg.controllers.Controller
 * */
public class User {

    private String surname;
    private String name;
    private String patronymic;

    private String fullName;

    private String nickname;

    private String comment;

    private Group group;

    private String homeTelephone;
    private String mobileTelephone;
    private String mobileTelephoneAdditional;

    private String email;

    private String skypeLogin;

    private Address address;
    private String fullAddress;

    private GregorianCalendar creationDate;
    private GregorianCalendar lastChangeDate;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFullName() {
        this.fullName = surname + name + patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

