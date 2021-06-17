package com.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class GroupingDishes {
    static String[][] groupingDishes(String[][] dishes) {
        HashMap<String, List<String>> temp = new HashMap<>();
        Set<String> uniqueIngredients = new LinkedHashSet<>();
        for (int i = 0; i < dishes.length; i++) {
            String[] dish = dishes[i];
            List<String> ingredients = new ArrayList<>();
            for (int j = 0; j < dish.length; j++) {
                String plate = dish[0];
                if (j == 0) {
                    temp.put(plate, Collections.emptyList());
                } else {
                    uniqueIngredients.add(dish[j]);
                    ingredients.add(dish[j]);
                    temp.put(plate, ingredients);
                }
            }
        }

        HashMap<String, List<String>> temp2 = new HashMap<>();

        uniqueIngredients.forEach(ingredient -> {
            List<String> plates = new ArrayList<>();
            temp.forEach((key, value) -> {
                if (value.contains(ingredient)) {
                    plates.add(key);
                    temp2.put(ingredient, plates);
                }
            });
        });

        Map<String, List<String>> sortedMap = new TreeMap<>(temp2);

        String[][] result = sortedMap.entrySet().stream().filter(v -> v.getValue().size() > 1)
                .map(e -> Stream.concat(Stream.of(e.getKey()), e.getValue().stream().sorted()).toArray(String[]::new))
                .toArray(String[][]::new);


        return result;
    }

    public static void main(String[] args) {
        String[][] a = new String[][]{{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};

        groupingDishes(a);
    }

}
