package Tema2;

import java.util.Arrays;
import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        int num1 = scan.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = scan.nextInt();
        System.out.print("Introduce el tercer número entero: ");
        int num3 = scan.nextInt();
        int[] numeros = {num1, num2, num3};
        // El uso de Arrays.sort nos facilita el averiguar si los números son consecutivos ya que nos los ordena
        // y simplifica el condicional que nos determina si los números son consecutivos
        Arrays.sort(numeros);
        if (numeros[1] == numeros[0] + 1 && numeros[2] == numeros[1] + 1) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números no son consecutivos.");
        }
        scan.close();
    }
}
