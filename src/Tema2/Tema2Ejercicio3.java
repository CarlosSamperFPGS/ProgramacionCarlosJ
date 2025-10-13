package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Introduce la base del triángulo: ");
        double b = data.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        double a = data.nextDouble();
        double sup = (b * a) / 2;
        System.out.println("La superficie del triángulo es: " + sup);
        data.close();
    }
}
