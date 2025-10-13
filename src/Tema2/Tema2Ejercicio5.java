package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = num.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = num.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double num3 = num.nextDouble();
        double mediaDecimal = (num1 + num2 + num3) / 3;
        int mediaSinDecimal = (int) mediaDecimal;
        System.out.println("La media con decimales es: " + mediaDecimal);
        System.out.println("La media sin decimales es: " + mediaSinDecimal);
        num.close();
    }
}
