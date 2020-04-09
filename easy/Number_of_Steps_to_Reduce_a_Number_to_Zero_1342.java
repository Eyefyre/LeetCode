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
public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int num) {
        int counter = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            counter++;
        }
        return counter;
    }
}
