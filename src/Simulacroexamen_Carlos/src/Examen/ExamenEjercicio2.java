package Examen;

import java.util.Scanner;

public class ExamenEjercicio2 {

    public static void main(String[] args) {

        //----------------------------------------------------------------
        //-- INICIALIZAMOS UTILS Y VARIABLES
        //________________________________________________________________
        Scanner sc = new Scanner(System.in);
        Scanner scdia = new Scanner(System.in);

        System.out.println("Bienvenido al conversor de fechas de Hazard");
        sc.nextLine();
        int hora;
        int minutos;
        int diferencia = 8;


        //Con un Do While, aseguramos que la hora esté en formato de 24 horas, en caso de que no sea así, volverá a pedir la hora
        //Si el usuario introduce un número negativo el programa se cierra
        do {
            System.out.println("Indica la hora en formato de 24 horas (Introduce un número negativo para salir)");
            hora = sc.nextInt();
        } while (hora > 24);
        if (0 < hora) {
            do {
                System.out.println("Indica los minutos");
                minutos = sc.nextInt();
            } while (minutos < 0 || minutos > 60);
            System.out.println("Ahora indica el día de la semana");
            String dia = scdia.nextLine();
            sc.nextLine();
            System.out.println("Quieres pasar la hora de España a Japón o viceversa?");
            System.out.println("a. España a Japón");
            System.out.println("b. Japón a España");
            String opcion = sc.nextLine();

            //En caso de pasar de España a Japón, se suma la diferencia, en el lado contrario se resta

            if (opcion.equals("a")) {
                hora = hora + diferencia;
                if (hora > 24) {
                    hora = hora - 24; //De esta forma mantiene el formato de 24 horas
                    switch (dia) {
                        case "lunes":
                            dia = "martes";
                            System.out.println("La hora en Japón es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;

                        case "martes":
                            dia = "miercoles";
                            System.out.println("La hora en Japón es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;

                        case "miercoles":
                            dia = "jueves";
                            System.out.println("La hora en Japón es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;

                        case "jueves":
                            dia = "viernes";
                            System.out.println("La hora en Japón es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;
                        case "viernes":
                            dia = "sabado";
                            System.out.println("La hora en Japón es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;

                        case "sabado":
                            dia = "domingo";
                            System.out.println("La hora en Japón es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;
                        case "domingo":
                            dia = "lunes";
                            System.out.println("La hora en Japón es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;
                    }
                }

            } else {
                hora = hora + diferencia * -1;
                if (hora < 0) {
                    hora = hora + 24;
                    switch (dia) {
                        case "lunes":
                            dia = "domingo";
                            System.out.println("La hora en España es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;

                        case "martes":
                            dia = "lunes";
                            System.out.println("La hora en España es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;

                        case "miercoles":
                            dia = "martes";
                            System.out.println("La hora en España es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;

                        case "jueves":
                            dia = "miercoles";
                            System.out.println("La hora en España es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;

                        case "viernes":
                            dia = "jueves";
                            System.out.println("La hora en España es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;

                        case "sabado":
                            dia = "viernes";
                            System.out.println("La hora en España es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;

                        case "domingo":
                            dia = "sabado";
                            System.out.println("La hora en España es " + hora + ":" + minutos + " " + dia);
                            sc.close();
                            scdia.close();
                            break;
                    }
                }

            }
        } else {
            System.out.println("Has decidido salir del programa, hasta la próxima");
            sc.close();
            scdia.close();
        }
    }
}