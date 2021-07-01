package edu.lesson2.TestGameRandom;

import edu.lesson2.GameRandom.*;
import org.junit.jupiter.api.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestMain {

    private final Model model = new Model();
    private final View view = new View();
    private final Controller controller = new Controller(model, view);

    @ParameterizedTest
    @DisplayName("Check incorrect input for method 'checkInput'.")
    @ValueSource(strings = {"", " ", "120", "-219", "GG", "hello world!"})
    public void testCheckInputFalse(String input) {
        Assertions.assertFalse(controller.isNumberInsideBounds(input));
    }

    @ParameterizedTest
    @DisplayName("Check incorrect input for method 'checkInput'.")
    @ValueSource(strings = {"2", "90", "1", "100"})
    public void testCheckInputTrue(String input) {
        Assertions.assertTrue(controller.isNumberInsideBounds(input));
    }

    @Test
    public void testHiddenNumber() {
        if (!(model.getHiddenNumber() < model.getMaxBound() && model.getHiddenNumber() > model.getMinBound())) {
            Assertions.fail();
        }
    }

    @ParameterizedTest
    @DisplayName("Check setBounds with correct input.")
    @ValueSource(ints = {20, 69, 42, 1})
    public void testIsSetNewBoundsCorrect(int inputNumber) {
        Assertions.assertTrue(model.isSetNewBounds(Comparison.GREATER, inputNumber));
    }

    @ParameterizedTest
    @DisplayName("Check setBounds with incorrect input.")
    @ValueSource(ints = {1200, 102, -10, 200, 0, 100})
    public void testIsSetNewBoundsIncorrect(int inputNumber) {
        Assertions.assertFalse(model.isSetNewBounds(Comparison.GREATER, inputNumber));
    }
}