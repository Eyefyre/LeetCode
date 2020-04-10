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
public class Q1009_ComplementOfBase10Integer {

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(10));
    }

    public static int bitwiseComplement(int N) {
        String binNum = Integer.toBinaryString(N);
        binNum = binNum.replaceAll("1", "/").replaceAll("0", "1").replaceAll("/", "0");
        int result = Integer.parseInt(binNum, 2);
        return result;
    }
}
