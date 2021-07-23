package edu.lesson13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {

        // ToDo: Сделать массив int. Из него получить IntStream. Для него
        int[] ints = {1, 20, 0, -12, 20, 0, 2, 100, 50, -16};
        IntStream intStream = IntStream.of(ints);

        // ToDo: 1. Найти среднее значение элементов массива
        System.out.print("Task 1: ");
        intStream.average().ifPresent(System.out::println);

        // ToDo: 2. Найти минимальный элемент, значение и индекс
        //intStream.

        // ToDo: 3. Посчитать количество элементов равных нулю
        System.out.print("Task 3: ");
        long countEqualsZero = Arrays.stream(ints).filter(v -> v == 0).summaryStatistics().getCount();
        System.out.println(countEqualsZero);

        // ToDo: 4. Посчитать количество элементов больше нуля
        System.out.print("Task 4: ");
        long countGreaterThanZero = Arrays.stream(ints).filter(v -> v > 0).count();
        System.out.println(countGreaterThanZero);

        // ToDo: 5. Помножить элементы массива на число
        System.out.print("Task 5: ");
        Arrays.stream(ints).map(v -> v * 3).forEach(v -> System.out.print(v + " "));

    }
}
