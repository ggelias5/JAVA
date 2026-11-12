package unidad1;

import java.util.Scanner;

public class ejer10 {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleciona el radio del circulo");
        int radio = teclado.nextInt();
        float pi = 3.14159265359f;
        float area = (pi * radio * radio);
        System.out.println("El area es de " + area);
    }
}