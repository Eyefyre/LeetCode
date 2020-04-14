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
public class Q0771_JewelsAndStones {

    public static void main(String[] args) {
        String J = "z";
        String S = "ZZ";
        System.out.println(numJewelsInStones(J,S));
    }

    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        for (char c : jewels) {
            for (char ch : stones) {
                if (ch == c) {
                    result++;
                }
            }
        }
        return result;
    }
}
