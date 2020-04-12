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
public class Q1365_HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        nums = smallerNumbersThanCurrent(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] results = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smallerCounter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    smallerCounter++;
                }
            }
            results[i] = smallerCounter;
        }
        return results;
    }
}
