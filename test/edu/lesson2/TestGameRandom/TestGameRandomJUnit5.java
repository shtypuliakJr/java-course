package edu.lesson2.TestGameRandom;

import edu.lesson2.GameRandom.*;
import org.junit.jupiter.api.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Method;

public class TestGameRandomJUnit5 {

    private final Model model = new Model();
    private final View view = new View();
    private final Controller controller = new Controller(model, view);

    @Test
    public void testCheckInputFalse() {
        try {
            Method isInsideBounds = Controller.class.getDeclaredMethod("isInsideBounds", String.class);
            isInsideBounds.setAccessible(true);
            Assertions.assertFalse((Boolean) isInsideBounds.invoke(controller, "120"));

        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }

    @Test
    public void testHiddenNumber() {
        if (!(model.getHiddenNumber() < model.getMaxBound() && model.getHiddenNumber() > model.getMinBound())) {
            Assertions.fail();
        }
    }

    @ParameterizedTest
    @DisplayName("Check incorrect input for method 'checkInput'.")
    @ValueSource(strings = {"", " ", "120", "-219", "GG", "hello world!"})
    public void testCheckInputFalse(String inputData) {
        try {
            Method isInsideBounds = Controller.class.getDeclaredMethod("isInsideBounds", String.class);
            isInsideBounds.setAccessible(true);
            Assertions.assertFalse((Boolean) isInsideBounds.invoke(controller, inputData));
        } catch (Exception e) {
            //e.printStackTrace();
            Assertions.fail();
        }
    }

    @ParameterizedTest
    @DisplayName("Check correct input for method 'checkInput'.")
    @ValueSource(strings = {"2", "90", "1", "23"})
    public void testCheckInputTrue(String inputData) {
        try {
            Method isInsideBounds = Controller.class.getDeclaredMethod("isInsideBounds", String.class);
            isInsideBounds.setAccessible(true);
            Assertions.assertTrue((Boolean) isInsideBounds.invoke(controller, inputData));
        } catch (Exception e) {
            e.printStackTrace();
            Assertions.fail();
        }
    }
}