package unidad2;

public class Casting { // "Cast" ---> Pasar de algo a String
    public static void main(String[] args) {

        String numeroTxt = "34.23";
        double numero = Double.parseDouble(numeroTxt); // Pasar un dato con una función a otro dato en String.
        float peso = Float.parseFloat("67.67");
        String nombre = "Jose";
        /*
         * Para convertir un numero a texto para insertarlo en cadenas o buscar
         * usamos
         */
        String potenciaSrt = Integer.toString(234); // Pasa el valor numerico a una cadena en String.

        if (!nombre.equalsIgnoreCase("José")) { // Para comparar String(s) y funciones se usa: ==
            System.out.println("El nombre es igual a Jose");

        }

    }
}
