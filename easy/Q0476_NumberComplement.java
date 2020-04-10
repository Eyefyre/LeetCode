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
public class Q0476_NumberComplement {

    public static void main(String[] args) {
        System.out.println(findComplement(10));
    }

    public static int findComplement(int num) {
        String binNum = Integer.toBinaryString(num);
        binNum = binNum.replaceAll("1", "/").replaceAll("0", "1").replaceAll("/", "0");
        int result = Integer.parseInt(binNum, 2);
        return result;
    }
}
