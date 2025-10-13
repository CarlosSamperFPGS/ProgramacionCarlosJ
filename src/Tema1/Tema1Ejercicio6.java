package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio6 {
    public static void main(String[] args) { //Para mostrar en pantalla debes usar Scanner
        Scanner radio = new Scanner(System.in);
        System.out.println("Introduce el radio");
        double r = radio.nextDouble();
        double a = 3.14 * r * r;
        System.out.println("El area de tu círculo es " + a);
        radio.close(); //Para cerrar el Scanner y ahorrar recursos debes usar el nombre de la variable scanner
    }
}
