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
public class Q0796_RotateString {

    public static void main(String[] args) {
        String A = "";
        String B = "";
        System.out.println(rotateString(A, B));
    }

    public static boolean rotateString(String A, String B) {
        if (A.equals(B)) {
            return true;
        }
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                return true;
            }
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
        }
        return false;
    }
}
