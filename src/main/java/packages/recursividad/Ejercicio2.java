/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages.recursividad;

import java.util.Scanner;

/**
 *
 * @author Jurgenmolina <jurgenmolina29@gmail.com>
 */
public class Ejercicio2 {
    
//    2. Realice un método recursivo que reciba un numero decimal y retorne
//    su representación en hexadecimal.

    static String hexa = "";
    static String hexadecimales = "0123456789abcdef";

    public static String hexadecimal(int decimal) {
        if (decimal > 0) {
            int residuo = decimal % 16;
            hexa = hexadecimales.charAt(residuo) + hexa;
            decimal /= 16;
            hexadecimal(decimal);
        }
        return hexa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba un numero decimal = ");
        int decimal = sc.nextInt();
        sc.close();
        String hexadecimal = hexadecimal(decimal);
        System.out.println("Numero decimal convertido a hexadecimal = " + hexadecimal);
    }

}
