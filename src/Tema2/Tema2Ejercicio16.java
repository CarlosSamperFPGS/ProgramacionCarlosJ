package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce 'D' para convertir de Euros a Dólares o 'E' para convertir de Dólares a Euros: ");
        char opcion = scan.next().charAt(0);
        System.out.print("Introduce la cantidad: ");
        double cantidad = scan.nextDouble();
        double tasacambio = 1.1; // Vamos a asumir que el cambio es 1 euro = 1.1 dólares

        if (opcion == 'D' || opcion == 'd') {
            double dolares = cantidad * tasacambio;
            System.out.println(cantidad + " euros son " + dolares + " dólares.");
        } else if (opcion == 'E' || opcion == 'e') {
            double euros = cantidad / tasacambio;
            System.out.println(cantidad + " dólares son " + euros + " euros.");
        } else {
            System.out.println("Opción no válida.");
        }
        scan.close();
    }
}
