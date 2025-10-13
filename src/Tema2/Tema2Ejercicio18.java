package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un número para calcular su raíz cuadrada: ");
        double numero = scan.nextDouble();

        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            // Utilizamos Math.sqrt para sacar la raiz cuadrada
            System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        } else {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }

        scan.close();
    }
}
