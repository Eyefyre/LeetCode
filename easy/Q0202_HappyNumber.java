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
public class Q0202_HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int counter = 0;
        while(n != 1 && counter <= 100){
            String num = Integer.toString(n);
            int newNum = 0;
            for(char c: num.toCharArray()){
                int cNum = Integer.parseInt(Character.toString(c));
                cNum = cNum * cNum;
                newNum += cNum;
            }
            n = newNum;
            counter++;
        }
        return counter <= 100;
    }
}
