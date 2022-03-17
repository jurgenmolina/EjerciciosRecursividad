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
public class Ejercicio5 {

    static int cociente = 0;
    static String cadena = "Cocientes:\n";

    public static String cocienteEntero(int a, int b) {

        if (a <= 0 && b <= 0) {
            return "los numeros tienen que ser mayor que cero";
        }
        
        if (a == b) {
            cadena += "Cociente de: " + b + " / " + a + " es: " + 1 + "\n";
        }

        if (a > b) {
            cociente = a / b;
            cadena += "Cociente de: " + a + " / " + b + " es: " + cociente + "\n";
            a = a - b;
            cocienteEntero(a, b);
        }

        if (b > a) {
            cociente = b / a;
            cadena += "Cociente de: " + b + " / " + a + " es: " + cociente + "\n";
            b = b - a;
            cocienteEntero(a, b);
        }

        return cadena;

    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número a: ");
        int a = sc.nextInt();
        System.out.print("Introduce un número b: ");
        int b = sc.nextInt();

        sc.close();
        System.out.print(cocienteEntero(a, b));

    }
}
