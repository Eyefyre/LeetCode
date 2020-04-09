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
public class Q1351_CountNegativeNumbersInASortedMatrix {

    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int[][] grid2 = {{5,1,0},{-5,-5,-5}};
        System.out.println(countNegatives(grid2));
    }

    public static int countNegatives(int[][] grid) {
        int counter = 0;
        for (int[] row : grid) {
            for (int j = 0; j < row.length; j++) {
                if (row[j] < 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
