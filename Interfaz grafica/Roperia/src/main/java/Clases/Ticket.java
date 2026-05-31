
package Clases;


public class Ticket {
    
    private static final int WIDTH = 32;

    public static String centro(String text) {
        int padding = (WIDTH - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text + "\n";
    }

    public static String linea() {
        return "-".repeat(WIDTH) + "\n";
    }

    public static String item(String name, double price) {
        String p = String.format("$%.2f", price);
        int espacio = WIDTH - name.length() - p.length();
        return name + " ".repeat(Math.max(1, espacio)) + p + "\n";
    } 
}
