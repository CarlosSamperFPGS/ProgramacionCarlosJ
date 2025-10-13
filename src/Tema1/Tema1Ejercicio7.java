package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {
    //Inicializamos Scanner para guardar el valor de la cara del dado
    Scanner dado = new Scanner(System.in);
    //Solicitamos
    System.out.println("Introduce la cara del dado (1-6)");
    int d0 = dado.nextInt();
    //Comprobamos que el número introducido es la cara de un dado
    if (1 > d0 || d0 > 6) {
        System.out.println("ERROR: El número introducido no puede ser la cara de un dado");
        } else {
        // Si la el número es la cara
        int co = 7 - d0;
        System.out.println("La cara opuesta es " + co);
        dado.close();
        }
    }
}
