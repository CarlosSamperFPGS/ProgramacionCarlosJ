package Tema2;

import java.util.Scanner;//comentario de prueba

public class Tema2Ejercicio1 {
    public static void main(String[] args) {
        Scanner lado = new Scanner(System.in);
        System.out.print("Introduce el lado del cuadrado: ");
        double l = lado.nextDouble();
        double sup = l * l;
        double per = 4 * l;
        System.out.println("La superficie del cuadrado es: " + sup);
        System.out.println("El perímetro del cuadrado es: " + per);
        lado.close();
    }
}
