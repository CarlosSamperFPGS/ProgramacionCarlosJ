package Tema2;

//“El número secreto”. Programa un juego en el que se calcula
// aleatoriamente un número de 1 a 100. El usuario debe adivinarlo. Cada
// vez que el usuario pone un número el programa le indicará si lo ha
// acertado, si el número secreto es mayor o si es menor. Termina cuando
// el usuario acierta el número
import  java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {
        int numSecreto = (int) (Math.random() * 100) + 1;
        int numUsuario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el número secreto (entre 1 y 100)");

        do {
            System.out.print("Introduce un número: ");
            numUsuario = sc.nextInt();

            if (numUsuario == numSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número secreto.");
            } else if (numUsuario < numSecreto) {
                System.out.println("El número secreto es MAYOR.");
            } else {
                System.out.println("El número secreto es MENOR.");
            }
        } while (numUsuario != numSecreto);

        sc.close();
    }

}
