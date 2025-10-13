package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args) {
        //1. Pedimos el primer número
        Scanner num1 = new Scanner(System.in);
        System.out.println("Introduce tu primer número");
        int a = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Introduce el segundo número");
        int b = num2.nextInt(); //Este es un Else if bien estructurado
        if (a == b){
            System.out.println("Los números son iguales");
        } else if (a > b) {
            System.out.println("El número " + a + " es mayor");
        }else {
            System.out.println("El número " + b + " es mayor");
        }
        num1.close();
        num2.close();
    }
}
