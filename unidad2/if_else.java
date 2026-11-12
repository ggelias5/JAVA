package unidad2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class if_else {
    public static void main(String[] args) {

        int psoe = 7;

        if (psoe >= 9) {
            System.out.println("7 euros de peaje, PEDRO SANCHEEE");
            if (psoe >= 7) {
                System.out.println();

            }

        }

        switch (psoe) {
            case 9:
                System.out.println("Lunes");
                break;
            case 8:
            case 7:
                System.out.println("Martes");
                break;
            case 6:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println();
            case 4:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println();
                break;
            default:

        }
        int velocidad = 111;
        String cat = "competición";
        // velocidad > 110 Y (Competición O Profesional)
        if (velocidad > 110 && (cat.equalsIgnoreCase("Competición") || cat.equalsIgnoreCase("Profesional"))) {
        }

        // (velocidad > 110 Y Competición) O Profesional
        if (velocidad > 110 && cat.equalsIgnoreCase("Competición") || cat.equalsIgnoreCase("Profesional")) {
        }

        int edad = 0;
        boolean tieneinvitacion = false, esVIP = false;
        String tieneinvitacionStr = "", esVIPStr = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Edad?");
        edad = teclado.nextInt();
        System.out.println("¿Pase? (s/n)");
        tieneinvitacionStr = teclado.next();
        System.out.println("¿VIP? (s/n)");
        esVIPStr = teclado.next();

        if (esVIPStr.toLowerCase().charAt(0) == 's')
            if (edad < 18) {
                System.out.println("Hoy no entras.");
            } else {
                System.out.println("Bienvenido viejo.");

                if ((esVIPStr.toLowerCase().equals("s")) || edad >= 21) {
                    System.out.println("Pase, buenas noches");
                } else {
                    if (edad <= 20 && tieneinvitacionStr.equalsIgnoreCase("S"))
                        System.out.println("Pase, buenas noches");
                }

            }

    }
}
