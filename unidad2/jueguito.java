package unidad2;

import java.util.Scanner;

public class jueguito {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombrevid = "", nombrehighscore = "", nombredownscore = "";
        double score = 0.00;
        double highscore = Double.MIN_VALUE;
        double downscore = Double.MAX_VALUE;
        double precio = 0.00, preciototal = 0;
        double mediaPuntuacion = 0, sumaPuntuacion = 0;
        String categoria = "";
        double cantzeldaventura = 0.00;

        int cantpuntosalto = 0;

        int n = 0;

        System.out.println("¿Cuantos videojuegos hay?");
        n = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el nombre del videojuego numero " + i + ";");
            nombrevid = teclado.nextLine();
            System.out.println("Introduce la puntuación del videojuego numero " + i + ";");
            score = teclado.nextDouble();
            System.out.println("Introduce el precio del videojuego numero " + i + ";");
            precio = teclado.nextDouble();
            System.out.println("Introduce la categoria del videojuego numero " + i + ";");
            categoria = teclado.nextLine();

            if (score > 9)
                cantpuntosalto++;

            if (categoria.equalsIgnoreCase("aventura") && nombrevid.contains("zelda"))
                cantzeldaventura++;

            if (score > highscore) {
                highscore = score;
                nombrehighscore = nombrevid;
            }
            if (score < downscore) {
                downscore = score;
                nombredownscore = nombrevid;
            }
            preciototal = preciototal + precio;
        }
        System.out.println("Hay " + cantpuntosalto + " juego(s) con una puntuación mayor de 9");
        System.out.println("La cantidad de videojuegos de aventura de zelda son " + cantzeldaventura);
        System.out.println("Todos los juegos juntos cuestan " + preciototal);
        System.out.println("La mayor puntuación es " + highscore + " por " + nombrehighscore);
        System.out.println("La menor  puntuacin es " + downscore + " por " + nombredownscore);
        System.out.println("");

        teclado.close();
        return;
    }
}
