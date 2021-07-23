package edu.lesson13;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {

        // ToDo: Сделать массив int. Из него получить IntStream. Для него
        int[] ints = {1, 20, 0, -12, -20, 0, 2, 100, 50, -10};
        IntStream intStream = IntStream.of(ints);

        // ToDo: 1. Найти среднее значение элементов массива
        intStream.average().ifPresent(value -> System.out.println("Task 1: " + value));

        // ToDo: 2. Найти минимальный элемент, значение и индекс
        IntStream.range(0, ints.length).boxed()
                .reduce((i, j) -> ints[i] > ints[j] ? j : i)
                .ifPresent(min -> {
                    System.out.println("Task 2: ");
                    System.out.println("\tMin element = " + ints[min]);
                    System.out.println("\tIndex of min element = " + min);
                });

        // ToDo: 3. Посчитать количество элементов равных нулю
        long countEqualsZero = Arrays.stream(ints).filter(v -> v == 0).summaryStatistics().getCount();
        System.out.println("Task 3: " + countEqualsZero);

        // ToDo: 4. Посчитать количество элементов больше нуля
        long countGreaterThanZero = Arrays.stream(ints).filter(v -> v > 0).count();
        System.out.println("Task 4: " + countGreaterThanZero);

        // ToDo: 5. Помножить элементы массива на число
        System.out.print("Task 5: ");
        IntStream.of(ints).map(v -> v * 3).forEach(v -> System.out.print(v + " "));
    }
}
