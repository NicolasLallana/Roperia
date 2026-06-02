
package Impresiones;

import Impresiones.EscPos;
import java.io.ByteArrayOutputStream;


public class Impresion {
    private PuertoUSB impresora;

    public Impresion(PuertoUSB impresora) {
        this.impresora = impresora;
    }

    public void imprimirTicket() throws Exception {

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        buffer.write(EscPos.INIT);
        buffer.write(EscPos.CENTER);
        buffer.write("ROPERIA JB\n".getBytes());
        buffer.write(EscPos.LEFT);
        buffer.write(Ticket.linea().getBytes());
        buffer.write(Ticket.item("Producto A", 120).getBytes());
        buffer.write(Ticket.item("Producto B", 350).getBytes());
        buffer.write(Ticket.linea().getBytes());
        buffer.write("TOTAL: $470\n".getBytes());
        buffer.write("\n\n".getBytes());
        buffer.write(EscPos.CUT);

        impresora.imprimir(buffer.toByteArray());
    }
}
