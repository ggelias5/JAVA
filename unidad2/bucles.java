package unidad2;

public class bucles {
    public static void main(String[] args) {
        int i = -214748;
        while (i <= 214748499) {
            System.out.println("Vuelta " + i);
            i++; // sin esto, bucle infinito
        }

    }
}