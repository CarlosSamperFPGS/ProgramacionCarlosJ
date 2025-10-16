package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    // Haz un programa que pide un número entero por consola y calcula el
    // factorial. por ejemplo el factorial de 5 es:
    // 5! = 5 *4*3*2*1
    // Recuerda tener en cuenta el factorial de 0

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular su factorial: ");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
            }

        System.out.println("El factorial de " + num + " es: " + factorial);
        sc.close();
        if (num == 0) {
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
    }
}
