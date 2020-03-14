package Conexiones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author randy
 */
public class Cargar_Combobox {

    Conexion metodos = new Conexion();

    public void consultar(JComboBox cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select NOMBRE FROM CARGO";
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                cbox_datos.addItem(result.getString("NOMBRE"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }

    public void consultar2(JComboBox cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select NOM_ESTABLECIMIENTO FROM ESTABLECIMIENTO";
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                cbox_datos.addItem(result.getString("NOM_ESTABLECIMIENTO"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    public void consultar_factura(JComboBox cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select ID_FACTURA FROM FACTURA";
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                cbox_datos.addItem(result.getString("ID_FACTURA"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    public void consultar_plato(JComboBox cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select NOM_PLATO FROM PLATOS";
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                cbox_datos.addItem(result.getString("NOM_PLATO"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    public void consultar_empleado(JComboBox cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select ID_EMPLEADOS FROM EMPLEADOS";
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                cbox_datos.addItem(result.getString("ID_EMPLEADOS"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    public void consultar_mesa(JComboBox cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select ID_MESA FROM MESA";
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                cbox_datos.addItem(result.getString("ID_MESA"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    public void clave_persona(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL ="select top(1) ID_PERSONA from PERSONA order by ID_PERSONA desc";
        
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_PERSONA"))+1));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    public void clave_Mesa(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select top(1) ID_MESA from MESA order by ID_MESA desc";
        
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_MESA"))+1));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    public void clave_empleado(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select top(1) ID_EMPLEADOS from EMPLEADOS order by ID_EMPLEADOS desc";
        
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_EMPLEADOS"))+1));
                
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
     public void clave_cliente(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select top(1) ID_CLIENTE from CLIENTES order by ID_CLIENTE desc";
        
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_CLIENTE"))+1));
                
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
     public void clave_cargo(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select top(1) ID_CARGO from CARGO order by ID_CARGO desc";
        
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_CARGO"))+1));
                
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
     public void clave_Id_Factura(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select top(1) ID_DETALLE_FACTURA from DETALLE_FACTURA order by ID_DETALLE_FACTURA desc";
        
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_DETALLE_FACTURA"))+1));
                
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
     public void clave_Id_Establecimiento(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select top(1) ID_ESTABLECIMIENTO from ESTABLECIMIENTO order by ID_ESTABLECIMIENTO desc";
        
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_ESTABLECIMIENTO"))+1));
                
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
     public void clave_ID_factura(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select top(1) ID_FACTURA from FACTURA order by ID_FACTURA desc";
        
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_FACTURA"))+1));
                
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
     public void consulta_ID_CLIENTE(JComboBox cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "SELECT * FROM CLIENTES";
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                
                cbox_datos.addItem(result.getString("ID_CLIENTE"));
                
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
public void clave_ID_Reserva(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select top(1) ID_RESERVA from RESERVACIONES order by ID_RESERVA desc";
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_RESERVA"))+1));
                
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
public void consultar_Establecimiento(JComboBox cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select ID_ESTABLECIMIENTO FROM ESTABLECIMIENTO ORDER BY ID_ESTABLECIMIENTO ASC";
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                cbox_datos.addItem(result.getString("ID_ESTABLECIMIENTO"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
//-Consultasd de la Segunda BASE DE DATOS
public void clave_pedidos(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar2 = null;
        //Creamos la Consulta SQL
        String SSQL = "select top(1) ID_PEDIDO from PEDIDOS order by ID_PEDIDO desc";
        
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar2 = metodos.conectar2();
            //prepara la cosulta
            PreparedStatement pst = conectar2.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_PEDIDO"))+1));
                
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar2 != null) {
                try {
                    conectar2.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
public void clave_platos(JLabel cbox_datos) {
        //Creamos objeto tipo Connection
        java.sql.Connection conectar = null;
        //Creamos la Consulta SQL
        String SSQL = "select top(1) ID_PLATO from PLATOS order by ID_PLATO desc";
        
        //Establecemos bloque try-catch-finally
        try {
            //Establecer la Conexion con la base de Datos
            conectar = metodos.conectar();
            //prepara la cosulta
            PreparedStatement pst = conectar.prepareStatement(SSQL);
            //Ejecutar la sentencia SQL y guardalo en el objeto resultSet
            ResultSet result = pst.executeQuery();
            //llenar nuestro combobox
            //cbox_datos.addItem("Seleccione una Opción");
            while (result.next()) {
                //cbox_datos.addItem(result.getString("ID_PERSONA"));
                cbox_datos.setText(String.valueOf(Integer.parseInt(result.getString("ID_PLATO"))+1));
                
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conectar != null) {
                try {
                    conectar.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
}
