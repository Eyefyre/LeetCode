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
public class Q1313_DecompressRunLengthEncodedList {

    public static void main(String[] args) {
        int[] nums = {55,11,70,26,62,64};
        nums = decompressRLElist(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            length+= freq;
        }
        int previousLength = 0;
        int[] results = new int[length];
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            int[] c = new int[freq];
            for (int j = 0; j < freq; j++) {
                c[j] = val;
            }
            System.arraycopy(c, 0, results, previousLength, c.length);
            previousLength += c.length;
        }
        return results;
    }
}
