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
public class Q0867_TransposeMatrix {

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        grid = transpose(grid);
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.println(grid[j][i]);
            }
        }

    }

    public static int[][] transpose(int[][] A) {
        int rows = A.length;
        int columns = A[0].length;
        int transpose[][] = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;
    }
}
