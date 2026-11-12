package unidad1;

import java.util.Scanner;

public class edadjotajota {

    public static void main(String[] args) {
        byte edad = 0;
        short año = 2026;
        System.out.println("Sabes en que año nacistes o lo se yo mejor que tú?");
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos años tienes?");
        edad = teclado.nextByte();
        System.out.println(año - edad);
        System.out.println("jeh, tremendo milenial");

    }
}
