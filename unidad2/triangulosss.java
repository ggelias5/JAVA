package unidad2;

import java.util.Scanner;

import java.lang.Math;

public class triangulosss {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer lado del triangulo");
        int lado1 = teclado.nextInt();
        lado1 = Math.abs(lado1);
        System.out.println("Introduce el segundo lado del triangulo");
        int lado2 = teclado.nextInt();
        lado2 = Math.abs(lado2);
        System.out.println("Introduce el tercer lado del triangulo");
        int lado3 = teclado.nextInt();
        lado3 = Math.abs(lado3);

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) // cada lado es menor q la
                                                                                           // suma de los otros 2
            System.out.println("Los 3 lados forman un triangulo");
        else {
            System.out.println("No es un triángulo");
            System.exit(0); // cierra el programa
        }

        int lado1sq = Math.powExact(lado1, 2);
        int lado2sq = Math.powExact(lado2, 2);
        int lado3sq = Math.powExact(lado3, 2);

        if ((lado1 == lado2) && (lado1 == lado3)) // equilatero 3 lados iguales
            System.out.println("El triangulo es equilátero");
        else if ((lado1 == lado2 || lado1 == lado3) || (lado2 == lado3)) // isosceles 2 lados iguales
            System.out.println("El triangulo es isósceles");

        if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) // escaleno, ningun lado es igual
            System.out.println("El triangulo es escaleno");

        if ((lado1sq < (lado2sq + lado3sq) || lado2sq < (lado1sq + lado3sq) || lado3sq < (lado1sq + lado2sq))) {
            System.out.print("y rectangulo");
        }
        teclado.close();
    }
}
