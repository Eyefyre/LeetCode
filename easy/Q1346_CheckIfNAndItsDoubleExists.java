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
public class Q1346_CheckIfNAndItsDoubleExists {

    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 11};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (((arr[i] == arr[j] * 2) || arr[i] * 2 == arr[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}
