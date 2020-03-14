package Conexiones;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author randy
 */
public class Metodos_Sql {

    public static Conexion conexion = new Conexion();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;

    public int guardar_persona(int ID_PERSONA, String USUARIO, String CONTRASENA, String NOMBRE, String APELLIDO_P, String APELLIDO_M, String DIRECCION, String TELEFONO) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("insert into PERSONA (ID_PERSONA,USUARIO,CONTRASENA,NOMBRE,APELLIDO_P,APELLIDO_M,DIRECCION,TELEFONO) \n"
                + "values(?,?,?,?,?,?,?,?)");
        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_PERSONA);
            sentencia_preparada.setString(2, USUARIO);
            sentencia_preparada.setString(3, CONTRASENA);
            sentencia_preparada.setString(4, NOMBRE);
            sentencia_preparada.setString(5, APELLIDO_P);
            sentencia_preparada.setString(6, APELLIDO_M);
            sentencia_preparada.setString(7, DIRECCION);
            sentencia_preparada.setString(8, TELEFONO);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public static String buscarNombre(String USUARIO) {
        String busqueda_nombre = null;
        Connection conexion = null;
        try {
            conexion = Conexion.conectar();
            String sentencia_buscar = ("SELECT USUARIO,CONTRASENA from PERSONA  WHERE USUARIO ='" + USUARIO + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("USUARIO");
                busqueda_nombre = nombre;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_nombre;
    }

    public static String buscarUsuarioRegistrado(String USUARIO, String CONTRASENA) {
        String busqueda_usuario = null;
        Connection conexion = null;
        try {
            conexion = Conexion.conectar();
            String sentencia_buscar_usuario = ("select * from PERSONA where USUARIO='" + USUARIO + "' and CONTRASENA='" + CONTRASENA + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {
                busqueda_usuario = "usuario encontrado";
            } else {
                busqueda_usuario = "Usuario no se encontro";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_usuario;
    }

    public static String consulta_persona() {
        String busqueda_persona = null;
        Connection conexion = null;
        try {
            conexion = Conexion.conectar();
            String sentencia_buscar_usuario = ("select top(1) ID_PERSONA FROM PERSONA ORDER BY ID_PERSONA DESC");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {
                String clave = resultado.getString("ID_PERSONA");
                busqueda_persona = clave;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(busqueda_persona);
        }
        return busqueda_persona;
    }

    public int guardar_cliente(int ID_CLIENTE, int ID_PERSONA) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT INTO CLIENTES (ID_CLIENTE,ID_PERSONA) VALUES (?,?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_CLIENTE);
            sentencia_preparada.setInt(2, ID_PERSONA);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int guardar_cargo(int ID_CARGO, String NOMBRE) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("insert into CARGO VALUES (?,?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_CARGO);
            sentencia_preparada.setString(2, NOMBRE);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int guardar_establecimiento(int ID_ESTABLECIMIENTO, String NOMBRE_ESTABLECIMIENTO, String TELEFONO, String DIRECCION) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("insert into ESTABLECIMIENTO values (?,?,?,?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_ESTABLECIMIENTO);
            sentencia_preparada.setString(2, NOMBRE_ESTABLECIMIENTO);
            sentencia_preparada.setString(3, TELEFONO);
            sentencia_preparada.setString(4, DIRECCION);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int guardar_mesa(int ID_MESA, int NUM_MESA) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("insert into MESA values (?,?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_MESA);
            sentencia_preparada.setInt(2, NUM_MESA);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int guardar_platos(int ID_PLATO, String NOM_PLATO, int PRECIO_PLATO) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("insert into PLATOS values (?,?,?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_PLATO);
            sentencia_preparada.setString(2, NOM_PLATO);
            sentencia_preparada.setInt(3, PRECIO_PLATO);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int guardar_empleado(int ID_EMPLEADOS, int ID_CARGO, int ID_PERSONA, int ID_ESTABLECIMIENTO) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("insert into EMPLEADOS VALUES(?,?,?,?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_EMPLEADOS);
            sentencia_preparada.setInt(2, ID_CARGO);
            sentencia_preparada.setInt(3, ID_PERSONA);
            sentencia_preparada.setInt(4, ID_ESTABLECIMIENTO);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error--- " + e);
        }

        return resultado;
    }

    public int guardar_Detalle_Factura(int ID_DETALLE_FACTURA, int ID_FACTURA, int ID_EMPLEADOS, int ID_PLATO, int ID_MESA) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("insert into DETALLE_FACTURA VALUES(?,?,?,?,?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_DETALLE_FACTURA);
            sentencia_preparada.setInt(2, ID_FACTURA);
            sentencia_preparada.setInt(3, ID_EMPLEADOS);
            sentencia_preparada.setInt(4, ID_PLATO);
            sentencia_preparada.setInt(5, ID_MESA);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error--- " + e);
        }

        return resultado;
    }

    public int guardar_FACTURA(int ID_FACTURA, int ID_CLIENTE, String FECHA) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("INSERT  INTO FACTURA VALUES (?,?,?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_FACTURA);
            sentencia_preparada.setInt(2, ID_CLIENTE);
            sentencia_preparada.setString(3, FECHA);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error--- " + e);
        }

        return resultado;
    }

    public int guardar_RESERVACIONES(int ID_RESERVA, int ID_CLIENTE, int ID_MESA, String FECHA, int ID_ESTABLECIMIENTO) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("insert into RESERVACIONES VALUES(?,?,?,?,?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_RESERVA);
            sentencia_preparada.setInt(2, ID_CLIENTE);
            sentencia_preparada.setInt(3, ID_MESA);
            sentencia_preparada.setString(4, FECHA);
            sentencia_preparada.setInt(5, ID_ESTABLECIMIENTO);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error--- " + e);
        }

        return resultado;
    }

    public static String buscarClave_Cliente(String ID_CLIENTE) {
        String busqueda_clave = null;
        Connection conexion = null;
        try {
            conexion = Conexion.conectar();
            String sentencia_buscar = ("SELECT ID_CLIENTE, ID_PERSONA from CLIENTES  WHERE ID_CLIENTE ='" + ID_CLIENTE + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String clave = resultado.getString("ID_CLIENTE");
                busqueda_clave = clave;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_clave;
    }

    public static String buscarClave_Cliente2(String ID_PERSONA) {
        String busqueda_clave = null;
        Connection conexion = null;
        try {
            conexion = Conexion.conectar();
            String sentencia_buscar = ("SELECT ID_CLIENTE, ID_PERSONA from CLIENTES  WHERE ID_PERSONA ='" + ID_PERSONA + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String clave = resultado.getString("ID_CLIENTE");
                busqueda_clave = clave;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_clave;
    }

    public static String buscar_usuario_paraclave(String USUARIO) {
        String busqueda_clave = null;
        Connection conexion = null;
        try {
            conexion = Conexion.conectar();
            String sentencia_buscar = ("select ID_PERSONA from PERSONA\n"
                    + "WHERE USUARIO='" + USUARIO + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String clave = resultado.getString("ID_PERSONA");
                busqueda_clave = clave;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_clave;
    }

    public static float precio_plato(int ID_PLATO) {
        float busqueda_clave = 0;
        Connection conexion = null;
        try {
            conexion = Conexion.conectar();
            String sentencia_buscar = ("select PRECIO_PLATO from PLATOS WHERE ID_PLATO='" + ID_PLATO + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                float clave = resultado.getFloat("PRECIO_PLATO");
                busqueda_clave = clave;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_clave;
    }

    //----Guarda los datos de  otra base de daots
    public int guardar_pedido(int ID_PEDIDO, int ID_PERSONA, int ID_PLATO, int ID_MESA, float PRECIO_TOTAL) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("insert into PEDIDOS VALUES (?,?,?,?,?)");

        try {
            conexion = Conexion.conectar2();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_PEDIDO);
            sentencia_preparada.setInt(2, ID_PERSONA);
            sentencia_preparada.setInt(3, ID_PLATO);
            sentencia_preparada.setInt(4, ID_MESA);
            sentencia_preparada.setFloat(5, PRECIO_TOTAL);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    //eliminar
    public int eliminar_persona(int ID_PERSONA) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("Delete from PERSONA WHERE ID_PERSONA=(?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_PERSONA);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int eliminar_empleado(int ID_EMPLEADOS) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("Delete from EMPLEADOS WHERE ID_EMPLEADOS=(?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_EMPLEADOS);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int eliminar_cliente(int ID_CLIENTE) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("Delete from CLIENTES WHERE ID_CLIENTE=(?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_CLIENTE);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int actualizar_persona(String USUARIO, String CONTRASENA, String NOMBRE, String APELLIDO_P, String APELLIDO_M, String DIRECCION, String TELEFONO, int ID_PERSONA) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("update PERSONA set  USUARIO=(?), CONTRASENA=(?), NOMBRE=(?), APELLIDO_P=(?), APELLIDO_M=(?), DIRECCION=(?), TELEFONO=(?) where ID_PERSONA=(?)");
        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, USUARIO);
            sentencia_preparada.setString(2, CONTRASENA);
            sentencia_preparada.setString(3, NOMBRE);
            sentencia_preparada.setString(4, APELLIDO_P);
            sentencia_preparada.setString(5, APELLIDO_M);
            sentencia_preparada.setString(6, DIRECCION);
            sentencia_preparada.setString(7, TELEFONO);
            sentencia_preparada.setInt(8, ID_PERSONA);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int actualizar_empleado(int ID_CARGO, int ID_ESTABLECIMIENTO, int ID_EMPLEADO) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("update EMPLEADOS SET ID_CARGO=(?),ID_ESTABLECIMIENTO=(?)\n"
                + "WHERE ID_EMPLEADOS=(?)");
        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_CARGO);
            sentencia_preparada.setInt(2, ID_ESTABLECIMIENTO);
            sentencia_preparada.setInt(3, ID_EMPLEADO);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int actualizar_R_Factura(int ID_CLIENTE, String FECHA, int ID_FACTURA) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("update FACTURA SET ID_CLIENTE=(?),FECHA=(?) WHERE ID_FACTURA=(?)");
        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_CLIENTE);
            sentencia_preparada.setString(2, FECHA);
            sentencia_preparada.setInt(3, ID_FACTURA);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int actualizar_Establecimiento(String Nombre, int telefono, String Direccion, int ID_ESTABLECIMIENTO) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("UPDATE ESTABLECIMIENTO SET NOM_ESTABLECIMIENTO=(?), TELEFONO=(?), DIRECCION=(?)\n"
                + "WHERE ID_ESTABLECIMIENTO=(?)");
        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

            sentencia_preparada.setString(1, Nombre);
            sentencia_preparada.setInt(2, telefono);
            sentencia_preparada.setString(3, Direccion);
            sentencia_preparada.setInt(4, ID_ESTABLECIMIENTO);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int eliminar_factura(int ID_FACTURA) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("Delete from FACTURA WHERE ID_FACTURA=(?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_FACTURA);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int actualizar_Cargo(String NOMBRE, int ID_CARGO) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("update CARGO SET NOMBRE=(?) where ID_CARGO=(?)");
        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

            sentencia_preparada.setString(1, NOMBRE);
            sentencia_preparada.setInt(2, ID_CARGO);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int eliminar_CARGO(int ID_CARGO) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("Delete from CARGO WHERE ID_CARGO=(?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_CARGO);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }

    public int eliminar_Establecimiento(int ID_ESTABLECIMIENTO) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("Delete from ESTABLECIMIENTO WHERE ID_ESTABLECIMIENTO=(?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, ID_ESTABLECIMIENTO);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }
    public int actualizar_plato(String Nombre_Plato, float precio_plato, int ID_PLATO) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("UPDATE PLATOS SET NOM_PLATO=(?), PRECIO_PLATO=(?) WHERE ID_PLATO=(?)");
        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

            sentencia_preparada.setString(1, Nombre_Plato);
            sentencia_preparada.setFloat(2, precio_plato);
            sentencia_preparada.setInt(3, ID_PLATO);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }
     public int eliminar_plato(int id_plato) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("Delete from PLATOS WHERE ID_PLATO=(?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, id_plato);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }
     //mesas
     public int actualizar_mesas(String num_mesa, int ID_MESA) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("UPDATE MESA SET NUM_MESA=(?) WHERE ID_MESA=(?)");
        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);

            sentencia_preparada.setString(1, num_mesa);
            sentencia_preparada.setInt(2, ID_MESA);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }
      public int eliminar_mesa(int id_mesa) throws SQLException {
        int resultado = 0;
        Connection conexion = null;
        String sentencia_guardar = ("Delete from MESA WHERE ID_MESA=(?)");

        try {
            conexion = Conexion.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setInt(1, id_mesa);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return resultado;
    }
}
