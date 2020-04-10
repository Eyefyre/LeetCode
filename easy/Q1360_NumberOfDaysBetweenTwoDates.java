/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 *
 * @author Adam
 */
public class Q1360_NumberOfDaysBetweenTwoDates {

    public static void main(String[] args) {
        String date2 = "2020-01-15";
        String date1 = "2019-12-31";
        System.out.println(daysBetweenDates(date1, date2));
    }

    public static int daysBetweenDates(String date1, String date2) {
        LocalDate dateObject1 = LocalDate.parse(date1);
        LocalDate dateObject2 = LocalDate.parse(date2);
        return (int)Math.abs(DAYS.between(dateObject1, dateObject2));
    }
}
