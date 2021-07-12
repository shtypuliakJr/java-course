package edu.lesson1.helloworld;


import edu.lesson1.helloworld.mvc.Controller;
import edu.lesson1.helloworld.mvc.Model;
import edu.lesson1.helloworld.mvc.View;

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processConsoleInput();
    }
}


