package edu.task1;

public class Model {

    private StringBuilder str = new StringBuilder();

    private boolean flagHello = false;
    private boolean flagWorld = false;

    public boolean isFlagHello() { return flagHello; }

    public boolean isFlagWorld() { return flagWorld; }

    public String getSentence() { return str.toString().trim(); }

    public void addWord(String str) {

        if (str.equals(View.HELLO)) {
            this.flagHello = true;
        }
        else if (str.equals(View.WORLD)) {
            this.flagWorld = true;
        }
        this.str.append(str + " ");
    }
}
