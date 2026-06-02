
package Impresiones;


public class Ticket {
    
    private static final int WIDTH = 32;

    public static String centro(String text) {
        int padding = (WIDTH - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text + "\n";
    }

    public static String linea() {
        return "-".repeat(WIDTH) + "\n";
    }

    public static String item(String nombre, double precio) {
        String p = String.format("$%.2f", precio);
        int espacio = WIDTH - nombre.length() - p.length();
        return nombre + " ".repeat(Math.max(1, espacio)) + p + "\n";
    } 
}
