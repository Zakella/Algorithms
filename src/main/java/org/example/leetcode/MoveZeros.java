package org.example.leetcode;

import java.util.Arrays;

public class MoveZeros {

    public void moveZeroes(int[] nums) {

        System.out.println(Arrays.toString(nums));

        int notZero = 0;
        for (int i = 0; i <nums.length ; i++) {
            int value = nums[i];
            if  (value != 0){

                int captIndex = i;

                while (true){
                    if (captIndex == 0){
                        break;
                    }

                    if (nums[captIndex-1] == 0) {
                        int buffZero = 0;
                        nums[captIndex-1] = nums[captIndex];
                        nums[captIndex] = buffZero;

                    }

                    captIndex--;

                }

            }

        }

        System.out.println(Arrays.toString(nums));


    }
}
