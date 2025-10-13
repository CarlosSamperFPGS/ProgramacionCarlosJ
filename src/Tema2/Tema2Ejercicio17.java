package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una opción:");
        System.out.println("0: Calcular superficie y perímetro de un cuadrado");
        System.out.println("1: Calcular superficie y perímetro de un rectángulo");
        System.out.println("2: Calcular superficie de un triángulo");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        if (opcion == 0) {
            System.out.print("Introduce el lado del cuadrado: ");
            double lado = scanner.nextDouble();
            double sup = lado * lado;
            double per = 4 * lado;
            System.out.println("La superficie del cuadrado es: " + sup);
            System.out.println("El perímetro del cuadrado es: " + per);
        } else if (opcion == 1) {
            System.out.print("Introduce la base del rectángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Introduce la altura del rectángulo: ");
            double altura = scanner.nextDouble();
            double sup = base * altura;
            double per = 2 * (base + altura);
            System.out.println("La superficie del rectángulo es: " + sup);
            System.out.println("El perímetro del rectángulo es: " + per);
        } else if (opcion == 2) {
            System.out.print("Introduce la base del triángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Introduce la altura del triángulo: ");
            double altura = scanner.nextDouble();
            double sup = (base * altura) / 2;
            System.out.println("La superficie del triángulo es: " + sup);
        } else {
            System.out.println("Error: Opción no válida.");
        }

        scanner.close();
    }
}
