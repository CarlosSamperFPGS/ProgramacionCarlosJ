package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros: ");
        double euros = scan.nextDouble();
        // Asumiendo una tasa de cambio de 1 euro = 1.1 dollars
        double dolares = euros * 1.1;
        System.out.println(euros + " euros son " + dolares + " dólares.");
        scan.close();
    }
}
