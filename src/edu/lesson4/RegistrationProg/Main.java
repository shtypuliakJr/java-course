package edu.lesson4.RegistrationProg;

import edu.lesson4.RegistrationProg.controllers.Controller;
import edu.lesson4.RegistrationProg.models.Model;
import edu.lesson4.RegistrationProg.views.View;

/**
 * @author Arthur Shtypuliak
 * @version 1.1
 * @since 1.0
 * This is Main class of program (entry point)
 */
public class Main {

    /**
     * Entry point of program
     *
     * @param args no input parameters
     */
    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);

        controller.start();

    }
}

