package unidad2;

import java.util.Scanner;

public class elementosgame {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String myelement = teclado.next().toLowerCase();
        String fireStr = "fuego";

        int myattack = (int) ((Math.random() + 0.1) * 100);
        System.out.println(myattack);

        if (myelement == fireStr.equalsIgnoreCase()) {

        }
    }
}
