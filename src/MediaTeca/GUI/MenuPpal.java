package MediaTeca.GUI;

import MediaTeca.GUI.InsertarDatos.*;
import MediaTeca.GUI.buscar.*;
import MediaTeca.GUI.modificarDatos.*;
import MediaTeca.GUI.mostrarDatos.*;
import datos.CdDAO;
import datos.DvdDAO;
import datos.LibroDAO;
import datos.RevistaDAO;

import javax.swing.JOptionPane;

public class MenuPpal extends javax.swing.JFrame {

    int codigoint = 0;

    /**
     * Creates new form MenuPpal
     */
    public MenuPpal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSubTitulo = new javax.swing.JLabel();
        lblAgregarMateriales = new javax.swing.JLabel();
        btnAgregarLib = new javax.swing.JButton();
        btnAgregarRev = new javax.swing.JButton();
        btnAgregarCd = new javax.swing.JButton();
        btnAgregarDvd = new javax.swing.JButton();
        lblMostrarMateriales = new javax.swing.JLabel();
        btnMostrarLib = new javax.swing.JButton();
        btnMostrarRev = new javax.swing.JButton();
        btnMostrarCd = new javax.swing.JButton();
        btnMostrarDvd = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Software MediaTeca");

        lblSubTitulo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitulo.setText("Menú de opciones");
        lblSubTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAgregarMateriales.setText("Agregar materiales");

        btnAgregarLib.setText("Libros");
        btnAgregarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibActionPerformed(evt);
            }
        });

        btnAgregarRev.setText("Revistas");
        btnAgregarRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRevActionPerformed(evt);
            }
        });

        btnAgregarCd.setText("CD audio");
        btnAgregarCd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCdActionPerformed(evt);
            }
        });

        btnAgregarDvd.setText("DVD");
        btnAgregarDvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDvdActionPerformed(evt);
            }
        });

        lblMostrarMateriales.setText("Mostrar materiales");

        btnMostrarLib.setText("Libros");
        btnMostrarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLibActionPerformed(evt);
            }
        });

        btnMostrarRev.setText("Revistas");
        btnMostrarRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRevActionPerformed(evt);
            }
        });

        btnMostrarCd.setText("CD audio");
        btnMostrarCd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCdActionPerformed(evt);
            }
        });

        btnMostrarDvd.setText("DVD");
        btnMostrarDvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDvdActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar Material");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar Material");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar Material");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostrarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarRev, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarCd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarDvd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMostrarMateriales)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarLib, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarRev, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarCd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarDvd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAgregarMateriales)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblAgregarMateriales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarLib)
                    .addComponent(btnAgregarRev)
                    .addComponent(btnAgregarCd)
                    .addComponent(btnAgregarDvd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMostrarMateriales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarLib)
                    .addComponent(btnMostrarRev)
                    .addComponent(btnMostrarCd)
                    .addComponent(btnMostrarDvd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLibActionPerformed
        // TODO add your handling code here:
        TablaMostrarLib.tablaLibro();
    }//GEN-LAST:event_btnMostrarLibActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        try {
            String codigoComp = JOptionPane.showInputDialog("Borrar material\nIngrese el código con prefijo");
            String codigo = "";
            int codigoint = 0;
            if (codigoComp.contains("LIB")) {
                LibroDAO libroDao = new LibroDAO();
                codigo = codigoComp.replace("LIB", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                try {
                    libroDao.borrar(codigoint);
                    JOptionPane.showMessageDialog(null, "Material eliminado correctamente");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            if (codigoComp.contains("REV")) {
                RevistaDAO revistaDao = new RevistaDAO();
                codigo = codigoComp.replace("REV", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                revistaDao.borrar(codigoint);//
                try {
                    revistaDao.borrar(codigoint);
                    JOptionPane.showMessageDialog(null, "Material eliminado correctamente");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            if (codigoComp.contains("CDA")) {
                CdDAO cdDao = new CdDAO();
                codigo = codigoComp.replace("CDA", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                cdDao.borrar(codigoint);//
                try {
                    cdDao.borrar(codigoint);
                    JOptionPane.showMessageDialog(null, "Material eliminado correctamente");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            if (codigoComp.contains("DVD")) {
                DvdDAO dvdDao = new DvdDAO();
                codigo = codigoComp.replace("DVD", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                dvdDao.borrar(codigoint);//
                try {
                    dvdDao.borrar(codigoint);
                    JOptionPane.showMessageDialog(null, "Material eliminado correctamente");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            if(codigoComp.equals("")){
                JOptionPane.showMessageDialog(null, "El campo no puede estár vacio");
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            String codigoComp = JOptionPane.showInputDialog("Buscar material\nIngrese el código con prefijo");
            String codigo = "";
            int codigoint = 0;
            if (codigoComp.contains("LIB")) {
                codigo = codigoComp.replace("LIB", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                BuscarLib.buscarLibro(codigoint);
            }
            if (codigoComp.contains("REV")) {
                codigo = codigoComp.replace("REV", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                BuscarRev.buscarRev(codigoint);
            }
            if (codigoComp.contains("CDA")) {
                codigo = codigoComp.replace("CDA", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                BuscarCd.buscarCd(codigoint);
            }
            if (codigoComp.contains("DVD")) {
                codigo = codigoComp.replace("DVD", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                BuscarDvd.buscarDvd(codigoint);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRevActionPerformed
        // TODO add your handling code here:
        TablaMostrarRev.tablaRevista();
    }//GEN-LAST:event_btnMostrarRevActionPerformed

    private void btnMostrarCdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCdActionPerformed
        // TODO add your handling code here:
        TablaMostrarCd.tablaCd();
    }//GEN-LAST:event_btnMostrarCdActionPerformed

    private void btnMostrarDvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDvdActionPerformed
        // TODO add your handling code here:
        TablaMostrarDvd.tablaDvd();
    }//GEN-LAST:event_btnMostrarDvdActionPerformed

    private void btnAgregarDvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDvdActionPerformed
        // TODO add your handling code here:
        InsertarDvd.insertarDvd();
    }//GEN-LAST:event_btnAgregarDvdActionPerformed

    private void btnAgregarCdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCdActionPerformed
        // TODO add your handling code here:
        InsertarCd.insertarCd();
    }//GEN-LAST:event_btnAgregarCdActionPerformed

    private void btnAgregarRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRevActionPerformed
        // TODO add your handling code here:
        InsertarRevista.insertarRevista();
    }//GEN-LAST:event_btnAgregarRevActionPerformed

    private void btnAgregarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibActionPerformed
        // TODO add your handling code here:
        InsertarLibro.insertarLibro();
    }//GEN-LAST:event_btnAgregarLibActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            String codigoComp = JOptionPane.showInputDialog("Buscar material\nIngrese el código con prefijo");
            String codigo = "";
            int codigoint = 0;
            if (codigoComp.contains("LIB")) {
                codigo = codigoComp.replace("LIB", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                ModificarLib.modificarLib(codigoint);
                
            }
            if (codigoComp.contains("REV")) {
                codigo = codigoComp.replace("REV", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                ModificarRev.actualizarRev(codigoint);
                
            }
            if (codigoComp.contains("CDA")) {
                codigo = codigoComp.replace("CDA", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                ModificarCd.actualizarCd(codigoint);
                
            }
            if (codigoComp.contains("DVD")) {
                codigo = codigoComp.replace("DVD", "");
                codigo = codigo.replaceAll("\\D", "");
                codigoint = Integer.parseInt(codigo);
                ModificarDvd.actualizarDvd(codigoint);
                
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void menuPpal() {
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
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCd;
    private javax.swing.JButton btnAgregarDvd;
    private javax.swing.JButton btnAgregarLib;
    private javax.swing.JButton btnAgregarRev;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarCd;
    private javax.swing.JButton btnMostrarDvd;
    private javax.swing.JButton btnMostrarLib;
    private javax.swing.JButton btnMostrarRev;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblAgregarMateriales;
    private javax.swing.JLabel lblMostrarMateriales;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
