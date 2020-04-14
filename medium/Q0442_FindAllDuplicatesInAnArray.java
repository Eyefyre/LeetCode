/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medium.done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Q0442_FindAllDuplicatesInAnArray {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> results = findDuplicates(nums);
        System.out.println(results);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> results = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                results.add(nums[i]);
            }
        }
        return results;
    }
}
