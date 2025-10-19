package Tema2;

//programa que calcule un número aleatorio de la lotería de
// Navidad (de 0 a 99.999) y después pida al usuario por consola hasta 5
// números indicando cada vez si ha ganado la lotería o no.

import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 1000);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce tus números de lotería");
            int num = sc.nextInt();
            if (num == numAleatorio) {
                System.out.println("Has ganado la lotería");
            } else {
                System.out.println("No has ganado la lotería");
            }


        }
        sc.close();
        System.out.println("El número de lotería es: " + numAleatorio + " No te quedan mas boletos");
    }
}
