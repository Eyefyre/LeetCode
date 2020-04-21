/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medium.done;

import java.util.Arrays;

/**
 *
 * @author Adam
 */
public class Q0287_FindTheDuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return (nums[i]);
            }
        }
        return 0;
    }
}
