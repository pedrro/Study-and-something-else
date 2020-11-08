package com.exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Smoothie {

    public static String ingredients(String order) {
        if(order.isEmpty()) {
            throw new IllegalArgumentException();
        }

        HashMap<String, String[]> types = buildTypes();
        String[] orderItems = parserInput(order);
        String orderType = orderItems[0];
        String[] orderItemsWithoutType = Arrays.copyOfRange(orderItems, 1, orderItems.length);
        String[] orderSmoothie = getOrderSmoothie(types, orderType);
        List<String> restrictedItems = removeRestrictedItems(orderItemsWithoutType);

        List<String> validOrder = Optional.of(Arrays.asList(orderSmoothie))
                .filter(smoothieItems -> identifyExtraItemsNotOnSmooth(restrictedItems, smoothieItems))
                .orElseThrow(IllegalArgumentException::new);

        String finalOrder = "";

        if(!restrictedItems.isEmpty()) {
            finalOrder = validOrder.stream()
                    .filter(removeRestrictedItems(restrictedItems))
                    .collect(Collectors.joining(","));
        } else {
            finalOrder = String.join(",", validOrder);
        }

        return finalOrder;
    }

    private static HashMap<String, String[]> buildTypes() {
        String[] classic = new String[]{"strawberry", "banana", "pineapple", "mango", "peach", "honey"};
        String[] freezie = new String[]{"blackberry", "blueberry", "black currant", "grape juice", "frozen yogurt"};
        String[] greenie = new String[]{"green apple", "lime", "avocado", "spinach", "ice", "apple juice"};
        String[] justDesserts = new String[]{"banana", "ice cream", "chocolate", "peanut", "cherry"};

        Arrays.sort(classic);
        Arrays.sort(freezie);
        Arrays.sort(greenie);
        Arrays.sort(justDesserts);

        HashMap<String, String[]> types = new HashMap<>();
        types.put("Classic", classic);
        types.put("Freezie", freezie);
        types.put("Greenie", greenie);
        types.put("JustDesserts", justDesserts);

        return types;
    }

    private static String[] parserInput(String input) {
        return input.split(",");
    }

    private static List<String> removeRestrictedItems(String[] itens) {
        return Arrays.stream(itens)
                .filter(item -> item.contains("-"))
                .map(string -> string.replace("-", ""))
                .collect(Collectors.toList());
    }

    private static boolean identifyExtraItemsNotOnSmooth(List<String> orderItems, List<String> smoothieItems) {
        return smoothieItems.containsAll(orderItems);
        }

    private static String[] getOrderSmoothie(HashMap<String, String[]> types, String orderType) {
        return Optional.ofNullable(types.get(orderType))
                .orElseThrow(IllegalArgumentException::new);
    }

    private static Predicate<String> removeRestrictedItems(List<String> restrictedItems) {
        return o -> !restrictedItems.contains(o);
    }
}