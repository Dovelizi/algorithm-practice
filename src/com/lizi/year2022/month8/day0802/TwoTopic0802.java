package com.lizi.year2022.month8.day0802;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/2 11:53
 **/
public class TwoTopic0802 {
    Map<String, Integer> mapFood = new HashMap<>();
    Map<String, Set<String>> mapCookingMethod = new HashMap<>();
    Map<String, String> maxRating = new HashMap<>();
    Map<String, String> foodAndMethod = new HashMap<>();
    public TwoTopic0802(String[] foods, String[] cuisines, int[] ratings) {
        for(int i = 0; i < foods.length; i++){
            mapFood.put(foods[i],ratings[i]);
            foodAndMethod.put(foods[i],cuisines[i]);
            Set<String> defaultSet = mapCookingMethod.getOrDefault(cuisines[i], new HashSet<>());
            defaultSet.add(foods[i]);
            mapCookingMethod.put(cuisines[i], defaultSet);
            // 如果对应的烹饪方式没有评分最高的则将当前食物对应的分数写入最高的烹饪方式中
            if(Objects.isNull(maxRating.get(cuisines[i]))){
                maxRating.put(cuisines[i],foods[i]);
            }else {
                // 如果当前烹饪方式有最高评分的食物，则需要比较一下
                String food = maxRating.get(cuisines[i]);
                boolean con1 = ratings[i] > mapFood.get(food);
                boolean con2 = mapFood.get(food) == ratings[i] && foods[i].compareTo(food) < 0;
                if(con1 || con2){
                    maxRating.put(cuisines[i],foods[i]);
                }
            }
        }
    }

    public void changeRating(String food, int newRating) {
        String cookingMethod = foodAndMethod.get(food);
        String mostFood = maxRating.get(cookingMethod);
        // 如果修改的这个食物的评分之前就是最高的评分，现在改低了
        if(mostFood.equals(food) && mapFood.get(food) > newRating){
            mapFood.put(food, newRating);
            Set<String> set = mapCookingMethod.get(cookingMethod);
            int maxFood = Integer.MIN_VALUE;
            String temp = null;
            for(String f : set){
                if(mapFood.get(f) > maxFood){
                    temp = f;
                    maxFood = mapFood.get(f);
                }else if(mapFood.get(f) == maxFood){
                    if(Objects.isNull(temp) || f.compareTo(temp) < 0){
                        temp = f;
                    }
                }
            }
            maxRating.put(cookingMethod, temp);
        }
        // 如果这个食物所属的烹饪方式中最高评分的食物比当前食物改动之后的评分低，则更新
        mapFood.put(food, newRating);
        if(newRating > mapFood.get(mostFood)){
            maxRating.put(cookingMethod, food);
        }else if(newRating == mapFood.get(mostFood) && food.compareTo(mostFood) < 0){
            maxRating.put(cookingMethod, food);
        }
    }

    public String highestRated(String cuisine) {
        return maxRating.get(cuisine);
    }
}
