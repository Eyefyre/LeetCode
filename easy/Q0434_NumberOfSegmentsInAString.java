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
public class Q0434_NumberOfSegmentsInAString {

    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        System.out.println(countSegments(s));
        System.out.println(countSegments(""));
    }

    public static int countSegments(String s) {
        s = s.trim().replaceAll(" +", " ");
        if(s.isEmpty()){
            return 0;
        }
        return s.split(" ").length;
        
    }
}
