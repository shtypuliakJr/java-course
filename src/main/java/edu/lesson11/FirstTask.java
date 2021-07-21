package edu.lesson11;

import java.util.*;

public class FirstTask {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));
        Map<Integer, Integer> map = getUniqueElementsCounts(list);
        printMap(map);
    }

    public static Map<Integer, Integer> getUniqueElementsCounts(List<Integer> list) {
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
