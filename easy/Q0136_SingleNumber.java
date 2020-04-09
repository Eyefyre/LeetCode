/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Q0136_SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (!num.contains(a)) {
                num.add(a);
            } else {
                num.remove((Integer)a);
            }
        }
        return num.get(0);
    }
}
