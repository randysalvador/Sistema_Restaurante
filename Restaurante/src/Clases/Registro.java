package Clases;

import Conexiones.Cargar_Combobox;
import Conexiones.Conexion;
import Conexiones.Metodos_Sql;
import static Conexiones.Metodos_Sql.resultado;
import static Conexiones.Metodos_Sql.sentencia_preparada;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 * @author Randy Angel Salvador Bautista.
*/
public class Registro extends javax.swing.JFrame {
    Cargar_Combobox metodos_cargarcombobox = new Cargar_Combobox();
    Metodos_Sql metodo =  new Metodos_Sql();
    Conexion con = new Conexion();
    Connection cn=con.conectar();
    /**
     * Creates new form Registro
     */
    
    public Registro() throws SQLException {
        initComponents();
        this.getContentPane().setBackground(getBackground());
        setLocationRelativeTo(null);
        metodos_cargarcombobox.clave_cliente(jLabel10);
        metodos_cargarcombobox.clave_persona(jLabel9);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        setExtendedState(MAXIMIZED_BOTH);
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Apellido Paterno");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Confirmar Contraseña");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Direccíon");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Apellido Materno");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Teléfono");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.
                        ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 101, javax.swing.
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jTextField2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 165, javax.swing.
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 165, javax.swing.
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 165, javax.swing.
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.
                        GroupLayout.PREFERRED_SIZE, 165, javax.swing.
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jButton2))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.
                            GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.
                                GroupLayout.PREFERRED_SIZE, 46, javax.swing.
                                GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.
                                GroupLayout.PREFERRED_SIZE, 42, javax.swing.
                                GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.
                                GroupLayout.PREFERRED_SIZE, 45, javax.swing.
                                GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.
                                GroupLayout.DEFAULT_SIZE, javax.swing.
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.
                    
                    GroupLayout.Alignment.TRAILING, 
                    jPanel2Layout.createParallelGroup(javax.swing.
                    GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel9, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel10, javax.swing.
                    GroupLayout.Alignment.TRAILING, javax.swing.
                    GroupLayout.PREFERRED_SIZE, 28, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordField2, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField4, javax.swing.
                            GroupLayout.PREFERRED_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.
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
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.
        GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel2, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jButton1ActionPerformed
        if(String.valueOf(jPasswordField1.getPassword()).
        equals(String.valueOf(jPasswordField2.getPassword()))){
            try {
                int i = metodo.guardar_persona(
                    Integer.valueOf(jLabel9.getText()),
                    jTextField1.getText(),jPasswordField1.getText(),
                    jTextField2.getText(),jTextField3.getText(),
                    jTextField4.getText(),jTextField5.getText(),
                    jTextField6.getText());
                
                if (i>0){
                    metodo.guardar_cliente(
                    Integer.valueOf(jLabel10.getText()),
                    Integer.valueOf(jLabel9.getText()));
                    JOptionPane.showMessageDialog(this, 
                    "Datos Guardados Correctamente");
                    String busqueda_nombre =
                     metodo.buscarNombre(jTextField1.getText());
                    
                    String busqueda_clave =
                     metodo.buscarClave_Cliente(jLabel10.getText());
                    JOptionPane.showMessageDialog(this, 
                    "Bienvenido(a) \n" + busqueda_nombre);
                    Sistema_Cliente ventana = new Sistema_Cliente();
                    ventana.jLabel3.setText(busqueda_nombre);
                    ventana.jLabel8.setText(busqueda_clave);
                    ventana.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, 
                    "No se pudo guardar los datos");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).
                log(Level.SEVERE, null, ex);
            }
        }else{
           JOptionPane.showMessageDialog(null,
            "Contraseña Incorrecta"); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login ventana= new Login();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc="
        // Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
