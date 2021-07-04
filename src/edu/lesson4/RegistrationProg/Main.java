package edu.lesson4.RegistrationProg;

import edu.lesson4.RegistrationProg.notes.EntriesNote;
import edu.lesson4.RegistrationProg.notes.Entry;

public class Main {
    public static void main(String[] args) {
        EntriesNote entriesNote = new EntriesNote();
        Entry entry = new Entry();

        //Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, entry);
        controller.startRegistration();
    }
}
