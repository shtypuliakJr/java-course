package controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import views.View;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UserDataInputTest {
    Scanner scanner = new Scanner(System.in);
    View view = new View();
    UserDataInput userDataInput = new UserDataInput(scanner, view);

    @ParameterizedTest
    @ValueSource(strings = {"Arthur", "Dima", "John"})
    //@CsvSource({"[A-Z][a-z]{1,20} , name"})
    public void getUserDataInput(String name) {
        Assertions.assertTrue(userDataInput.checkUserDataInput(name, RegExpression.NAME));
    }
}