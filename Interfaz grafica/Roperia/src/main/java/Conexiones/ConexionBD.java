
package Conexiones;

import java.sql.DriverManager; 
import java.sql.Connection; 
import javax.swing.JOptionPane; 
import java.sql.SQLException; 

public class ConexionBD {
    static Connection enlazar = null;
    public static boolean status = false;
    public static String usuario;
    public static String password;

public static Connection getConnection(){
    status = false;
    String ruta = "jdbc:mysql://localhost:3306/roperia";
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    }catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null, "No se pudo establecer conexión, revisar Driver" + e.getMessage(), 
                "Error de conexión", JOptionPane.ERROR_MESSAGE);
    }
    try{
        enlazar = DriverManager.getConnection(ruta,ConexionBD.usuario,ConexionBD.password);
        status = true;
    } catch(SQLException e){
        JOptionPane.showInternalMessageDialog(null, "ERROR" + e.getMessage(),
                "Error de conexión", JOptionPane.ERROR_MESSAGE);
    }
    return enlazar;
}

public static void setcuenta(String usuario, String password){
    ConexionBD.usuario = usuario;
    ConexionBD.password = password;
}

public static boolean getstatus(){
    return status;
}

}
