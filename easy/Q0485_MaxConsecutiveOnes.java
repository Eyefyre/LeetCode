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
public class Q0485_MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int highestCounter = 0;
        int currentCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCounter++;
            } else {
                currentCounter = 0;
            }
            if (highestCounter < currentCounter) {
                highestCounter = currentCounter;
            }
        }
        return highestCounter;
    }
}
