package unidad2;

import java.util.Scanner;

public class Stringfunciones { // ESCRIBE UNA FRASE QUE TERMINE EN "."
    public static void main(String[] args) {

        int edad = 18;
        String modeloCoche = "Corsa", frase = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase");
        frase = teclado.nextLine();

        // Para saber la cantidad de caracteres que tiene un String se usa unan funcion
        // lenght()
        System.out.println("El modelo de coche tiene " + modeloCoche.length() + " caracteres");
        /**
         * con tolowercase se pasa a minusculas y con touppercase a mayusculas
         */
        System.out
                .println("En mayusculas " + modeloCoche.toUpperCase() + "; en minusculas " + modeloCoche.toLowerCase());
        // Para sacar el caracter que esta en la posicion x se usa charAt
        char caracter = modeloCoche.charAt(1);
        System.out.println("El caracter en la posicion 1 es " + caracter + " ya que empieza por la C");

        // trim elimina los espacios al principio y final de una cadena
        modeloCoche = modeloCoche.trim();
        // contains devuelve true si la cadena contiene la palabra que le metemos.
        boolean contieneMar = frase.contains("mar");
        if (contieneMar == true)
            System.out.println("La frase tiene la palabra mar");
        else
            System.out.println("La frase NO tiene la palabra mar");

        // indexof me dice la posicion donde se encuentra la primer vez la palabra
        // buscada.
        // Si despues de la palabra buscada ponemos un numero, busca a partir de esa
        // posicion.
        System.out.println("La palabra coche esta en posicion " + frase.indexOf("coche"));

        int posicion = frase.indexOf("coche");
        if (posicion == -1)
            System.out.println("Tu palabra no existe XD");
        else
            System.out.println("la palabra coche está en la posicion " + posicion);

        // con substring cortamos un String dande una posicion inicial y final
        // nos devuelve un nuevo string con ese corte

        String oracion = "";
        oracion = frase.substring(5, 10);
        System.out.println("el corte es: " + oracion);

        // Ejemplo para la primer clase finalizada con .
        // Comprobamos antes de nada que la frase tenga un "."
        // Sino intentarrá cortar en la posicion -1 y dará outofbound.
        if (frase.indexOf(".") != -1) {
            oracion = frase.substring(0, frase.indexOf("."));
            System.out.println("la frase es: " + oracion);
        }

        teclado.close();
    }
}