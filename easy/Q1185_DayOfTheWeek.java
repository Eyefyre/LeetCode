/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author Adam
 */
public class Q1185_DayOfTheWeek {

    public static void main(String[] args) {
        int year = 1999;
        int month = 7;
        int day = 18;
        System.out.println(dayOfTheWeek(day,month,year));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year,month,day);
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);
    }
}
