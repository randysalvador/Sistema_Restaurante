package Conexiones;

import static Conexiones.Metodos_Sql.resultado;
import static Conexiones.Metodos_Sql.sentencia_preparada;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * @author randy
 */
public class Conexion {
    public static String url = "jdbc:sqlserver://Emile-A239:1433;databaseName=RESTAURANTE_PRO";
    public static String usuario = "RESTAURANTE_PRO1";
    public static String contraseña = "root";
    public static String clase = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    //---------Segunda Base de DATOS
    public static String url2 = "jdbc:sqlserver://Emile-A239:1433;databaseName=RESTAURANTE_PRO2";
    public static String usuario2 = "RESTAURANTE_PRO2";
    public static String contraseña2 = "root";
    public static String clase2 = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
    public static Connection conectar2() {
        Connection conexion = null;
        try {
            Class.forName(clase2);
            conexion = (Connection) DriverManager.getConnection(url2, usuario2, contraseña2);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de la Segunda BASE DE DATOS" + e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
}
