package controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import views.View;

import java.util.Scanner;

public class UserDataCheckerTest {

    UserDataChecker userDataChecker = new UserDataChecker(new Scanner(System.in), new View());

    @ParameterizedTest
    @ValueSource(strings = {"Arthur", "Dima", "John"})
    //@CsvSource({"[A-Z][a-z]{1,20} , name"})
    public void getUserDataInput(String name) {
        Assertions.assertTrue(userDataChecker.checkUserDataInput(name, RegExpression.NAME));
    }
}