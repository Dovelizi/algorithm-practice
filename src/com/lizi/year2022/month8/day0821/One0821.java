package com.lizi.year2022.month8.day0821;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/21 10:14
 **/
public class One0821 {
    public static void main(String[] args) {
        minNumberOfHours(11, 23, new int[] {69,22,93,68,57,76,54,72,8,78,88,15,58,61,25,70,58,91,79,22,91,74,90,75,31,53,31,7,51,96,76,17,64,89,83,54,28,33,32,45,20},
                new int[] {51,81,46,80,56,7,46,74,64,20,84,66,13,91,49,30,75,43,74,88,82,51,72,4,80,30,10,19,40,27,21,71,24,94,79,13,40,28,63,85,70});
//            minNumberOfHours(1, 1, new int[]{1,1,1,1}, new int[]{1,1,1,50});
    }
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int ans = 0;
        for (int i = 0; i < energy.length; i++) {
          if(initialEnergy <= energy[i]) {
              int needEnergy = (energy[i] + 1) - initialEnergy;
              ans += needEnergy;
              initialEnergy += needEnergy;
          }
          initialEnergy -= energy[i];
          if(initialExperience <= experience[i]){
              int needExperience = (experience[i] + 1) - initialExperience;
              ans += needExperience;
              initialExperience += needExperience;
          }
          initialExperience += experience[i];
        }
        return ans;
    }
}
