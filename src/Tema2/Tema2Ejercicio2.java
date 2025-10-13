package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args) {
        Scanner base = new Scanner(System.in);
        System.out.print("Introduce la base del rectángulo: ");
        double b = base.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        double a = base.nextDouble();
        double sup = b * a;
        double per = 2 * (b + a);
        System.out.println("La superficie del rectángulo es: " + sup);
        System.out.println("El perímetro del rectángulo es: " + per);
        base.close();
    }
}
