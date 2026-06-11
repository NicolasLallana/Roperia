package Impresiones;

import javax.print.*;
import javax.print.attribute.*;
import javax.print.attribute.standard.*;

public class ImpresionesWindows {

    public static void imprimir(String texto) throws Exception {
        // Nombre EXACTO de la impresora como aparece en Windows
        String nombreImpresora = "XP-80C";
        // Buscar la impresora instalada en Windows
        PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
        PrintService impresora = null;
        for (PrintService service : services) {
            if (service.getName().equalsIgnoreCase(nombreImpresora)) {
                impresora = service;
                break;
            }
        }
        if (impresora == null) {
            throw new Exception("No se encontró impresora");
        }
        // Convertir el texto a bytes ESC/POS
        byte[] datos = texto.getBytes("UTF-8");
        // Crear el trabajo de impresión
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        Doc doc = new SimpleDoc(datos, flavor, null);
        DocPrintJob job = impresora.createPrintJob();
        job.print(doc, null);
    }
}
