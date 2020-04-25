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
public class Q0693_BinaryNumberWithAlternatingBits {

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(10));
    }

    public static boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        char[] binaryArray = binary.toCharArray();
        for(int i = 0;i< binaryArray.length-1;i++){
            if(binaryArray[i] == binaryArray[i+1]){
                return false;
            }
        }
        return true;
    }
}
