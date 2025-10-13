package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el número de personas: ");
        int personas = scan.nextInt();
        System.out.print("Introduce el número de días de estancia: ");
        int dias = scan.nextInt();

        double precionoche = 15.0;
        double preciototal = precionoche * dias;

        if (personas > 5 && dias >= 7) {
            preciototal *= 0.75; // Aplicar descuento del 25%
        }

        System.out.println("El precio total de la estancia es: " + preciototal + " €");
        scan.close();
    }
}
