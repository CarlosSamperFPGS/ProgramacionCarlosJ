package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = num.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = num.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double num3 = num.nextDouble();
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Los números están ordenados de menor a mayor.");
        } else {
            System.out.println("Los números no están ordenados de menor a mayor.");
        }
        num.close();
    }
}
