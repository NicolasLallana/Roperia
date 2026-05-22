
package Conexiones;

import java.sql.DriverManager; 
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class ConsultasBD {

    Connection enlazar = null;
    public boolean status = false;

    public Connection conecta(){
        try{
            enlazar = DriverManager.getConnection("jdbc:mysql://localhost:3306/roperia", "roperia", "1234");
            status = true;
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "la conexión no fue establecida por: " + e);
            status = false;
        }
        return enlazar;
    }
    
    public static void AgregarProducto(String desc, float precio)throws SQLException{
        CallableStatement entrada = ConexionBD.getConnection().prepareCall("{call Crear_Producto(?,?)}");
        entrada.setString(1,desc);
        entrada.setFloat(2,precio);
        entrada.execute();
    }
    
    public static void ModificarPrecioProducto(int idprod, float nuevoprecio) throws SQLException {
        CallableStatement entrada = ConexionBD.getConnection().prepareCall("{CALL Modificar_Precio_producto(?,?)}");
        entrada.setInt(1, idprod);
        entrada.setFloat(2, nuevoprecio);
        entrada.executeUpdate();
    }
    
    public static void CrearVenta(int id, int idprod, int cant){
        try {
            CallableStatement entrada = ConexionBD.getConnection().prepareCall("{call Crear_Venta(?,?,?)}");
            entrada.setInt(1,id);
            entrada.setInt(2,idprod);
            entrada.setInt(3,cant);
            entrada.execute();
        } catch (SQLException ex) {
            System.getLogger(ConsultasBD.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
    public static void EliminarVenta(int idventa){
        try{
            CallableStatement entrada = ConexionBD.getConnection().prepareCall("{call Eliminar_Venta(?)}");
            entrada.setInt(1, idventa);
            entrada.execute();
        } catch (SQLException e){
             System.getLogger(ConsultasBD.class.getName()).log(System.Logger.Level.ERROR, (String) null, e);
        }
    }
    
    public static ResultSet ListarVenta(int idventa){
         ResultSet res = null;
        try {
            CallableStatement entrada = ConexionBD.getConnection().prepareCall("{call Listar_Venta(?)}");
            entrada.setInt(1,idventa);
            res = entrada.executeQuery();
        } catch (SQLException e){
            System.getLogger(ConsultasBD.class.getName()).log(System.Logger.Level.ERROR, (String) null, e);
        }
        return res;
    }
    
    public static ResultSet ListarVentaPeriodo(Date finicio, Date ffinal){
         ResultSet res = null;
        try {
            CallableStatement entrada = ConexionBD.getConnection().prepareCall("{CALL Listar_Ventas_Periodo(?,?)}");
            entrada.setDate(1,finicio);
            entrada.setDate(2,ffinal);
            res = entrada.executeQuery();
        } catch (SQLException e){
            System.getLogger(ConsultasBD.class.getName()).log(System.Logger.Level.ERROR, (String) null, e);
        }
        return res;
    }
    
    public static int NuevaIdVenta() {
        int id = 0;
        try (Connection c = ConexionBD.getConnection();
            CallableStatement cst = c.prepareCall("SELECT Nueva_Idventa()")) {
            ResultSet res = cst.executeQuery();
            if (res.next()) {
                id = res.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return id;
    }

    
    public static int IdProducto(String nombreprod) {
        int id = 0;
        try (Connection c = ConexionBD.getConnection();
            PreparedStatement pst = c.prepareStatement("SELECT Get_Idproducto(?)")) {
            pst.setString(1, nombreprod);
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                id = res.getInt(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return id;
    }

   public static float TotalVenta(int idventa) {
    float total = 0;
    try (Connection c = ConexionBD.getConnection();
         PreparedStatement pst = c.prepareStatement("SELECT Total_Venta(?)")){
        pst.setInt(1, idventa);
        try (ResultSet res = pst.executeQuery()) {
            if (res.next()) {
                total = res.getFloat(1);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return total;
    }

   
   public static float TotalVentaPeriodo(Date finicio, Date ffinal) {
    float total = 0;
    try (Connection c = ConexionBD.getConnection();
         PreparedStatement pst = c.prepareStatement("SELECT Total_Venta_Periodo(?,?)")){
        pst.setDate(1, finicio);
        pst.setDate(2, ffinal);
        try (ResultSet res = pst.executeQuery()) {
            if (res.next()) {
                total = res.getFloat(1);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return total;
    }
   
   
       public static String getNombreProducto(int idprod) {
           String producto = "";
           try (Connection c = ConexionBD.getConnection();
                PreparedStatement pst = c.prepareStatement("SELECT Get_Nombre_Producto(?)")){
               pst.setInt(1, idprod);
               try (ResultSet res = pst.executeQuery()){
                   if (res.next()){
                       producto = res.getString(1);
                   }
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
           return producto;
    }

   
}
