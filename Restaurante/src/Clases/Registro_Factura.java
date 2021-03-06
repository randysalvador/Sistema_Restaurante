package Clases;

import Conexiones.Cargar_Combobox;
import Conexiones.Conexion;
import Conexiones.Metodos_Sql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author randy
 */
public class Registro_Factura extends javax.swing.JFrame {
Cargar_Combobox metodos_cargarcombobox = new Cargar_Combobox();
Conexion con = new Conexion();
    Connection cn = con.conectar();
    
    Metodos_Sql metodo = new Metodos_Sql();

    /**
     * Creates new form Registro_Factura
     */
    public Registro_Factura() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);  
        jComboBox1.removeAllItems();
        metodos_cargarcombobox.clave_ID_factura(jLabel2);
        metodos_cargarcombobox.consulta_ID_CLIENTE(jComboBox1);
        jLabel5.setEnabled(false);
        mostrartabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    //GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Id_Factura");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Id_Cliente");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 102, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
            new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Fecha");

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 51, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Seleccionar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                                GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                                GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.
                                    GroupLayout.DEFAULT_SIZE, javax.swing.
                                    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, 180, Short.MAX_VALUE)
                                    .addComponent(jDateChooser2, javax.swing.
                                    GroupLayout.DEFAULT_SIZE, javax.swing.
                                    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 64, javax.swing.
                        GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.
                            GroupLayout.PREFERRED_SIZE, 25, javax.swing.
                            GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 31, javax.swing.
                        GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser2, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.
                    GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.
                ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.
                GroupLayout.PREFERRED_SIZE, 184, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.
        GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.
            GroupLayout.Alignment.TRAILING, 
            layout.createSequentialGroup()
                .addContainerGap(javax.swing.
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       Sistema_Adm ventana = new Sistema_Adm();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    void mostrartabla() throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id Factura");
        modelo.addColumn("Id Cliente");
        modelo.addColumn("Fecha");
        tabladatos.setModel(modelo);

        String sql = "SELECT * FROM FACTURA";
        String datos[] = new String[3];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            tabladatos.setModel(modelo);
        } catch (Exception ex) {
            Logger.getLogger(Registro_Factura.class.getName()).
            log(Level.SEVERE, null, ex);
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String dia = Integer.toString(jDateChooser2.getCalendar().
        get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jDateChooser2.getCalendar().
        get(Calendar.MONTH)+1);
        String year = Integer.toString(jDateChooser2.getCalendar().
        get(Calendar.YEAR));
        String fecha=(year+"-"+mes+"-"+dia);
        jLabel5.setText(fecha);
        
       try {
            int i= metodo.guardar_FACTURA(
                Integer.valueOf(jLabel2.getText()),
                jComboBox1.getSelectedIndex(),jLabel5.getText());
            if (i>0){
                JOptionPane.showMessageDialog(this, 
                "Datos Guardados Correctamente");
                metodos_cargarcombobox.clave_ID_factura(jLabel2);
                mostrartabla();
            }else{
                JOptionPane.showMessageDialog(this,
                 "No se pudo guardar los datos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).
            log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
void limpiar(){
    jComboBox1.setSelectedIndex(0);
   jDateChooser2.setDateFormatString("");
   metodos_cargarcombobox.clave_ID_factura(jLabel2);
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            int i = metodo.actualizar_R_Factura(
                jComboBox1.getSelectedIndex(),
                jLabel5.getText(),
                Integer.valueOf(jLabel2.getText()));
            if (i > 0) {

                JOptionPane.showMessageDialog(this,
                 "Datos Actualizados Correctamente");
                metodos_cargarcombobox.clave_ID_factura(jLabel2);
                con.conectar();
                mostrartabla();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this,
                 "No se pudo Actualizar los datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro_Factura.class.getName()).
            log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_jButton4ActionPerformed
            // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         try {
           int i= metodo.eliminar_factura(
               Integer.valueOf(jLabel2.getText()));

            if (i > 0) {
                
                JOptionPane.showMessageDialog(this,
                 "Datos Eliminados Correctamente");
                metodos_cargarcombobox.clave_ID_factura(jLabel2);
                con.conectar();
                limpiar();
                mostrartabla();
            } else {
                JOptionPane.showMessageDialog(this,
                 "No se pudo eliminar los datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registro_Factura.class.getName()).
            log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         int fila = tabladatos.getSelectedRow();
        if (fila > 0) {
            jLabel2.setText(tabladatos.getValueAt(fila, 0).toString());
            jComboBox1.setSelectedItem(tabladatos.getValueAt(fila, 1).toString());
            jDateChooser2.setDateFormatString(tabladatos.getValueAt(fila, 2).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" 
        //Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available,
         stay with the default look and feel.
         * For details see
          http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
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
            java.util.logging.Logger.getLogger(Registro_Factura.class.
            getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Factura.class.
            getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Factura.class.
            getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Factura.class.
            getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registro_Factura().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Registro_Factura.class.getName()).
                    log(Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
