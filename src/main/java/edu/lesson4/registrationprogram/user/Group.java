package edu.lesson4.registrationprogram.user;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @since 1.0
 * Enum Group is used as field in User class.
 * @see edu.lesson4.registrationprogram.user.User
 */
public enum Group {

    FRIENDS("Friends"),
    FAMILY("Family"),
    WORK("Work"),
    SCHOOL("School"),
    SPORT("Sport"),
    UNIVERSITY("University");

    String string;

    Group(String string) {
        this.string = string;
    }


    @Override
    public String toString() {
        return this.string;
    }
}
