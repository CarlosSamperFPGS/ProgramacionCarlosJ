package Tema2;

//Haz un programa que pida un número entero por consola e indica si es
// primo o no. Un número primo sólo es divisible por él mismo y por la unidad.

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int num = sc.nextInt();
        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int a = 2; a <= Math.sqrt(num); a++) {
                if (num % a == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
        sc.close();
    }

}
