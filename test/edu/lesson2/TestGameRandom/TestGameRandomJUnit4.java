package edu.lesson2.TestGameRandom;

import edu.lesson2.GameRandom.Comparison;
import edu.lesson2.GameRandom.Controller;
import edu.lesson2.GameRandom.Model;
import edu.lesson2.GameRandom.View;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGameRandomJUnit4 {
    private final Model model = new Model();
    private final View view = new View();
    private final Controller controller = new Controller(model, view);

    @Test
    public void testCheckInputFalse() {
        try {
            Method isInsideBounds = Controller.class.getDeclaredMethod("isInsideBounds", String.class);
            isInsideBounds.setAccessible(true);
            Assert.assertFalse((Boolean) isInsideBounds.invoke(controller, "120"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCheckWrongInputData() {
        List<String> inputList = new ArrayList<>(Arrays.asList("", " ", "120", "-219", "GG", "hello world!", "12 there is no spoon"));
        for (String inputData : inputList) {
            try {
                Method isInsideBounds = Controller.class.getDeclaredMethod("isInsideBounds", String.class);
                isInsideBounds.setAccessible(true);
                if ((Boolean) isInsideBounds.invoke(controller, inputData)) {
                    Assert.fail();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testCheckCorrectInputData() {
        List<String> inputList = new ArrayList<>(Arrays.asList("2", "90", "1", "23", "55"));

        for (String inputData : inputList) {
            try {
                Method isInsideBounds = Controller.class.getDeclaredMethod("isInsideBounds", String.class);
                isInsideBounds.setAccessible(true);
                if (!(Boolean) isInsideBounds.invoke(controller, inputData)) {
                    Assert.fail();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testGetMinBoundStartCorrect() {
        Assert.assertEquals(0, model.getMinBound());
    }

    @Test
    public void testGetMaxBoundStartCorrect() {
        Assert.assertEquals(100, model.getMaxBound());
    }

    @Test
    public void testGetMinAndMaxBoundStartWrong() {
        for (int i = 1; i < 100; i++) {
            Assert.assertNotEquals(i, model.getMaxBound());
            Assert.assertNotEquals(i, model.getMinBound());
        }
    }

    @Test
    public void testHiddenNumberCorrect() {

        boolean lessThanMaxBound = model.getHiddenNumber() < model.getMaxBound();
        boolean greaterThanMinBound = model.getHiddenNumber() > model.getMinBound();

        if (!(lessThanMaxBound && greaterThanMinBound)) {
            Assert.fail();
        }
    }

    @Test
    public void testHiddenNumberIncorrect() {

        boolean greaterThanMaxBound = model.getHiddenNumber() > model.getMaxBound();
        boolean lessThanMinBound = model.getHiddenNumber() < model.getMinBound();

        if (greaterThanMaxBound || lessThanMinBound) {
            Assert.fail();
        }
    }

    @Test
    public void testCheckInputNumberOnEquals() {
        Comparison comparison;
        int hiddenNumber = model.getHiddenNumber();

        for (int number = 1; number < 100; number++) {
            comparison = model.checkInputNumber(number);
            if (comparison == Comparison.EQUALS) {
                Assert.assertEquals(hiddenNumber, number);
            }
        }
    }

    @Test
    public void testCheckInputNumberOnGreater() {
        Comparison comparison;
        int hiddenNumber = model.getHiddenNumber();

        for (int number = model.getMinBound() + 1; number < hiddenNumber; number++) {
            comparison = model.checkInputNumber(number);
            if (comparison != Comparison.GREATER) {
                Assert.fail();
            }
        }
    }

    @Test
    public void testCheckInputNumberOnLess() {
        Comparison comparison;
        int hiddenNumber = model.getHiddenNumber();

        for (int number = model.getMaxBound() - 1; number > hiddenNumber; number--) {
            comparison = model.checkInputNumber(number);
            if (comparison != Comparison.LESS) {
                Assert.fail();
            }
        }
    }
}
