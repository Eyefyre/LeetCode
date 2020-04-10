/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.done;

import java.time.LocalDate;

/**
 *
 * @author Adam
 */
public class Q1154_DayOfTheYear {

    public static void main(String[] args) {
        System.out.println(dayOfYear("2004-03-01"));
    }

    public static int dayOfYear(String date) {
        LocalDate localdate = LocalDate.parse(date);
        return localdate.getDayOfYear();
    }
}
