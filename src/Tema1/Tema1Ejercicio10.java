package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args) {
        //1. Inicializar el primer Scanner para leer el primer número
        Scanner num1 = new Scanner(System.in);
        //2. Pedir el primer número al usuario
        System.out.println("Introduce tu primer número");
        //3. Leer el año (Como un número Real)
        double a = num1.nextDouble();
        //4. Repetimos el proceso con el segundo número
        Scanner num2 = new Scanner(System.in);
        System.out.println("Introduce el segundo número");
        double b = num2.nextDouble();
        //5. Creamos un If que detecte si el segundo número es 0 (No se puede dividir entre 0)
        if (b == 0) {
            //5.1 En caso de que b sea 0, hacemos todas las operaciones menos la división, e indicamos que la multiplicación es igual a 0.
            double r0 = a + b;
            double r1 = a - b;
            double r2 = 0;
            System.out.println("La suma es " + r0 + " la resta es " + r1 + " la multiplicación es " + r2 + " No se puede dividir entre 0");
            //5.2 En caso de que b no sea 0, hacemos todas las operaciones.
        } else {
            double r0 = a + b;
            double r1 = a - b;
            double r2 = a * b;
            double r3 = a / b;
            double r4 = a % b;
            System.out.println("La suma es " + r0 + " la resta es " + r1 + " la multiplicación es " + r2 + " la división es " + r3 + " y el resto es " + r4);
        }
        //6. Cerramos los Scanner
        num1.close();
        num2.close();
    }
}