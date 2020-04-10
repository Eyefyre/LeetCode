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
public class Q1281_SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        return findProduct(n) - findSum(n);
    }

    public static int findProduct(int n) {
        if (n <= 0) {
            return 1;
        }
        int num = n % 10;
        n = n / 10;
        return num * findProduct(n);
    }

    public static int findSum(int n) {
        if (n <= 0) {
            return 0;
        }
        int sumNum = n % 10;
        n = n / 10;
        return sumNum + findSum(n);
    }

}
