package unidad2;

public class ejemplosarrays {

    public static void main(String[] args) {
        int edad = 34, miniedad = Integer.MAX_VALUE, posminimo = 0;
        /*
         * Un array es simplemente una variable igual que cualquier otra
         * pero en lugar de guardar un solo dato guardamos mucho.
         * Podemos incializarlo con valores directamente
         */
        int edadesAlummnos[] = { 18, 23, 11, 23, 21, 34, 34 }; // [] identifica el array
        System.out.println("La edad es " + edad);
        System.out.println("La edad de la tercera posicion del array es " + edadesAlummnos[2]); // las posiciones del
                                                                                                // array empiezan desde
                                                                                                // la izquierda por
                                                                                                // cero. [0,1,2,3]
        // Para poder usar los arrays, hay que crearlos y darles espacios con "new" y la
        // cantida de elementos que querramos guardar como máximo.
        // El tamaño es fijo (estatico)
        String nombresAlumnos[] = new String[30];

        // Podemos asignar valores a un array por la posicion
        nombresAlumnos[0] = "Juan";

        for (int i = 0; i <= 30; i++) {
            nombresAlumnos[i] = "nombre " + (i + 1);
        }
        // Con un for recorremos el array y lo sacamos por pantalla.
        // Este for especial en otros lenguajes se denomina "for each"
        for (String nombre : nombresAlumnos) { // para cada nombre que está dentro de esta colección.
            System.out.println(nombre);
        }

        // Ejemplo sacar el nombre correspondiente a la edad minima.
        for (int i = 0; i < edadesAlummnos.length; i++) {
            // Para calcular el minimo miramos si el minimo actual es menor que el valor de
            // la posición.
            if (edadesAlummnos[i] < miniedad)
                miniedad = edadesAlummnos[i];
            posminimo = i;
        }
        System.out.println("El nombre del alumno mas joven es " + nombresAlumnos[posminimo] + " y la edad "
                + edadesAlummnos[posminimo]);
    }
}
