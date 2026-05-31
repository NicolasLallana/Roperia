package Clases;

import java.io.FileOutputStream;

public class PuertoUSB {
    
    private String puerto;

    public PuertoUSB(String pue) {
        this.puerto = pue;
    }

    public void imprimir(byte[] dato) throws Exception {
        try (FileOutputStream out = new FileOutputStream(puerto)) {
            out.write(dato);
        }
    }
    
}
