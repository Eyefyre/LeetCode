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
public class Q0824_GoatLatin {

    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        System.out.println(toGoatLatin(s));
    }

    public static String toGoatLatin(String S) {
        String[] words = S.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].substring(0, 1).equalsIgnoreCase("a") || words[i].substring(0, 1).equalsIgnoreCase("e") || words[i].substring(0, 1).equalsIgnoreCase("i") || words[i].substring(0, 1).equalsIgnoreCase("o") || words[i].substring(0, 1).equalsIgnoreCase("u")) {
                words[i] += "ma";
                for (int j = 0; j < i + 1; j++) {
                    words[i] += "a";
                }
            } else {
                words[i] = words[i].substring(1) + words[i].substring(0, 1);
                words[i] += "ma";
                for (int j = 0; j < i + 1; j++) {
                    words[i] += "a";
                }
            }
        }
        String result = String.join(" ", words);
        return result;
    }
}
