
package Impresiones;

import java.io.ByteArrayOutputStream;

public class Impresion {

    private PuertoUSB impresora;

    public Impresion(PuertoUSB impresora) {
        this.impresora = impresora;
    }

    public void imprimirTicket() throws Exception {

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        // Inicialización
        buffer.write(EscPos.INIT);

        // Título centrado y en negrita
        buffer.write(EscPos.CENTER);
        buffer.write(EscPos.BOLD_ON);
        buffer.write("ROPERIA JB\n".getBytes());
        buffer.write(EscPos.BOLD_OFF);

        // Línea separadora
        buffer.write(EscPos.LEFT);
        buffer.write(Ticket.linea().getBytes());

        // Ítems
        buffer.write(Ticket.item("Producto A", 120).getBytes());
        buffer.write(Ticket.item("Producto B", 350).getBytes());

        // Línea separadora
        buffer.write(Ticket.linea().getBytes());

        // Total destacado
        buffer.write(EscPos.BOLD_ON);
        buffer.write(Ticket.item("TOTAL", 470).getBytes());
        buffer.write(EscPos.BOLD_OFF);

        // Espacio antes del corte
        buffer.write("\n\n".getBytes());

        // Corte de papel
        buffer.write(EscPos.CUT);

        // Enviar a la impresora
        impresora.imprimir(buffer.toByteArray());
    }
}
