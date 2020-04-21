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
public class Q0191_NumberOf1Bits {

    public static void main(String[] args) {
        System.out.println(hammingWeight(11001001));
    }

    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
        
    }
}
