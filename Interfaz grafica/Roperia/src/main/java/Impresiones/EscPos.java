
package Impresiones;


public class EscPos {

    // Inicialización
    public static final byte[] INIT = {0x1B, 0x40};

    // Estilos
    public static final byte[] BOLD_ON = {0x1B, 0x45, 0x01};
    public static final byte[] BOLD_OFF = {0x1B, 0x45, 0x00};

    // Alineación
    public static final byte[] LEFT = {0x1B, 0x61, 0x00};
    public static final byte[] CENTER = {0x1B, 0x61, 0x01};
    public static final byte[] RIGHT = {0x1B, 0x61, 0x02};

    // Corte de papel
    public static final byte[] CUT = {0x1D, 0x56, 0x00};

    // Tamaños de texto
    public static final byte[] DOUBLE_WIDTH = {0x1B, 0x21, 0x20};
    public static final byte[] DOUBLE_HEIGHT = {0x1B, 0x21, 0x10};
    public static final byte[] NORMAL_SIZE = {0x1B, 0x21, 0x00};

    // Avance de líneas
    public static final byte[] LINE_FEED = {0x0A};

}
