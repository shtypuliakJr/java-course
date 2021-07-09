package controllers;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @since 1.0
 * RegExpression contain all regex for processing input data
 * @see Controller
 */
public interface RegExpression {

    String NAME = "[A-Z][a-z]{1,20}";
    String SURNAME = "[A-Z][a-z]{1,30}";
    String PATRONYMIC = "[A-Z][a-z]{1,30}";
    String LOGIN = "[A-Za-z0-9_]{4,20}";
    String EMAIL ="\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
}