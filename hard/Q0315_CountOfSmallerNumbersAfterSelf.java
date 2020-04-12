/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hard.done;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Q0315_CountOfSmallerNumbersAfterSelf {

    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        List<Integer> results = countSmaller(nums);
        System.out.println(results);
    }

    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int smallerCounter = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    smallerCounter++;
                }
            }
            results.add(smallerCounter);
        }
        return results;
    }
}
