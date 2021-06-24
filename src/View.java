public class View {

    public static final String INPUT_DATA_INCORRECT = "Input is incorrect!";
    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";
    public static final String OUTPUT_TASK = "Enter 'Hello' and then 'world!':";
    public static final String ADDED_HELLO = "Added 'Hello';";
    public static final String ADDED_WORLD = "Added 'world!';";

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printNeedfulInput(String word) {
        System.out.printf(INPUT_DATA_INCORRECT + " (need '%s')\n" ,word);
    }

}
