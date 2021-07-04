package edu.lesson4.RegistrationProg;

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
