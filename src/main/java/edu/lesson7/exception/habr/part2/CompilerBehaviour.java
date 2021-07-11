package edu.lesson7.exception.habr.part2;

public class CompilerBehaviour {
    public static void main(String[] args) throws Exception {
        Throwable t = new Exception(); // и лететь будет Exception
        // throw t; // но тут ошибка компиляции

        // example

        Object ref = "Hello!";  // ref указывает на строку
        // char c = ref.charAt(0); // но тут ошибка компиляции

    }
    // компилятор не отcледит ошибку при вызове метода f0
    public static void f0(Throwable t) throws Exception {
       // throw t;
    }
    public static void f1(Object ref){
       // char c = ref.charAt(0);
    }
}

class CompilerBehaviourCatch {

    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception(); // а лететь будет Exception
            throw t;
        } catch (Exception e) { // перехвативаем Exception
            System.out.println("Перехвачено!");
        }
    }
}