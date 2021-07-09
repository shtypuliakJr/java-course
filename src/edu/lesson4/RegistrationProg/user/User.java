package edu.lesson4.RegistrationProg.user;

import edu.lesson4.RegistrationProg.models.Model;

import java.util.GregorianCalendar;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @see edu.lesson4.RegistrationProg.controllers.Controller
 * @since 1.0
 * User is used for containing all information about one models.user.
 * Used in {@link Model}
 */
public class User {

    private String surname = null;
    private String name = null;
    private String patronymic = null;

    private String fullName = null;

    private String nickname = null;

    private String comment = null;

    private Group group = null;

    private String homeTelephone = null;
    private String mobileTelephone = null;
    private String mobileTelephoneAdditional = null;

    private String email = null;

    private String skypeLogin = null;

    private Address address = null;
    private String fullAddress = null;

    private GregorianCalendar creationDate = null;
    private GregorianCalendar lastChangeDate = null;

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

