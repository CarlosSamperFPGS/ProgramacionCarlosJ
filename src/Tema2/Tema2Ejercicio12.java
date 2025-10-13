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
        System.out.println("Los números ordenados de mayor a menor son: " + Arrays.toString(numeros));
        scan.close();
    }
}
