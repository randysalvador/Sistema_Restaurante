package Clases;

import Conexiones.Metodos_Sql;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * @author randy
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Login() {
        super("Inicio de Sesión");
        initComponents();
        this.getContentPane().setBackground(getBackground());
        setLocationRelativeTo(null);
        ImageIcon imagen1 = new ImageIcon(getClass().
        getResource("/Imagenes/usuarios.png"));
        
        Icon fondo1=new ImageIcon(imagen1.getImage().
        getScaledInstance(jLabel4.getWidth(),
        jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(fondo1);
        this.repaint();
    }
    Metodos_Sql metodos=new Metodos_Sql();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.
        GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrarse");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.
        GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Contraseña");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Usuario");

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.
                                            GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                     jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.
                            GroupLayout.DEFAULT_SIZE, javax.swing.
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.
                        ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                        GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.
                            GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel4, javax.swing.
                GroupLayout.PREFERRED_SIZE, 146, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.
                GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.
                    GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.
                    GroupLayout.Alignment.TRAILING, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.
                    GroupLayout.PREFERRED_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.
        GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.
            GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
            layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.
                    GroupLayout.DEFAULT_SIZE, javax.swing.
                    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.
                GroupLayout.PREFERRED_SIZE, javax.swing.
                GroupLayout.DEFAULT_SIZE, javax.swing.
                GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*Conexiones.Conexion.getConexion();
        System.out.println("La conexion CORRECTA!");
        reserva obj= new reserva();
        obj.setVisible(true);*/
        
        
        /*if(Conexiones.Conexion.getstatus()){
            reserva obj= new reserva();
        obj.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null,
             "LOGIN & PASSWORD SON INCORRECTOS","Error de Conexión",
             JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
            jPasswordField1.setText("");
            jTextField1.requestFocus();
        } */
        String busqueda_usuario = metodos.
        buscarUsuarioRegistrado(jTextField1.getText(), jPasswordField1.getText());

        if (jTextField1.getText().equals("admin") &&
             jPasswordField1.getText().equals("1809")) {
            JOptionPane.showMessageDialog(this, 
            "Bienvenido iniciaste sesion como Root (Administrador)");
            Sistema_Adm ventana = new Sistema_Adm();
            ventana.jLabel3.setText("Administrador");
            ventana.setVisible(true);
            this.dispose();

        }else if (jTextField1.getText().equals("cajero") && 
            jPasswordField1.getText().equals("cajero")) {
            JOptionPane.showMessageDialog(this, 
            "Bienvenido iniciaste sesion como Cajero.");
            Sistema_Cajeros ventana = new Sistema_Cajeros();
            ventana.jLabel3.setText("Cajero");
            ventana.setVisible(true);
            this.dispose();

        }else if (busqueda_usuario.equals("usuario encontrado")) {
            String busqueda_nombre = metodos.buscarNombre(jTextField1.getText());
            String busca_usuario=metodos.buscarNombre(jTextField1.getText());
            String clave_cliente = metodos.buscar_usuario_paraclave(busca_usuario);
            JOptionPane.showMessageDialog(this,
             "Bienvenido(a) \n" + busqueda_nombre);
            Sistema_Cliente ventana = new Sistema_Cliente();
            ventana.jLabel3.setText(busqueda_nombre);
            ventana.jLabel8.setText(clave_cliente);
            ventana.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this,
             "Usuario No registrado, Favor de Darse de Alta");
        }   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        jTextField1.requestFocus();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {
//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
       /* if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Conexiones.Conexion.setcuenta(jTextField1.getText(),
             jPasswordField1.getText());
            Conexiones.Conexion.getConexion();
            if(Conexiones.Conexion.getstatus()){
                reserva obj= new reserva();
                obj.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null,
                 "LOGIN & PASSWORD SON INCORRECTOS","Error de Conexión",
                 JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
                jPasswordField1.setText("");
                jTextField1.requestFocus();
            }
        }*/
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Registro registro = null;
        try {
            registro = new Registro();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc="
        // Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) 
        is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(Login.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).
            log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}