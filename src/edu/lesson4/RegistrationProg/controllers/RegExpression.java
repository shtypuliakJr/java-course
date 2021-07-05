package edu.lesson4.RegistrationProg.controllers;

public class RegExpression {
    public static String NAME = "[A-Z][a-z]{1,20}";
    public static String SURNAME = "[A-Z][a-z]{1,30}";
    public static String PATRONYMIC = "[A-Z][a-z]{1,30}";
    public static String NICKNAME = "[A-Za-z0-9_]{4,20}";
    public static String EMAIL = "[A-Za-z0-9_]{4,20}[@]{a-z}{3-20}[.][a-z]{2,4}";
}
