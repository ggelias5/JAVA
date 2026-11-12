package unidad2;

import java.util.Scanner;

public class turnosenfermeria {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int dia = 0;
        String diaStr = "";
        System.out.println("Qué día de la semana es? (1-7)");
        diaStr = teclado.next();
        dia = Integer.parseInt(diaStr);
        boolean esfestivo = false;
        System.out.println("¿Es día festivo? (true/false)");
        esfestivo = teclado.nextBoolean();
        String turno = "";

        double sueldo = 0;
        double SUELDO_BASE = 0;

        /*
         * if (dia == 1)
         * turno = "Mañana";
         * else if (dia == 2)
         * turno = "Tarde";
         * else if (dia == 3 || dia == 6)
         * turno = "Noche";
         * else if (dia == 7)
         * turno = "Descanso";
         * else
         * turno = "Desconocido";
         */

        switch (dia) {
            case 1, 4:
                turno = "Mañana";
                System.out.println("Mañana");
                break;
            case 2, 5:
                turno = "Tarde";
                System.out.println("Tarde");
                break;
            case 3, 6:
                turno = "Noche";
                System.out.println("Noche");
                break;
            case 7:
                turno = "Descanso";
                System.out.println("Descanso");
                break;
            default:
                turno = "Desconocido";

        }
        sueldo = SUELDO_BASE;
        if (turno.equals("Noche"))
            sueldo = sueldo + 10;
        sueldo += 10;
        System.out.println();

        if (esfestivo == true)
            sueldo *= 1.25;

        System.out.println("El turno es de " + turno + "\nEl día es " + dia);

    }
}
