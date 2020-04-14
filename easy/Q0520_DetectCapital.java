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
public class Q0520_DetectCapital {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {
        return (word.toUpperCase().equals(word) || word.toLowerCase().equals(word) || (word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()).equals(word));
    }
}
