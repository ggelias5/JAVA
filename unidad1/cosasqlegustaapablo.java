package unidad1;

import java.util.Scanner;

public class cosasqlegustaapablo {
    public static void main(String args[]) {
        System.out.println("Eoooo");
        // Definir variable edad.
        int edad = 2147483647;
        String nombre = "Elías";// String entre comillas.
        byte numerito = -128; // Valores hasta 127.
        float pesoMacho = 6767.67f; // Decimales [añadir la f].
        double pi = 99.999999; // Decimales periodicos infinitos.
        long verga = 2147483647; // Numeros muy grandes, limite de 32
        long uwuw = 9223372036854775807L; // Limite de 64 bits
        char letra = 'E'; // Solo 1 letra o numero (no lo usen en numero).
        boolean garchado = true; // True or false nada más.
        String goodboy = "yessir"; // Guarda Lineas de codigo.
        // && true and true
        // Operador de asignación.
        // Definir un objeto tipo escaner para poder leer.
        Scanner teclado = new Scanner(System.in);
        // Leemos el teclado
        System.out.println("Escribe tu nombre");
        nombre = teclado.next();
        System.out.println("Escribe tu edad");
        edad = teclado.nextInt();

        System.out.println("Ok eres" + nombre + "tienes" + edad + "años");

        System.out.println("¿Eres un goodboy?(si/no): ");
        goodboy = teclado.next();
        /*
         * Solo entran el la discoteca si son
         * mayores de 18 años y van bien vestidos
         */
        System.out.println("goodboy con" + edad + "años");
        if (nombre.equals(goodboy))
            if (edad != 0)
                System.out.println("No eres recien cogido");
        if (edad < 0)
            System.out.println("Eres tremendo feto wtf");
        teclado.close();
        // Cerramos el escaner.
    }

}