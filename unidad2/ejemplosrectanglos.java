package unidad2;

import java.util.Scanner;

public class ejemplosrectanglos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la base");
        int base = teclado.nextInt();
        System.out.println("Introduce la altura");
        int altura = teclado.nextInt();
        
        boolean eshueco = teclado.nextLine().equalsIgnoreCase("S");
        String eshuecoStr ="";
        do {
         System.out.println("¿Hueco, sí o no?");
         eshuecoStr = teclado.nextLine();
        }  while (!(eshuecoStr == equalsIgnoreCase("S") && !eshuecoStr.equalsIgnoreCase()));

        eshueco = eshuecoStr

        for (int i=0; i<altura-2; i++){
            System.out.println("*");
            System.out.println("*");
            for (int j=0; j<base-2; j++){
                if (eshueco)
                System.out.println(" ");
                else System.out.println("*");
            } 
            System.out.println("*");
        }
        teclado.close();
    }

}
