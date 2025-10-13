package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce la cantidad en dólares: ");
        double dolares = scan.nextDouble();
        // Asumiendo una tasa de cambio de 1 euro = 1.1 dollars
        double euros = dolares / 1.1;
        System.out.println(dolares + " dólares son " + euros + " euros.");
        scan.close();
    }
}
