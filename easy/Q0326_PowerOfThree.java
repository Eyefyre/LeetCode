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
public class Q0326_PowerOfThree {

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(9));
    }

    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}
