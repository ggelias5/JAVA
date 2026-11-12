package unidad2;

import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args) {
        System.out.println("Piedra,");
        System.out.println("papel,");
        System.out.println("!o tijeras!");

        Scanner teclado = new Scanner(System.in);

        String piedra = "piedra", papel = "papel", tijeras = "tijeras";

        String jugada1 = "", jugada2 = "";
        jugada1 = teclado.next().toLowerCase().trim();
        jugada2 = teclado.next().toLowerCase().trim();

        if ((jugada1.equals(jugada2))) {
            System.out.println("Empate");
            System.exit(0);
        }

        if (jugada1.equals("piedra")) {
            if (jugada2.equals("papel")) {
                System.out.println("Gana el jugador 2");
                System.exit(0);
            }
            if (jugada2.equals("tijeras")) {
                System.out.println("Gana el  jugador 1");
                System.exit(0);
            }
        }

        if (jugada1.equals("papel")) {
            if (jugada2.equals("piedra")) {
                System.out.println("Gana el jugador 1");
                System.exit(0);
            }
            if (jugada2.equals("tijeras")) {
                System.out.println("Gana el  jugador 2");
                System.exit(0);
            }
        }

        if (jugada1.equals("tijeras")) {
            if (jugada2.equals("papel")) {
                System.out.println("Gana el jugador 1");
                System.exit(0);
            }
            if (jugada2.equals("piedra")) {
                System.out.println("Gana el  jugador 2");
                System.exit(0);
            }
        }
        teclado.close();
    }
}
