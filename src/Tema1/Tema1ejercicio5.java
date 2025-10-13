package Tema1;

public class Tema1ejercicio5 {
    public static void main(String[] args) {
        //La primera letra de cada línea es en mayúsculas. cada línea se termina con ;
        System.out.println("Mi primer programa");
        int r0 = 24 % 5;
        /*Sistema constante al momento de nombrar variables, en este caso r de resultado
        y numerar de 0 a infinito para separar las variables.
         */
        System.out.println("El resultado es " + r0);

        double r1 = (double) 7 / 2 + 2.5;
        System.out.println("El resultado es " + r1);

        double r2 = 18.8 / 2 + 2;
        System.out.println("El resultado es " + r2);

        double r3 = (4 + 6) * 3 + 2 * (5 - 1);
        System.out.println("El resultado es " + r3);

        double r4 = (double) 5 / 2 + 17 % 3;
        System.out.println("El resultado es " + r4);

        boolean r5;
        r5 = 7 >= 5 || 27 != 8;
        System.out.println("El resultado es " + r5);
        //Ignorar el aviso, me indica que la operación es siempre true y que lo puedo simplificar.

        boolean r6;
        r6 = (45 <= 7) || ! (7 <=2);
        System.out.println("El resultado es " + r6);

        double r7 = 27 % 4 + (double) 15 / 4;
        System.out.println("El resultado es " + r7);

        double r8 = (double) 37 / 4 * 4 - 2;
        System.out.println("El resultado es " + r8);

        boolean r9;
        r9 =  (25 >= 7) && ! (7 <= 2);
        System.out.println("El resultado es " + r9);

        boolean r10;
        r10 = ('H' < 'J') && ('9' != '7');
        System.out.println("El resultado es " + r10);

        boolean r11;
        r11 = 25 > 20 && 13 > 5;
        System.out.println("El resultado es " + r11);

        boolean r12;
        r12 = 10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2;
        System.out.println("El resultado es " + r12);

        boolean r13;
        r13 = 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1;
        System.out.println("El resultado es " + r13);

        boolean r14;
        r14 = 10 <= 2 * 5 && 3 < 4 || ! (8>7) && 3 * 2 <= 4 * 2 - 1;
        System.out.println("El resultado es " + r14);
    }
}
