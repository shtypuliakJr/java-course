package edu.lesson4.RegistrationProg;

import edu.lesson4.RegistrationProg.controllers.Controller;
import edu.lesson4.RegistrationProg.user.User;
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

        /**
         * Instance of User class
         * @see User
         */
        User entry = new User();

        /**
         * @see View
         * */
        View view = new View();

        /**
         * @see Controller#Controller(View, User)
         */
        Controller controller = new Controller(view, entry);

        /**
         * This method is used to start registration
         * @see Controller#startRegistration()
         */
        controller.startRegistration();
    }
}

