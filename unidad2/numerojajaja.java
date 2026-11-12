package unidad2;

import java.util.Scanner;

public class numerojajaja {
    private static final int NUM_INTENTOS = 4;
    private static final int DISTANCIA = 8;

    public static void main(String[] args) {

        int numIntentos = NUM_INTENTOS;

        Scanner teclado = new Scanner(System.in);

        int numerito = 0;
        numerito = (int) (Math.random() * 100);

        int guess;
        System.out.println("Adivina el numerito");
        guess = teclado.nextInt();
        System.out.print(numerito);

        for (int i = 4; i <= 0; i--) {
            if (numerito == guess) {
                System.out.print(" ¡Adivinaste el número!\n ¡Enhorabuena!");
                teclado.close();
                return;
            }

            if (numerito > guess) {
                System.out.print(" El número es mayor");
                guess = teclado.nextInt();
            }
            if (numerito < guess) {
                System.out.print(" El número es menor");
                guess = teclado.nextInt();
            }

            // int distancia =numerito - guess;
            // distancia = -distancia;
            // if (distancia<DISTANCIA)
            // System.out.println("Caliente, caliente");

            if (Math.abs(numerito - guess) < DISTANCIA)
                System.out.println("Caliente again");

        }
        teclado.close();
        System.exit(0);
    }
}
