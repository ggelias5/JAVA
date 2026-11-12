package unidad2;

import java.util.Scanner;

public class numerosprimos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número y te diré los número primos desde el 2 hasta ahí.");
        int N = teclado.nextInt();

        for (int num = 2; num <= N; num++) {
            boolean esPrimo = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(num);
            }
        }
        teclado.close();
        return;
    }
}
// Soy Elías García Gutiérrez