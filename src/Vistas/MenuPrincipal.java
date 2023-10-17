/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author manuv
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmInquilinos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmiPropiedades = new javax.swing.JMenu();
        jMenuItemPropiedades = new javax.swing.JMenuItem();
        jmInmobiliaria = new javax.swing.JMenu();
        jmiDatosEmpleados = new javax.swing.JMenuItem();
        jmiDatosPropietarios = new javax.swing.JMenuItem();
        jmiDatosInquilinos = new javax.swing.JMenuItem();
        jmiDatosPropiedades = new javax.swing.JMenuItem();
        jmiDatoZonas = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1162, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jmInquilinos.setText("Inquilinos");

        jMenuItem1.setText("Ver Propiedades");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmInquilinos.add(jMenuItem1);

        jMenuItem2.setText("Ver Contrato");
        jmInquilinos.add(jMenuItem2);

        jMenuBar1.add(jmInquilinos);

        jmiPropiedades.setText("Propiedades");

        jMenuItemPropiedades.setText("Gestión Propiedades");
        jMenuItemPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPropiedadesActionPerformed(evt);
            }
        });
        jmiPropiedades.add(jMenuItemPropiedades);

        jMenuBar1.add(jmiPropiedades);

        jmInmobiliaria.setText("Inmobiliaria");

        jmiDatosEmpleados.setText("Datos de empleados");
        jmiDatosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDatosEmpleadosActionPerformed(evt);
            }
        });
        jmInmobiliaria.add(jmiDatosEmpleados);

        jmiDatosPropietarios.setText("Datos de Propietarios");
        jmiDatosPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDatosPropietariosActionPerformed(evt);
            }
        });
        jmInmobiliaria.add(jmiDatosPropietarios);

        jmiDatosInquilinos.setText("Datos de Inquilinos");
        jmiDatosInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDatosInquilinosActionPerformed(evt);
            }
        });
        jmInmobiliaria.add(jmiDatosInquilinos);

        jmiDatosPropiedades.setText("Datos de Propiedades");
        jmInmobiliaria.add(jmiDatosPropiedades);

        jmiDatoZonas.setText("Datos de Zonas");
        jmInmobiliaria.add(jmiDatoZonas);

        jMenuBar1.add(jmInmobiliaria);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPropiedadesActionPerformed
        // Este procedimiento abre la gestión de las propiedades
        escritorio.removeAll();
        escritorio.repaint();
        VistaPropiedades vistaProp=new VistaPropiedades();
        vistaProp.setVisible(true);
        escritorio.add(vistaProp);
    }//GEN-LAST:event_jMenuItemPropiedadesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmiDatosPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDatosPropietariosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionPropietarios gp = new GestionPropietarios();
        gp.setVisible(true);
        escritorio.add(gp);
    }//GEN-LAST:event_jmiDatosPropietariosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        PropiedadesInquilinos gp = new PropiedadesInquilinos();
        gp.setVisible(true);
        escritorio.add(gp);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmiDatosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDatosEmpleadosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        DatosEmpleados de = new DatosEmpleados();
        de.setVisible(true);
        escritorio.add(de);
    }//GEN-LAST:event_jmiDatosEmpleadosActionPerformed

    private void jmiDatosInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDatosInquilinosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        GestionInquilinos GI = new GestionInquilinos();
        GI.setVisible(true);
        escritorio.add(GI);
    }//GEN-LAST:event_jmiDatosInquilinosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemPropiedades;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenu jmInmobiliaria;
    private javax.swing.JMenu jmInquilinos;
    private javax.swing.JMenuItem jmiDatoZonas;
    private javax.swing.JMenuItem jmiDatosEmpleados;
    private javax.swing.JMenuItem jmiDatosInquilinos;
    private javax.swing.JMenuItem jmiDatosPropiedades;
    private javax.swing.JMenuItem jmiDatosPropietarios;
    private javax.swing.JMenu jmiPropiedades;
    // End of variables declaration//GEN-END:variables
}
