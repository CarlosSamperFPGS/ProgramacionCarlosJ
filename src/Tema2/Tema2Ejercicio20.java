package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int A = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int B = sc.nextInt();
        if (B > A) {
            for (int i = B; i >= A; i--) {
                if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
        sc.close();
    }
}

