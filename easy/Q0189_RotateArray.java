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
public class Q0189_RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,4,5,7,8};
        rotate(nums,4);
    }

    public static void rotate(int[] nums, int k) {
        if (nums.length != k || nums.length != 0) {
            if (k > nums.length) {
                k = k % nums.length;
            }
            for (int i = 0; i < k; i++) {
                int last = nums[nums.length - 1];
                for (int j = nums.length - 1; j > -1; j--) {
                    if (j != 0) {
                        nums[j] = nums[j - 1];
                    } else {
                        nums[j] = last;
                    }
                }
            }
        }
    }

}
