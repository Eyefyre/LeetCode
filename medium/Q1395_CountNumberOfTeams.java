/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medium.done;

/**
 *
 * @author Adam
 */
public class Q1395_CountNumberOfTeams {

    public static void main(String[] args) {
        int[] rating = {2,5,3,4,1};
        System.out.println(numTeams(rating));
    }

    public static int numTeams(int[] rating) {
        int teams = 0;
        for (int i = 0; i < rating.length; i++) {
            for (int j = i; j < rating.length; j++) {
                for (int k = j; k < rating.length; k++) {
                    if (((rating[i] < rating[j]) && (rating[j] < rating[k])) || ((rating[i] > rating[j]) && (rating[j] > rating[k]))) {
                        teams++;
                    }
                }
            }
        }
        return teams;
    }
}
