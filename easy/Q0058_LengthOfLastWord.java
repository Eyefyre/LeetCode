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
public class Q0058_LengthOfLastWord {

    public static void main(String[] args) {
        String name = "Hello wordl";
        int length = lengthOfLastWord(name);
        System.out.println(length);
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if(words.length == 0){
            return 0;
        }
        return words[words.length-1].length();
    }
}
