package unidad2;

public class chiringuito { // "Cast" ---> Pasar de algo a String
    public static void main(String[] args) {

        String importe = "47.80";
        String comensales = "4";
        // double importedbl = Double.parseDouble("47.80");
        int importeInt = Integer.parseInt("47");
        int comensalesInt = Integer.parseInt("4");

        System.out.println("Cada persona paga " + (importeInt / comensalesInt) + " euros.");

    }
}
