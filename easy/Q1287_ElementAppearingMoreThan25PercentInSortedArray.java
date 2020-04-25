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
public class Q1287_ElementAppearingMoreThan25PercentInSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        System.out.println(findSpecialInteger(nums));
    }

    public static int findSpecialInteger(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int counter = 0;
        int quarter = arr.length / 4;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter >= quarter) {
                return arr[i];
            }
        }
        return 0;
    }
}
