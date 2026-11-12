package unidad1;

public class ejer11 {
    public static void main(String args[]) {

        double sueldo_bruto = 6.99;
        double impuesto = 2.13;
        double miseria = sueldo_bruto - impuesto;
        System.out
                .println("Como cobras " + sueldo_bruto + " y hacienda se lleva " + impuesto + " te quedan " + miseria);
    }
}