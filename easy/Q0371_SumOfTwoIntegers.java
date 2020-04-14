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
public class Q0371_SumOfTwoIntegers {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(getSum(a, b));
    }

    public static int getSum(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getSum(a ^ b, (a & b) << 1);
        }
    }
}
