package edu.lesson14;

import edu.lesson4.registrationprogram.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        HashMap<LocalDate, Integer> map = new HashMap<>();

        for (UserMeal userMeal : mealList) {
            map.computeIfPresent(userMeal.getDateTime().toLocalDate(), (k, value) -> value += userMeal.getCalories());
            map.putIfAbsent(userMeal.getDateTime().toLocalDate(), userMeal.getCalories());
        }

        // map.forEach((k, v) -> System.out.println(k + " " + v));

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
}