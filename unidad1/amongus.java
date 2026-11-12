package unidad1;

public class amongus {
    /**
     * El programa hace una ronda del juego del mentiroso.
     * @param args
     */
    public static void main(String[] args) {
        int dado1 = 0, dado2 = 0, tirada1 = 0, tirada2 = 0;
        int sumaAns = 0, sumaPost = 0;
        boolean hayPajaAns = false, hayPajaPost = false;
        // tiramos dados a lo random
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
        if (dado1 == dado2)
            hayPajaAns = true;

        tirada1 = (int) (Math.random() * 6) + 1;
        tirada2 = (int) (Math.random() * 6) + 1;
        sumaPost = tirada1 + tirada2;
        if (dado1 == dado2)
            hayPajaAns = true;
        // Comprobamos si la jugada anterior es superior a la mía.
        // Pasa en caso de que sea pareja y la mia no o que su suma de dados sea
        // superior a la mia.
        if (hayPajaAns && !hayPajaPost)
        

    }

}
