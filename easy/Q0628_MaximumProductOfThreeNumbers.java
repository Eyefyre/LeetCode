/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import java.util.Arrays;

/**
 *
 * @author Adam
 */
public class Q0628_MaximumProductOfThreeNumbers {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int num1 = nums[nums.length - 1];
        int num2 = nums[nums.length - 2];
        int num3 = nums[nums.length - 3];
        return Math.max(nums[0] * nums[1] * num1 , num1 * num2 * num3);
    }
}
