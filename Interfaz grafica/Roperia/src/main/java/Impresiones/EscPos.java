
package Impresiones;


public class EscPos {
    
    public static final byte[] INIT = {0x1B, 0x40};
    public static final byte[] BOLD_ON = {0x1B, 0x45, 0x01};
    public static final byte[] BOLD_OFF = {0x1B, 0x45, 0x00};
    public static final byte[] CUT = {0x1D, 0x56, 0x00};
    public static final byte[] CENTER = {0x1B, 0x61, 0x01};
    public static final byte[] LEFT = {0x1B, 0x61, 0x00};
    
}
