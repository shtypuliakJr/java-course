package edu.lesson1.HelloWorldMVC;

class View {

    public static final String INPUT_DATA_INCORRECT = "Input is incorrect.";
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";
    public static final String OUTPUT_TASK = "Enter 'Hello' and then 'world!':";
    public static final String REQUIRE_TWO_WORDS = "Enter two words!";


    public void printMessage(String message){
        System.out.println(message);
    }
    public void printNeedfulInput(String word) {
        System.out.printf(INPUT_DATA_INCORRECT + " (need '%s')\n" ,word);
    }

}
