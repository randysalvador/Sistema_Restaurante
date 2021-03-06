package Clases;

import Conexiones.Cargar_Combobox;
import Conexiones.Conexion;
import Conexiones.Metodos_Sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author randy
 */
public class Datos_Empleados extends javax.swing.JFrame {

    Cargar_Combobox metodos_cargarcombobox = new Cargar_Combobox();

    Conexion con = new Conexion();
    Connection cn = con.conectar();

    /**
     * Creates new form Datos_Empleados
     */
    Metodos_Sql metodo = new Metodos_Sql();

    public Datos_Empleados() throws SQLException {
        super("Datos del Empleado");
        initComponents();
        con.conectar();
        mostrartabla();
        setLocationRelativeTo(null);
        this.repaint();
        jComboBox3.removeAllItems();
        jComboBox4.removeAllItems();
        //Cargar nuestro Combobox con informacion de la BD
        metodos_cargarcombobox.consultar(jComboBox3);
        metodos_cargarcombobox.consultar2(jComboBox4);
        metodos_cargarcombobox.clave_persona(jLabel14);
        metodos_cargarcombobox.clave_empleado(jLabel13);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        setExtendedState(MAXIMIZED_BOTH);
    }

    void selecciondatos() throws SQLException {
        jButton1.setEnabled(false);
        jButton3.setEnabled(true);
        int fila = tabladatos.getSelectedRow();
        if (fila > 0) {
            jLabel13.setText(tabladatos.getValueAt(fila, 0).toString());
            jComboBox3.setSelectedItem(tabladatos.getValueAt(fila, 1).toString());
            jComboBox4.setSelectedItem(tabladatos.getValueAt(fila, 2).toString());
            jLabel14.setText(tabladatos.getValueAt(fila, 3).toString());
            jTextField3.setText(tabladatos.getValueAt(fila, 4).toString());
            jPasswordField1.setText(tabladatos.getValueAt(fila, 5).toString());
            jPasswordField2.setText(tabladatos.getValueAt(fila, 5).toString());
            jTextField4.setText(tabladatos.getValueAt(fila, 6).toString());
            jTextField5.setText(tabladatos.getValueAt(fila, 7).toString());
            jTextField6.setText(tabladatos.getValueAt(fila, 8).toString());
            jTextField7.setText(tabladatos.getValueAt(fila, 9).toString());
            jTextField8.setText(tabladatos.getValueAt(fila, 10).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    }

    void mostrartabla() throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id_Empleado");
        modelo.addColumn("Cargo");
        modelo.addColumn("Establecimiento");
        modelo.addColumn("Id_Persona");
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apedllido Materno");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        tabladatos.setModel(modelo);

        String sql = "SELECT E.ID_EMPLEADOS AS N_EMPLEADOS,C.NOMBRE AS CARGO, "
                + "ESTA.NOM_ESTABLECIMIENTO AS ESTABLECIMIENTO,P.ID_PERSONA AS "
                + "CLAVE_P,P.USUARIO AS USUARIO,P.CONTRASENA AS CONTRASENA, "
                + "P.NOMBRE AS NOMBRE,P.APELLIDO_P AS APELLIDO_PATERNO, "
                + "P.APELLIDO_M AS APELLIDO_MATERNO, P.DIRECCION AS DIRECCION, "
                + "P.TELEFONO AS TELEFONO\n"
                + "FROM PERSONA AS P, EMPLEADOS AS E, CARGO AS C, ESTABLECIMIENTO "
                + "AS ESTA WHERE P.ID_PERSONA=E.ID_PERSONA AND E.ID_CARGO=C.ID_CARGO "
                + "AND E.ID_ESTABLECIMIENTO=ESTA.ID_ESTABLECIMIENTO";
        String datos[] = new String[11];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                modelo.addRow(datos);
            }
            tabladatos.setModel(modelo);
        } catch (Exception ex) {
            Logger.getLogger(Datos_Clientes.class.getName()).
                                log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    //GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Id_Empleado");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Cargo del Empleado");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Establecimiento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Id_Persona");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Usuario");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Contraseña");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Apellido Paterno");

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Confirmar Contraseña");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Direccíon");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Apellido Materno");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("Teléfono");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.
                            GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jTextField3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 101, javax.swing.
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jTextField4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 165, javax.swing.
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 165, javax.swing.
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 165, javax.swing.
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 165, javax.swing.
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField8)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jPasswordField2, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField4, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField5, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField6, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPasswordField1, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(
                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.
        GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.
                ComponentPlacement.RELATED, javax.swing.
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                    GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox3, 0, 233, Short.MAX_VALUE)
                        .addComponent(jComboBox4, 0, javax.swing.
                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.
                    GroupLayout.PREFERRED_SIZE, 50, javax.swing.
                    GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.
                    GroupLayout.PREFERRED_SIZE, 50, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13, javax.swing.
                    GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.
                ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox3, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.
                ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox4, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.
                ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel14, javax.swing.
                    GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.
                ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("regresar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Actualizar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Eliminar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 201, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Modificar");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.
                    GroupLayout.PREFERRED_SIZE, 816, javax.swing.
                    GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.
                            GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addComponent(jButton3)
                        .addGap(20, 20, 20)
                        .addComponent(jButton6)
                        .addGap(20, 20, 20)
                        .addComponent(jButton4)
                        .addGap(20, 20, 20)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
                                    layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.
                                    GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.
                GroupLayout.PREFERRED_SIZE, 426, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton1ActionPerformed

        if (String.valueOf(jPasswordField1.getPassword())
            .equals(String.valueOf(jPasswordField2.getPassword()))) {
            try {
                int i = metodo.guardar_persona(
                    Integer.valueOf(jLabel14.getText()), jTextField3.getText(), 
                    jPasswordField1.getText(), jTextField4.getText(), 
                    jTextField5.getText(), jTextField6.getText(),
                     jTextField7.getText(), jTextField8.getText());

                if (i > 0) {
                    metodo.guardar_empleado(Integer.valueOf(jLabel13.getText()),
                     jComboBox3.getSelectedIndex(),
                     Integer.valueOf(jLabel13.getText()),
                     jComboBox4.getSelectedIndex());
                    JOptionPane.showMessageDialog(this,
                     "Datos Guardados Correctamente");

                    jLabel13.setText("");
                    jLabel14.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField6.setText("");
                    jTextField7.setText("");
                    jTextField8.setText("");
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");
                    jComboBox3.setSelectedIndex(0);
                    jComboBox4.setSelectedIndex(0);

                    metodos_cargarcombobox.clave_persona(jLabel14);
                    metodos_cargarcombobox.clave_empleado(jLabel13);
                    con.conectar();
                    mostrartabla();
                } else {
                    JOptionPane.showMessageDialog(this,
                     "No se pudo guardar los datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).
                log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Sistema_Adm ventana = new Sistema_Adm();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    void limpiar() {
        jLabel13.setText("");
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jLabel14.setText("");

        jTextField3.setText("");
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");

        metodos_cargarcombobox.clave_persona(jLabel14);
        metodos_cargarcombobox.clave_empleado(jLabel13);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton1.disable();
        try {
                int i = metodo.actualizar_persona( jTextField3.getText(),
                 jPasswordField1.getText(), jTextField4.getText(), 
                 jTextField5.getText(), jTextField6.getText(), 
                 jTextField7.getText(), jTextField8.getText(),
                 Integer.valueOf(jLabel14.getText()));
                    if (i > 0) {
                        metodo.actualizar_empleado(jComboBox3.getSelectedIndex(),
                         jComboBox4.getSelectedIndex(),
                         Integer.valueOf(jLabel13.getText()));
                    JOptionPane.showMessageDialog(this, 
                    "Datos Actualizados Correctamente");

                    metodos_cargarcombobox.clave_persona(jLabel14);
                    metodos_cargarcombobox.clave_empleado(jLabel13);
                    con.conectar();
                    limpiar();
                    mostrartabla();
                } else {
                    JOptionPane.showMessageDialog(this, 
                    "No se pudo Actualizar los datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).
                log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //Aqui se cargan los datos
        jButton1.setEnabled(false);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        int fila = tabladatos.getSelectedRow();
        if (fila > 0) {
            jLabel13.setText(tabladatos.getValueAt(fila, 0).toString());
            jComboBox3.setSelectedItem(tabladatos.getValueAt(fila, 1).toString());
            jComboBox4.setSelectedItem(tabladatos.getValueAt(fila, 2).toString());
            jLabel14.setText(tabladatos.getValueAt(fila, 3).toString());
            jTextField3.setText(tabladatos.getValueAt(fila, 4).toString());
            jPasswordField1.setText(tabladatos.getValueAt(fila, 5).toString());
            jPasswordField2.setText(tabladatos.getValueAt(fila, 5).toString());
            jTextField4.setText(tabladatos.getValueAt(fila, 6).toString());
            jTextField5.setText(tabladatos.getValueAt(fila, 7).toString());
            jTextField6.setText(tabladatos.getValueAt(fila, 8).toString());
            jTextField7.setText(tabladatos.getValueAt(fila, 9).toString());
            jTextField8.setText(tabladatos.getValueAt(fila, 10).toString());

        } else {
            JOptionPane.showMessageDialog(null, 
            "Fila no seleccionada");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        limpiar();
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton4ActionPerformed
          try {
                int i = metodo.eliminar_empleado(
                    Integer.valueOf(jLabel13.getText()));

                if (i > 0) {
                    metodo.eliminar_persona(
                        Integer.valueOf(jLabel14.getText()));
                    JOptionPane.showMessageDialog(this,
                     "Datos Eliminados Correctamente");

                    metodos_cargarcombobox.clave_persona(jLabel14);
                    metodos_cargarcombobox.clave_empleado(jLabel13);
                    con.conectar();
                    limpiar();
                    mostrartabla();
                } else {
                    JOptionPane.showMessageDialog(this, 
                    "No se pudo eliminar los datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).
                log(Level.SEVERE, null, ex);
            }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
                                                    getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Datos_Empleados.class.
            getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_Empleados.class.
            getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_Empleados.class.
            getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_Empleados.class.
            getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Datos_Empleados().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Datos_Empleados.class.
                    getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
