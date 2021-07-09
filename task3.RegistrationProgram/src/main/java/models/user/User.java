package models.user;

import controllers.Controller;

import java.util.GregorianCalendar;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @see Controller
 * @since 1.0
 * User is used for containing all information about one models.user.
 * Used in {@link models.Model}
 */
public class User {

    private String name = null;
    private String surname = null;
    private String patronymic = null;

    private String fullName = null;

    private String login = null;

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

    public void setFullName() {
        this.fullName = surname + " " + name.charAt(0) + "."  + patronymic.charAt(0) + "." ;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}

