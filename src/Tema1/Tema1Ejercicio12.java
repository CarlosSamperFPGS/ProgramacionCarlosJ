package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio12 {

    public static void main(String[] args) {
        // 1. Inicializar Scanner para leer la entrada
        Scanner year = new Scanner(System.in);
        // 2. Pedir el año al usuario
        System.out.print("Introduce un año para comprobar si es bisiesto: ");
        // 3. Leer el año (como un entero)
        int an = year.nextInt();
        // 4. Aplicar la lógica del año bisiesto
        boolean bis = (an % 4 == 0) && (an % 100 != 0 || an % 400 == 0);
        // 5. Mostrar el resultado
        if (bis) {
            System.out.println("El año " + an + " ES bisiesto.");
        } else {
            System.out.println("El año " + an + " NO es bisiesto.");
        }
        // Cerrar el objeto Scanner
        year.close();
    }
}
