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
public class Q0303_RangeSumQueryImmutable {

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray array = new NumArray(nums);
        System.out.println(array.sumRange(0, 5));
    }
}

class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k < j + 1; k++) {
            sum += this.nums[k];
        }
        return sum;
    }
}
