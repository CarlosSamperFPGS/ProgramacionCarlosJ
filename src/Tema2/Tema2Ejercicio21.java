package Tema2;

public class Tema2Ejercicio21 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 2 == 0){
                suma = suma + i;

            }
        }
        System.out.println("La suma de los números pares del 1 al 999 es: " + suma);
    }
}
