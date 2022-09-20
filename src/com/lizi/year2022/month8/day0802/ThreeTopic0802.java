package com.lizi.year2022.month8.day0802;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/2 19:40
 **/
public class ThreeTopic0802 {
    public static void main(String[] args) {
        countCollisions("RLRSLL");
    }
    public static int countCollisions(String directions) {
        // 前缀向左的车不会发生碰撞
        directions = directions.replaceAll("^L+", "");
        // 后缀向右的车不会发生碰撞
        directions = new StringBuilder(directions).reverse().toString().replaceAll("^R+", "");
        // 剩下非停止的车必然会碰撞
        return directions.length() - (int) directions.chars().filter(c -> c == 'S').count();
    }
}
