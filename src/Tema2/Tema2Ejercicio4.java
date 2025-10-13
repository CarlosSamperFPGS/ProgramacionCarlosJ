package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = n.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = n.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double num3 = n.nextDouble();
        double mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El mayor de los tres números es: " + mayor);
        n.close();
    }
}
