package lesson2.TestGameRandom;

import edu.lesson2.GameRandom.*;
import org.junit.jupiter.api.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

public class TestMain {

    private Model model = new Model();
    private View view = new View();
    private Controller controller = new Controller(model, view);

    @Disabled
    @ParameterizedTest
    @DisplayName("Check incorrect input for method 'checkInput'.")
    @ValueSource(strings = {"", " ", "120", "-219", "GG", "hello world!"})
    public void testCheckInputFalse(String input) {
        Assertions.assertEquals(false, controller.checkInput(input));
    }

    @Disabled
    @ParameterizedTest
    @DisplayName("Check incorrect input for method 'checkInput'.")
    @ValueSource(strings = {"2", "90", "1", "100"})
    public void testCheckInputTrue(String input) {
        Assertions.assertEquals(true, controller.checkInput(input));
    }


    @Test
    public void testHiddenNumber() {
        if (model.getHiddenNumber() <= model.getMax() &&
                model.getHiddenNumber() >= model.getMin()) {
            return;
        } else {
            Assertions.fail();
        }
    }
}