package Impresiones;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PuertoUSB {

    private final String puerto;

    public PuertoUSB(String puerto) {
        this.puerto = puerto;
    }

    // Constructor automático
    public static PuertoUSB detectar() throws Exception {
        String puertoDetectado = detectarPuertoImpresora();

        if (puertoDetectado == null) {
            throw new Exception("No se encontró ninguna impresora térmica en USB/LPT.");
        }

        return new PuertoUSB(puertoDetectado);
    }

    // Detección real del puerto
    private static String detectarPuertoImpresora() {

        // Puertos típicos de impresoras térmicas en Windows
        String[] posibles = {
            "USB001", "USB002", "USB003",
            "LPT1", "LPT2", "LPT3"
        };

        for (String p : posibles) {
            File f = new File("\\\\.\\" + p);
            if (f.exists() || f.canWrite()) {
                return "\\\\.\\" + p;
            }
        }

        return null;
    }

    public void imprimir(byte[] datos) throws Exception {

        if (datos == null || datos.length == 0) {
            throw new IllegalArgumentException("No hay datos para imprimir.");
        }

        try (FileOutputStream out = new FileOutputStream(puerto)) {
            out.write(datos);
            out.flush();
        } catch (IOException e) {
            throw new IOException("Error al escribir en el puerto USB: " + puerto, e);
        }
    }
}
