package Examen;

import java.util.Scanner;

public class ExamenEjercicio1 {

    public static void main(String[] args) {

        //----------------------------------------------------------------
        //-- INICIALIZAMOS UTILS Y VARIABLES
        //________________________________________________________________
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al proyecto");
        System.out.println("Selecciona a que apartado quieres acceder");
        System.out.println("a Aprobados y suspendidos / b Billetes a Madrid o c para salir");
        String opcion = sc.nextLine();


        switch (opcion) {
            case "a": { //La opción para el programa de evaluación
                System.out.println("Bienvenido a la calculadora de notas, cuantas notas desea evaluar:");
                int notascantidad = sc.nextInt();
                int cont = 0;
                int aprobados = 0;
                int suspensos = 0;
                while (cont <= notascantidad) {
                    System.out.println("Introduce la nota a evaluar");
                    double nota = sc.nextDouble();
                    if (0 >= nota || nota <= 10) {
                        if (nota >= 5) {
                            aprobados++;
                            System.out.println("Un aprobado");
                        } else {
                            suspensos++;
                            System.out.println("Un suspenso");
                        }
                        cont++;
                    } else {
                        System.out.println("La nota introducida no es válida, vuelve a introducir la nota");
                    }
                }
                if (aprobados > suspensos) {
                    System.out.println("Hay mas aprobados, de: " + notascantidad + " notas, hay " + aprobados + " aprobados");
                } else {
                    System.out.println("Hay mas suspensos, de: " + notascantidad + " notas, hay " + suspensos + " suspensos");
                }
            }
            sc.close();
            break;
            case "b": //La compra de billetes, pregunto al usuario cuantos billetes quiere comprar, esa es mi forma de de controlar cuantos billetes se comprarn
                System.out.println("Bienvenido al gestor de billetes");
                System.out.println("Cuantos billetes desea comprar");
                int cantbilletes = sc.nextInt();
                int cont2 = 1;
                double preciobillete;
                double preciototal = 0;
                double tarifa = 32;
                while (cont2 <= cantbilletes) {
                    System.out.println("Introduce el nombre de la persona a la que va dirigida el billete:");
                    String nombre = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Ahora introduce su edad:");
                    int edad = sc.nextInt();
                    if (0 >= edad || edad <= 115) {
                        if (edad >= 65) {
                            preciobillete = tarifa - (tarifa * 0.1);
                            preciototal = preciototal + preciobillete;
                            cont2++;
                            System.out.println("El billete de " + nombre + " cuesta " + preciobillete + "€");
                        } else if (12 <= edad && edad <= 15) {
                            preciobillete = tarifa - (tarifa * 0.08);
                            preciototal = preciototal + preciobillete;
                            cont2++;
                            System.out.println("El billete de " + nombre + " cuesta " + preciobillete + "€");
                        } else if (4 <= edad && edad <= 11) {
                            preciobillete = tarifa - (tarifa * 0.35);
                            preciototal = preciototal + preciobillete;
                            cont2++;
                            System.out.println("El billete de " + nombre + " cuesta " + preciobillete + "€");
                        } else if (edad < 4) {
                            preciobillete = 0;
                            preciototal = preciototal + preciobillete;
                            cont2++;
                            System.out.println("El billete de " + nombre + " cuesta " + preciobillete + "€");
                        } else {
                            preciobillete = tarifa;
                            preciototal = preciototal + preciobillete;
                            cont2++;
                            System.out.println("El billete de " + nombre + " cuesta " + preciobillete + "€");
                        }
                    } else {
                        System.out.println("La edad introducida no es válida");
                    }
                }
                    System.out.println("El total de los billetes para " + cantbilletes + (" personas es de " + preciototal + "€"));
                sc.close();
                    break;
            case "c":
                System.out.println("Ha seleccionado salir");
                System.out.println("Apagando el programa");
                sc.close();
                break;
            default:
                System.out.println("No has seleccionado ningun programa, se procederá al apagado del mismo.");
                sc.close();

                }

        }
    }

