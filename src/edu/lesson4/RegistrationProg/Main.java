package edu.lesson4.RegistrationProg;

import edu.lesson4.RegistrationProg.controllers.Controller;
import edu.lesson4.RegistrationProg.notes.User;
import edu.lesson4.RegistrationProg.views.View;

public class Main {
    public static void main(String[] args) {
        User entry = new User();

        //Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, entry);
        controller.startRegistration();
    }
}

