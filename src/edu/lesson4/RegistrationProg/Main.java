package edu.lesson4.RegistrationProg;

import edu.lesson4.RegistrationProg.controllers.Controller;
import edu.lesson4.RegistrationProg.notes.User;
import edu.lesson4.RegistrationProg.views.View;

//public class Main {
//    public static void main(String[] args) {
//        User entry = new User();
//
//        //Model model = new Model();
//        View view = new View();
//        Controller controller = new Controller(view, entry);
//        controller.startRegistration();
//        String str = "hello world!";
//        String strings = str.subSequence(1, 3).toString();
//    }
//}

public class Main{

    static String arr[] = {"Now", "is", "the", "time", "for", "all",

            "good", "men", "to", "come", "to", "the",

            "aid", "of", "their", "country"};

    public static void main(String args[]) {

        for (int j = 0; j < arr.length; j++) {

            for (int i = j + 1; i < arr.length; i++) {

                if (arr[i].compareTo(arr[j]) < 0) {

                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);

        }

    }
}