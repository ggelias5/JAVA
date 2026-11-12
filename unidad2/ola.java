package unidad2;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }
}
