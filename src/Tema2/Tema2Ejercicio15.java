package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = scan.nextInt();
        System.out.print("Introduce el año: ");
        int year = scan.nextInt();
        int dias = 0;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    dias = 29; // Año bisiesto
                } else {
                    dias = 28;
                }
                break;
            default:
                System.out.println("Mes no válido.");
                break;
        }

        if (dias != 0) {
            System.out.println("El mes " + mes + " del año " + year + " tiene " + dias + " días.");
        }
        scan.close();
    }
}
