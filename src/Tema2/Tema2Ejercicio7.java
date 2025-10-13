package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = scan.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scan.nextDouble();
        double res;
        if (num1 > num2) {
            res = num1 - num2;
        } else {
            res = num2 - num1;
        }
        System.out.println("El resultado de restar el menor al mayor es: " + res);
        scan.close();
    }
}
