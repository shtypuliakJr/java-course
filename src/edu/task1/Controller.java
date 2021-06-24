package edu.task1;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processConsoleInput() {

        view.printMessage(View.OUTPUT_TASK);

        Scanner scanner = new Scanner(System.in);

        String str;
        while (true) {

            if (model.isFlagHello() && model.isFlagWorld()) {
                view.printMessage(model.getSentence());
                break;
            }

            str = scanner.next();
            if (str.equals(View.HELLO) && !model.isFlagHello()) {
                model.addWord(View.HELLO);
                //view.printMessage(edu.task1.View.ADDED_HELLO);
            } else if (str.equals(View.WORLD) && model.isFlagHello()) {
                model.addWord(View.WORLD);
                //view.printMessage(edu.task1.View.ADDED_WORLD);
            } else {
                view.printNeedfulInput(model.isFlagHello() ? View.WORLD : View.HELLO);
            }
        }
    }
}
