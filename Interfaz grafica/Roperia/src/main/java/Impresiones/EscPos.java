
package Impresiones;

public class EscPos {

    // -------------------------------
    //  Inicialización
    // -------------------------------
    public static final String INIT = "\u001B\u0040";   // ESC @

    // -------------------------------
    //  Tamaños de texto
    // -------------------------------
    public static final String NORMAL_SIZE      = "\u001B\u0021\u0000"; // Tamaño normal
    public static final String DOUBLE_HEIGHT    = "\u001B\u0021\u0010"; // Doble alto
    public static final String DOUBLE_WIDTH     = "\u001B\u0021\u0020"; // Doble ancho
    public static final String DOUBLE_SIZE      = "\u001B\u0021\u0030"; // Doble alto + ancho
    public static final String NUMBER_SIZE      = "\u001B\u0021\u0060"; // Probando tamaños para numeros

    // -------------------------------
    //  Estilos
    // -------------------------------
    public static final String BOLD_ON          = "\u001B\u0045\u0001"; // Negrita ON
    public static final String BOLD_OFF         = "\u001B\u0045\u0000"; // Negrita OFF

    public static final String UNDERLINE_ON     = "\u001B\u002D\u0001"; // Subrayado ON
    public static final String UNDERLINE_OFF    = "\u001B\u002D\u0000"; // Subrayado OFF

    // -------------------------------
    //  Alineación
    // -------------------------------
    public static final String ALIGN_LEFT       = "\u001B\u0061\u0000"; // Izquierda
    public static final String ALIGN_CENTER     = "\u001B\u0061\u0001"; // Centro
    public static final String ALIGN_RIGHT      = "\u001B\u0061\u0002"; // Derecha

    // -------------------------------
    //  Corte de papel
    // -------------------------------
    public static final String CUT              = "\u001D\u0056\u0000"; // Corte parcial
    public static final String FULL_CUT         = "\u001D\u0056\u0001"; // Corte total

    // -------------------------------
    //  Avances de línea
    // -------------------------------
    public static final String LINE             = "\n";
    public static final String FEED_3           = "\u001B\u0064\u0003"; // Avanza 3 líneas
    public static final String FEED_5           = "\u001B\u0064\u0005"; // Avanza 5 líneas
}

