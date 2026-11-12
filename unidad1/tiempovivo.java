package unidad1;

import java.util.Scanner;

public class tiempovivo {
    public static void main(String[] args) {

        System.out.println("¿Quieres saber cuanto tiempo has estado vivo?");
        byte dia = 0;
        byte mes = 0;
        short ano = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿En que año naciste?");
        ano = teclado.nextShort();
        System.out.println("¿En que mes naciste?");
        mes = teclado.nextByte();
        System.out.println("¿Qué día naciste?");
        dia = teclado.nextByte();

        if (ano > 2026) {
            System.out.println("Vienes del futuro ¿o qué?");
            System.exit(0);
        }

        long resultado = (((2026 - ano) * 365 * 24 * 3600) + ((mes - 1) * 30 * 24 * 3600) + (dia * 24 * 3600)
                + (ano * 8 * 3600));
        System.out.println("Has estado respirando en este mundo durante " + resultado + " segundos");

    }
}
