package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    //Programa que permite a un profesor introducir la nota de un número indefinido de alumnos y le indica cúantos suspensos o aprobados hay.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        //Si no inicializo la variable nota con un valor me da error (Consultar Ana) Pero ponerlo me indica un warning igualmente
        int aprobados = 0;
        int suspensos = 0;
            System.out.println("Introduce la nota para evaluar: para finalizar introduce un número negativo");
        nota = sc.nextDouble();
        while (nota > 0) {
            if (nota >= 5 && nota <= 10)
                aprobados++;
            else
                suspensos++;
            nota = sc.nextDouble();
        }
        System.out.println("Alumnos aprobados: " + aprobados + " y Alumnos suspendidos: " + suspensos);
    }
}
