package unidad2;

import java.util.Scanner;

public class fechas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número del día para comprobar la validez de la fecha");
        int dia = teclado.nextInt();
        System.out.println("Introduce el número de mes para comprobar la validez de la fecha");
        int mes = teclado.nextInt();
        System.out.println("Introduce el año para comprobar la validez de la fecha");
        int anio = teclado.nextInt();

        int diames = 0;
        int dianio = 0;
        boolean bisiesto;

        if (mes < 1 || mes > 12) {
            System.out.println("Mes fuera de rango");
            System.exit(0);
        }

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                diames = 31;
                break;
            case 4, 6, 9, 11:
                diames = 30;
                break;
            case 2:
                if (((anio % 4 == 0) && (anio % 100 != 0)) || ((anio % 400 == 0))) { // ELÍAS GARCIA GUTIÉRREZ
                    bisiesto = true;
                } else {
                    bisiesto = false;
                }
                diames = bisiesto ? 29 : 28;
        }

        if (dia >= 1 && dia <= diames) {
            System.out.println("Día válido");
        } else {
            System.out.println("Día no válido");
            System.exit(0);
        }

        for (int i = 0; i < mes; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12:
                    dianio = dianio + 31;
                    break;
                case 4, 6, 9, 11:
                    dianio = dianio + 30;
                    break;
                case 2:
                    dianio = dianio + 28;
                    break;
            }
        }

        dianio = dianio + dia;
        System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es válida, ");
        if (((anio % 4 == 0) && (anio % 100 != 0)) || ((anio % 400 == 0))) {
            bisiesto = true;
            dianio++;
            System.out.print(" es año bisiesto");
        }
        System.out.println("y es el día número " + dianio + " del año.");

        teclado.close();

    }
}