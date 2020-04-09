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
public class Defanging_an_IP_Address_1108 {

    public static void main(String[] args) {
        System.out.println(defangIPaddr(" "));
    }

    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
