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
public class Ejercicio4 {  

    static String mensaje = "";
    static String cadena = "";

    public static String descomposicion(int n, int y) {
        if (y >= n || y <= 0) {
            return "No es posible descomponer " + y + " veces el numero " + n;
        }
        if (y > 0) {
            mensaje += " + 1 ";
            cadena += n - 1 + mensaje + "\n";
            descomposicion(n - 1, y - 1);
        }
        return cadena;
    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        System.out.print("Introduce la cantidad de veces a descomponer: ");
        int y = sc.nextInt();
                
        sc.close();
        System.out.print(descomposicion(n, y));

    }
}
