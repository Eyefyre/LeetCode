/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Q0412_FizzBuzz {

    public static void main(String[] args) {
        List<String> list = fizzBuzz(100);
        System.out.println(list);    
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            StringBuilder builder = new StringBuilder();
            if (i % 3 == 0) {
                builder.append("Fizz");
            }
            if (i % 5 == 0) {
                builder.append("Buzz");
            }
            if (builder.length() == 0) {
                builder.append(Integer.toString(i));
            }
            result.add(builder.toString());
        }
        return result;
    }
}
