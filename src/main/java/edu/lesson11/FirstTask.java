package edu.lesson11;

import java.util.*;

public class FirstTask {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));

        Map<Integer, Integer> mapImp = getUniqueElementsCountsImperative(list);

        //printMap(mapImp);
        mapImp.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    public static Map<Integer, Integer> getUniqueElementsCountsUsingMapFunctions(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            map.computeIfPresent(i, (k, y) -> y += 1);
            map.putIfAbsent(i, 1);
        }
        return map;
    }

    public static Map<Integer, Integer> getUniqueElementsCountsImperative(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key : list) {
            Integer value = map.get(key);
            if (value == null) {
                map.put(key, 1);
            } else {
                map.replace(key, ++value);
            }
        }
        return map;
    }

    public static void printMap(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
            System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
        }
    }
}
