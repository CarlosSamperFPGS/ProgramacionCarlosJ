package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont = 0;
        double sum = 0;
        System.out.println("Introduce números enteros positivos (introduce un número negativo para terminar):");
        do {
            num = sc.nextInt();
            if (num >= 0) {
                sum += num;
                cont++;
            }
        } while (num >= 0);

        if (cont > 0) {
            double average = sum / cont;
            System.out.println("La media de los números introducidos es: " + average);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }
        sc.close();
    }
}
