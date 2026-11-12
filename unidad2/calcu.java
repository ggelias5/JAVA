package unidad2;

import java.util.Scanner;

public class calcu {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;

        int opcion = 0;

        do {

            System.out.println("1 - suma\r\n" +
                    "       2 - resta\r\n" +
                    "       3 - división\r\n" +
                    "       4 - multiplicación\r\n" +
                    "       5 - salir\r\n" +
                    " Elige una opción (1-5): ");
            opcion = teclado.nextInt();

            if (opcion >= 1 && opcion >= 4) {

                System.out.println("Introduce el primer número");
                numero1 = teclado.nextDouble();
                System.out.println("Introduce el segundo número");
                numero2 = teclado.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = numero1 + numero2;
                        break;
                    case 2:
                        resultado = numero1 - numero2;
                        break;
                    case 3:
                        resultado = numero1 / numero2;
                        break;
                    case 4:
                        resultado = numero1 * numero2;
                        break;
                    case 5:
                        System.out.println("¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción no valida \r\n" + "Vuelve a elegir una opción");
                }
            }
            System.out.println("El resultado es: " + resultado);

        } while (opcion != 5);
        teclado.close();
        return;

    }
}
