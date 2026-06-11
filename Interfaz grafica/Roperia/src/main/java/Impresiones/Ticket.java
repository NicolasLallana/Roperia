
package Impresiones;

import Impresiones.EscPos;
import Conexiones.ConsultasBD;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ticket {
    
    public static String resultSetToTicket(ResultSet rs) throws SQLException {
        StringBuilder sb = new StringBuilder();
        while (rs.next()) {
            String producto = rs.getString("Productos");
            int cantidad = rs.getInt("Cant");
            float precio = rs.getFloat("Precio");
            sb.append(producto)
            .append("  x")
            .append(cantidad)
            .append("  $")
            .append(precio)
            .append("\n");
        }

        return sb.toString();
    }

    
    public String TicketParaImprimir(int id) throws SQLException{
        ResultSet rs = ConsultasBD.ListarVenta(id);
        String detalle = resultSetToTicket(rs);
        String total = String.valueOf(ConsultasBD.TotalVenta(id));
        return EscPos.INIT +
        EscPos.ALIGN_CENTER +
        EscPos.DOUBLE_SIZE +
        "RoperiaJB!\n" + 
        EscPos.BOLD_ON +
        EscPos.NUMBER_SIZE +
        id +
        EscPos.NORMAL_SIZE +
        EscPos.ALIGN_LEFT +
        detalle +
        "Probando impresión ESC/POS\n" +
        "Total: " + total + "\n\n" +
        EscPos.CUT;
    }
}
