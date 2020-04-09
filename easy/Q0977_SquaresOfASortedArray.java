/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import java.util.Arrays;

/**
 *
 * @author Adam
 */
public class Q0977_SquaresOfASortedArray {

    public static void main(String[] args) {
        int[] a = {-4,-1,0,3,10};
        a = sortedSquares(a);
        for(int i = 0;i<a.length;i++){
            System.out.print(" " + a[i] + " ");
        }
    }

    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

}
