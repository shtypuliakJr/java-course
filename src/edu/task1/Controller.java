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
            model.addWord(scanner.next());
            model.addWord(scanner.next());
            if (model.isFlagHello() && model.isFlagWorld()) {
                view.printMessage(model.getSentence());
                break;
            } else {
                view.printNeedfulInput(model.isFlagHello() ? View.WORLD : View.HELLO);
                model.deleteSentence();
            }
        }
    }
}
