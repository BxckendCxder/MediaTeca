package MediaTeca.GUI;

import SqlOps.ComandosDeAcceso;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MTRegistro extends javax.swing.JFrame {
    public MTRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSubTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword2 = new javax.swing.JLabel();
        txtPassword2 = new javax.swing.JPasswordField();
        lblIniciarSesion = new javax.swing.JLabel();
        boxMostrar = new javax.swing.JCheckBox();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        lblErrorUsuario = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblEstadoDB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTitulo.setText("Software MediaTeca");

        lblSubTitulo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblSubTitulo.setText("Proceso de registro");

        lblUsuario.setText("Usuario: ");

        txtUsuario.setToolTipText("");
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblPassword.setText("Contraseña:");

        lblPassword2.setText("Repita la contraseña:");

        lblIniciarSesion.setText("Si yá está registrado:");

        boxMostrar.setText("Mostrar");
        boxMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMostrarActionPerformed(evt);
            }
        });

        btnIniciarSesion.setText("Registrarse");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnRegistrarse.setText("Iniciar Sesión");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        lblErrorUsuario.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblErrorUsuario.setForeground(new java.awt.Color(222, 0, 0));
        lblErrorUsuario.setText(" ");

        lblErrorPassword.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(222, 0, 0));
        lblErrorPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorPassword.setText(" ");

        lblEstadoDB.setForeground(new java.awt.Color(0, 0, 222));
        lblEstadoDB.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnIniciarSesion)
                    .addComponent(lblSubTitulo)
                    .addComponent(lblTitulo)
                    .addComponent(lblErrorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoDB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarse)
                    .addComponent(lblIniciarSesion)
                    .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxMostrar)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorUsuario)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxMostrar)
                        .addComponent(txtPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstadoDB)
                .addGap(14, 14, 14)
                .addComponent(lblIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void boxMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMostrarActionPerformed
        // metodo para ocultar o mostrar password)
        if (boxMostrar.isSelected()) {
            txtPassword.setEchoChar((char)0);
            txtPassword2.setEchoChar((char)0);
        }else{
            txtPassword.setEchoChar('*');
            txtPassword2.setEchoChar('*');
        }
    }//GEN-LAST:event_boxMostrarActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        dispose();
        MTLogin.main(null);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // Comprobamos campos de entrada de credenciales
        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();
        String password2 = txtPassword2.getText();
        
        if(usuario.equals("")){
            lblErrorUsuario.setText("Este campo no puede estar vacio");
        }else{lblErrorUsuario.setText("");}
        if(password.equals("") || password2.equals("")){
            lblErrorPassword.setText("Estos campos no pueden estar vacios");
        }else{lblErrorPassword.setText("");}
        
        if(!usuario.equals("") && !password.equals("") && !password2.equals("") && password.equals(password2)){
            ComandosDeAcceso chkuser = new ComandosDeAcceso();
            lblErrorPassword.setText("");
            if(!chkuser.chkUser(usuario)){
                ComandosDeAcceso comando = new ComandosDeAcceso();
                comando.insertUser(usuario, password);
                dispose();
                JOptionPane.showMessageDialog(null, "Usuario creado satisfactoriamente, ahora inicie sesión");
                MTLogin.main(null);
            }else{
                lblErrorUsuario.setText("Este usuario ya existe");
            }
        }else if(!password.equals("") && !password2.equals("")){
            if(!password.equals(password2)){
                lblErrorPassword.setText("Las contraseñas no coinciden");
            }else{lblErrorPassword.setText("");}
            
        }
        
        
        
        
        //Ya pasada la verificación, tenemos que comprobar la existencia de el usuario en la DB
//        if(!usuario.equals("") && !password.equals("")){ 
//            ComandosDeAcceso validacion = new ComandosDeAcceso();
//            if (validacion.login(usuario, password)) {
//                lblEstadoDB.setText("Acceso autorizado");
//                dispose();
//                MenuPpal.menuPpal();
//            } else {
//                lblEstadoDB.setText("Credenciales inválidas");
//            }
//        }else{lblEstadoDB.setText("");}
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
    

    public static void registro() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MTRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MTRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MTRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MTRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MTRegistro().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxMostrar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorUsuario;
    private javax.swing.JLabel lblEstadoDB;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword2;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
