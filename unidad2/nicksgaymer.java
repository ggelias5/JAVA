package unidad2;

import java.util.Scanner;

public class nicksgaymer { // "Cast" ---> Pasar de algo a String
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String strNombre = "", strApellidos = "";

        System.out.println("Introduzca un nombre");
        strNombre = teclado.nextLine();
        System.out.println("Introduzca un apellido");
        strApellidos = teclado.nextLine();

        if (strNombre.length() >= 3 && strApellidos.length() >= 3){

                        
        

        String strNickNombre = strNombre.substring(0, 3);
        String strNickApellido = strApellidos.substring(0, 0);


        int totalCaracteres = strNombre.length() + strApellido.length();
        String NickName

        System.out.println(strNickName);
        
    
        }
        teclado.close();
    }
}
