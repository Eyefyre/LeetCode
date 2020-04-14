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
public class Q0657_RobotReturnToOrigin {

    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        char[] moveList = moves.toCharArray();
        int location = 0;
        for (char move : moveList) {
            switch (move) {
                case 'U':
                    location += 1;
                    break;
                case 'D':
                    location -= 1;
                    break;
                case 'L':
                    location += 2;
                    break;
                case 'R':
                    location -= 2;
                    break;
            }
        }
        return location == 0;
    }
}
