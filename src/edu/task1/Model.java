package edu.task1;

public class Model {

    private StringBuilder sentence = new StringBuilder();

    private boolean flagHello = false;
    private boolean flagWorld = false;

    public void setFlagHello(boolean flagHello) { this.flagHello = flagHello; }

    public void setFlagWorld(boolean flagWorld) { this.flagWorld = flagWorld; }

    public boolean isFlagHello() { return flagHello; }

    public boolean isFlagWorld() { return flagWorld; }

    public String getSentence() { return sentence.toString().trim(); }

    public void deleteSentence() {
        this.sentence.delete(0, sentence.length());
        flagWorld = false;
        flagHello = false;
    }

    public void addWord(String word) {
        if (!flagHello && word.equals(View.HELLO)) {
            sentence.append(word);
            flagHello = true;
        } else if (flagHello && word.equals(View.WORLD)) {
            sentence.append(" " + View.WORLD);
            flagWorld = true;
        }
    }
}
