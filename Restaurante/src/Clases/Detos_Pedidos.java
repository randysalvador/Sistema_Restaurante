package Clases;

import Conexiones.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author randy
 */
public class Detos_Pedidos extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conectar2();

    /**
     * Creates new form Detos_Pedidos
     * @throws java.sql.SQLException
     */
    public Detos_Pedidos() throws SQLException {
        super("Datos de los Pedidos");
        initComponents();
        mostrartabla();
        setLocationRelativeTo(null);
        this.repaint();
        setExtendedState(MAXIMIZED_BOTH);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Datos de los Pedidos");

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.
        GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.
                    GroupLayout.PREFERRED_SIZE, 624, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.
                GroupLayout.PREFERRED_SIZE, 220, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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
        modelo.addColumn("Id_Pedido");
        modelo.addColumn("Id_Persona");
        modelo.addColumn("Id_Plato");
        modelo.addColumn("Id_Mesa");
        modelo.addColumn("Precio_Total");
        tabladatos.setModel(modelo);

        String sql = "select P.ID_PEDIDO AS Clave_Pedido, PER.NOMBRE AS NOMBRE, "
                + "PLA.NOM_PLATO AS PLATO, M.NUM_MESA as Num, P.PRECIO_TOTAL\n"
                + "from PEDIDOS as P, PERSONA as PER, PLATOS AS PLA, MESA as M\n"
                + "where P.ID_PERSONA=PER.ID_PERSONA AND P.ID_PLATO=PLA.ID_PLATO "
                + "and P.ID_MESA=M.ID_MESA";
        String datos[] = new String[5];
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
                modelo.addRow(datos);
            }
            tabladatos.setModel(modelo);
        } catch (Exception ex) {
            Logger.getLogger(Datos_Clientes.class.getName()).
            log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(Detos_Pedidos.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detos_Pedidos.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detos_Pedidos.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detos_Pedidos.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Detos_Pedidos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Detos_Pedidos.class.getName()).
                    log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
