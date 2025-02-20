/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Susana
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
          this.getContentPane().setBackground(new Color ( 201, 228, 197));
          
              Image  icon = new ImageIcon(getClass().getResource("/img/iconohojas.png")).getImage();
              setIconImage(icon);
          
         ImageIcon hoja = new ImageIcon(getClass().getResource("/img/iconohojas.png"));
        ImageIcon icono = new ImageIcon(hoja.getImage().getScaledInstance(LabelLogo.getWidth(), LabelLogo.getHeight(), Image.SCALE_DEFAULT));
        LabelLogo.setIcon(icono);
        
         this.setResizable(false);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCerrarSesion = new java.awt.Button();
        LabelLogo = new javax.swing.JLabel();
        LabelMakoi = new javax.swing.JLabel();
        MenuBarPrincipal = new javax.swing.JMenuBar();
        MenuUsuario = new javax.swing.JMenu();
        MenuItemCrearUsuario = new javax.swing.JMenuItem();
        MenuItemBorrarUsuario = new javax.swing.JMenuItem();
        MenuProductos = new javax.swing.JMenu();
        MenuItemIngresarProductos = new javax.swing.JMenuItem();
        MenuItemBorrarProductos = new javax.swing.JMenuItem();
        MenuActualizarProducto = new javax.swing.JMenuItem();
        MenuItemVerProductos = new javax.swing.JMenuItem();
        MenuClientes = new javax.swing.JMenu();
        MenuItemAgregarCliente = new javax.swing.JMenuItem();
        MenuItemBorrarCliente = new javax.swing.JMenuItem();
        MenuItemActualizar = new javax.swing.JMenuItem();
        MenuItemVerClientes = new javax.swing.JMenuItem();
        MenuReportes = new javax.swing.JMenu();
        MenuItemRevisarStock = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Makoi");

        buttonCerrarSesion.setBackground(new java.awt.Color(153, 255, 0));
        buttonCerrarSesion.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        buttonCerrarSesion.setLabel("Cerrar sesión");
        buttonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarSesionActionPerformed(evt);
            }
        });

        LabelLogo.setText("logo");

        LabelMakoi.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        LabelMakoi.setText("MAKOI");

        MenuUsuario.setText("Usuario");
        MenuUsuario.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        MenuItemCrearUsuario.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuItemCrearUsuario.setText("Crear usuario");
        MenuItemCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCrearUsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(MenuItemCrearUsuario);

        MenuItemBorrarUsuario.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuItemBorrarUsuario.setText("Borrar usuario");
        MenuItemBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemBorrarUsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(MenuItemBorrarUsuario);

        MenuBarPrincipal.add(MenuUsuario);

        MenuProductos.setText("Productos");
        MenuProductos.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        MenuItemIngresarProductos.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuItemIngresarProductos.setText("Agregar");
        MenuItemIngresarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemIngresarProductosActionPerformed(evt);
            }
        });
        MenuProductos.add(MenuItemIngresarProductos);

        MenuItemBorrarProductos.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuItemBorrarProductos.setText("Borrar");
        MenuItemBorrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemBorrarProductosActionPerformed(evt);
            }
        });
        MenuProductos.add(MenuItemBorrarProductos);

        MenuActualizarProducto.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuActualizarProducto.setText("Actualizar");
        MenuActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActualizarProductoActionPerformed(evt);
            }
        });
        MenuProductos.add(MenuActualizarProducto);

        MenuItemVerProductos.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuItemVerProductos.setText("Ver Productos");
        MenuItemVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVerProductosActionPerformed(evt);
            }
        });
        MenuProductos.add(MenuItemVerProductos);

        MenuBarPrincipal.add(MenuProductos);

        MenuClientes.setText("Clientes");
        MenuClientes.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        MenuItemAgregarCliente.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuItemAgregarCliente.setText("Agregar ");
        MenuItemAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAgregarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuItemAgregarCliente);

        MenuItemBorrarCliente.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuItemBorrarCliente.setText("Borrar");
        MenuItemBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemBorrarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuItemBorrarCliente);

        MenuItemActualizar.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuItemActualizar.setText("Actualizar");
        MenuItemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemActualizarActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuItemActualizar);

        MenuItemVerClientes.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuItemVerClientes.setText("Ver clientes");
        MenuItemVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVerClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(MenuItemVerClientes);

        MenuBarPrincipal.add(MenuClientes);

        MenuReportes.setText("Reportes");
        MenuReportes.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N

        MenuItemRevisarStock.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        MenuItemRevisarStock.setText("Revisar stock");
        MenuItemRevisarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemRevisarStockActionPerformed(evt);
            }
        });
        MenuReportes.add(MenuItemRevisarStock);

        MenuBarPrincipal.add(MenuReportes);

        setJMenuBar(MenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addComponent(buttonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(LabelMakoi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(LabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelMakoi)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCrearUsuarioActionPerformed
        AgregarUsuario agregar = new AgregarUsuario();
        agregar.setVisible(true);
        this.dispose();
       
        
    }//GEN-LAST:event_MenuItemCrearUsuarioActionPerformed

    private void MenuItemBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBorrarUsuarioActionPerformed
        BorrarUsuario borrar = new BorrarUsuario();
        borrar.setVisible(true);
         this.dispose();
       
    }//GEN-LAST:event_MenuItemBorrarUsuarioActionPerformed

    private void MenuItemIngresarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemIngresarProductosActionPerformed
        AgregarProducto agregarpro = new AgregarProducto();
        agregarpro.setVisible(true);
       
    }//GEN-LAST:event_MenuItemIngresarProductosActionPerformed

    private void MenuItemBorrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBorrarProductosActionPerformed
        BorrarProducto borr = new BorrarProducto();
        borr.setVisible(true);
       
    }//GEN-LAST:event_MenuItemBorrarProductosActionPerformed

    private void MenuItemAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAgregarClienteActionPerformed
       AgregarCliente agregarcli = new AgregarCliente();
       agregarcli.setVisible(true);
     
    }//GEN-LAST:event_MenuItemAgregarClienteActionPerformed

    private void MenuItemBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemBorrarClienteActionPerformed
        BorrarCliente borrarcli = new BorrarCliente();
        borrarcli.setVisible(true);
       
    }//GEN-LAST:event_MenuItemBorrarClienteActionPerformed

    private void buttonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarSesionActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
        
        
        /* CONSULTAR COMO CERRAR PRINCIPAL AL VOLVER AL LOGIN */ 
        
    }//GEN-LAST:event_buttonCerrarSesionActionPerformed

    private void MenuActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActualizarProductoActionPerformed
        ActualizarProducto act = new ActualizarProducto();
        act.setVisible(true);
         
    }//GEN-LAST:event_MenuActualizarProductoActionPerformed

    private void MenuItemVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVerProductosActionPerformed
       VerProductos verp = new VerProductos();
       verp.setVisible(true);
     
        
       
    }//GEN-LAST:event_MenuItemVerProductosActionPerformed

    private void MenuItemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemActualizarActionPerformed
        ActualizarCliente ac = new ActualizarCliente();
        ac.setVisible(true);
        
    }//GEN-LAST:event_MenuItemActualizarActionPerformed

    private void MenuItemVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVerClientesActionPerformed
       VerClientes vercli = new VerClientes();
       vercli.setVisible(true);
      
    }//GEN-LAST:event_MenuItemVerClientesActionPerformed

    private void MenuItemRevisarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemRevisarStockActionPerformed
        RevisarStock rev = new RevisarStock();
        rev.setVisible(true);
    }//GEN-LAST:event_MenuItemRevisarStockActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelMakoi;
    private javax.swing.JMenuItem MenuActualizarProducto;
    private javax.swing.JMenuBar MenuBarPrincipal;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenuItem MenuItemActualizar;
    private javax.swing.JMenuItem MenuItemAgregarCliente;
    private javax.swing.JMenuItem MenuItemBorrarCliente;
    private javax.swing.JMenuItem MenuItemBorrarProductos;
    private javax.swing.JMenuItem MenuItemBorrarUsuario;
    private javax.swing.JMenuItem MenuItemCrearUsuario;
    private javax.swing.JMenuItem MenuItemIngresarProductos;
    private javax.swing.JMenuItem MenuItemRevisarStock;
    private javax.swing.JMenuItem MenuItemVerClientes;
    private javax.swing.JMenuItem MenuItemVerProductos;
    private javax.swing.JMenu MenuProductos;
    private javax.swing.JMenu MenuReportes;
    private javax.swing.JMenu MenuUsuario;
    private java.awt.Button buttonCerrarSesion;
    // End of variables declaration//GEN-END:variables
}
