package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    //Programa que lee un número e indico cuantas cifras tiene
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num = sc.nextInt();
        int cont = 0;
        while (num != 0) {
            //Preguntar a Ana si se puede calcular rápido una variable utilizando num /= 10
            num /= 10;
            cont++;
        }
        System.out.println("El numero tiene " + cont + " cifras.");
        sc.close();
    }
}
