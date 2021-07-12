package edu.lesson1.helloworld.mvc;

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
        String line;
        while (scanner.hasNext()) {

            line = scanner.nextLine();
            String[] words = line.split(" ");

            if (words.length == 2 && words[0].matches("[a-zA-Z]+") && words[1].matches("[a-z!]+")) {
                model.addWord(words[0]);
                model.addWord(words[1]);
                if (model.isFlagHello() && model.isFlagWorld()) {
                    view.printMessage(model.getSentence());
                    break;
                } else {
                    view.printNeedfulInput(model.isFlagHello() ? View.WORLD : View.HELLO);
                    model.deleteSentence();
                }
            } else {
                view.printNeedfulInput(View.REQUIRE_TWO_WORDS);
            }
        }
    }
}
