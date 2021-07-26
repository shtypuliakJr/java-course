package edu.lesson14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 13, 0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 20, 0), "Ужин", 510)
        );
        List<UserMealWithExceed> userMealWithExceeds =
                getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);

        userMealWithExceeds.forEach(System.out::println);


    }

    public static List<UserMealWithExceed> getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {

        if (mealList == null || startTime == null || endTime == null) {
            throw new NullPointerException("");
        }

        Map<LocalDate, Integer> map = getCaloriesByDateImperative(mealList);

        return mealList.stream()
                .filter(userMeal -> TimeUtil.isBetween(userMeal.getDateTime().toLocalTime(), startTime, endTime))
                .map(userMeal ->
                        new UserMealWithExceed(
                                userMeal.getDateTime(),
                                userMeal.getDescription(),
                                userMeal.getCalories(),
                                map.get(userMeal.getDateTime().toLocalDate()) > caloriesPerDay
                        )
                ).collect(Collectors.toList());
    }

    public static Map<LocalDate, Integer> getCaloriesByDateImperative(List<UserMeal> mealList) {
        Map<LocalDate, Integer> map = new HashMap<>();

        for (UserMeal userMeal : mealList) {
            map.computeIfPresent(userMeal.getDateTime().toLocalDate(), (k, value) -> value += userMeal.getCalories());
            map.putIfAbsent(userMeal.getDateTime().toLocalDate(), userMeal.getCalories());
        }

        return map;
    }

    public static Map<LocalDate, Integer> getCaloriesByDateDeclarative(List<UserMeal> mealList) {
        return mealList.stream()
                .collect(Collectors.groupingBy(o -> o.getDateTime().toLocalDate(),
                        Collectors.reducing(0, UserMeal::getCalories, Integer::sum)));
    }
}