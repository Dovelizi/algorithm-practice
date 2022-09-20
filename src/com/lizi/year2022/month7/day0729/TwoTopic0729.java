package com.lizi.year2022.month7.day0729;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/29 15:53
 **/
public class TwoTopic0729 {
    double len = -1;
    public boolean validSquare(int[] a, int[] b, int[] c, int[] d) {
        return calc(a, b, c) && calc(a, b, d) && calc(a, c, d) && calc(b, c, d);
    }
    public boolean calc(int[] a, int[] b, int[] c) {
        double l1 = getLength(a, b);
        double l2 = getLength(a, c);
        double l3 = getLength(b, c);
        boolean isEquals = (l1 == l2 && l1 + l2 == l3) || (l1 == l3 && l1 + l3 == l2) || (l2 == l3 && l2 + l3 == l1);
        if (!isEquals) {
            return false;
        }
        if (len == -1) {
            len = Math.min(l1, l2);
        }
        else if (len == 0 || len != Math.min(l1, l2)) {
            return false;
        }
        return true;
    }

    public double getLength(int[] v1, int[] v2){
        int x1 = v1[0];
        int x2 = v2[0];
        int y1 = v1[1];
        int y2 = v2[1];
        return Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
    }
}
