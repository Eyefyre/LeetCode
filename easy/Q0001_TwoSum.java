/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

/**
 *
 * @author Adam
 */
public class Q0001_TwoSum {

  /*Given an array of integers, 
    return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.*/
    
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        nums = twoSum(nums, target);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    results[0] = j;
                    results[1] = i;
                }
            }
        }
        return results;
    }
}
