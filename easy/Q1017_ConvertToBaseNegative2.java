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
public class Q1017_ConvertToBaseNegative2 {

    public static void main(String[] args) {
        System.out.println(baseNeg2(2));
    }

    public static String baseNeg2(int N) {
        if (N == 0) {
            return "0";
        }
        String converted = "";
        while (N != 0) {
            int remainder = N % -2;
            N /= -2;
            if (remainder < 0) {
                remainder += (-(-2));
                N += 1;
            }
            converted = String.valueOf(remainder) + converted;
        }
        return converted;
    }
}
