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
public class Ejercicio3 {
    
//    3. Realice un método recursivo que reciba un numero decimal y retorne
//    true si el número es capicúa ( se refiere a cualquier número que se lee
//    igual de izquierda a derecha que de derecha a izquierda ) o false en aso contrario.   

    static int inverso = 0;  

    public static int invertirNumero(int decimal) {
        int cifra;
        if (decimal > 0) {
            cifra = decimal % 10;
            inverso = cifra + inverso * 10;
            decimal /= 10;
            invertirNumero(decimal);
        }

        return inverso;
    }

    private static boolean esCapicua(int num) {
        return num == invertirNumero(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();
        boolean capicua = esCapicua(num);
        System.out.println("\nEl número " + num + (capicua ? " sí" : " no") + " es capicua.");
    }

}
