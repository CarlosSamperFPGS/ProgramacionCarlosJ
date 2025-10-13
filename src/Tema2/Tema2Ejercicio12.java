package Tema2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tema2Ejercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        Double num1 = scan.nextDouble();
        System.out.print("Introduce el segundo número: ");
        Double num2 = scan.nextDouble();
        System.out.print("Introduce el tercer número: ");
        Double num3 = scan.nextDouble();
        Double[] numeros = {num1, num2, num3};
        Arrays.sort(numeros, Collections.reverseOrder());
        // Utilizamos el util Collections.reverseOrder, ya que por defecto Array ordena de menor a mayor y nos piden lo contrario
        // Ya que no solicita los numeros ordenados utilizamos Arrays.Sort
        System.out.println("Los números ordenados de mayor a menor son: " + Arrays.toString(numeros));
        // Utilizamos .toString para mostrar como string el contenido de un array
        scan.close();
    }
}
