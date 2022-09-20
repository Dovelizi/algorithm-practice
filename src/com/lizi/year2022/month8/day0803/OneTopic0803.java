package com.lizi.year2022.month8.day0803;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/3 08:51
 **/
public class OneTopic0803 {
    Map<String, Pair<Integer, String>> foodCollect = new HashMap<>();
    Map<String, TreeSet<Pair<Integer, String>>> cuisineCollect = new HashMap<>();

    public OneTopic0803(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String food = foods[i], cuisine = cuisines[i];
            int rating = ratings[i];
            foodCollect.put(food, new Pair<>(rating, cuisine));
            cuisineCollect.computeIfAbsent(cuisine, k -> new TreeSet<>((a, b) -> !Objects.equals(a.getKey(), b.getKey()) ? b.getKey() - a.getKey() :
                    a.getValue().compareTo(b.getValue()))).add(new Pair<>(rating, food));
        }
    }

    public void changeRating(String food, int newRating) {
        Pair<Integer, String> stringPair = foodCollect.get(food);
        String cuisine = stringPair.getValue();
        TreeSet<Pair<Integer, String>> pairTreeSet = cuisineCollect.get(cuisine);
        pairTreeSet.remove(new Pair<>(stringPair.getKey(), food));
        pairTreeSet.add(new Pair<>(newRating, food));
        // 更新之前的
        foodCollect.put(food, new Pair<>(newRating, cuisine));

    }

    public String highestRated(String cuisine) {
        return cuisineCollect.get(cuisine).first().getValue();
    }
}
