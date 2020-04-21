/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medium.done;

/**
 *
 * @author Adam
 */
public class Q0075_SortColors {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        
    }

    public static void sortColors(int[] nums) {
        boolean swapped = true;
        int start = 0;
        int end = nums.length;
        while (swapped == true) {
            swapped = false;
            for (int i = start; i < end - 1; ++i) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
            swapped = false;
            end = end - 1;
            for (int i = end - 1; i >= start; i--) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    swapped = true;
                }
            }
            start = start + 1;
        }
    }
}
