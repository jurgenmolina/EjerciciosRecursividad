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
public class Ejercicio5a {

    static int contador = 0;

    public static int cocienteEntero(int a, int b) {
        
        if (a >= b) {
            contador++;
            a = a - b;
            cocienteEntero(a, b);
        }

        return contador;

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
