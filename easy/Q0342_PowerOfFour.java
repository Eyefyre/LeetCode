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
public class Q0342_PowerOfFour {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(5));
    }

    public static boolean isPowerOfFour(int num) {
        if (num < 1) {
            return false;
        }
        while (num % 4 == 0) {
            num = num / 4;
        }
        return num == 1;
    }
}
