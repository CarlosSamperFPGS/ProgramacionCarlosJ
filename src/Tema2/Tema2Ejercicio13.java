package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce las horas: ");
        int horas = scan.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = scan.nextInt();
        System.out.print("Introduce los segundos: ");
        int segundos = scan.nextInt();

        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }

        System.out.printf("La hora un segundo después es: %02d:%02d:%02d%n", horas, minutos, segundos);
        scan.close();
    }
}
