/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.ContratoAlquilerData;
import AccesoDatos.EstadoContratoData;
import AccesoDatos.InquilinoData;
import AccesoDatos.PropiedadData;
import AccesoDatos.VendedorData;
import Entidades.ContratoAlquiler;
import Entidades.EstadoContrato;
import Entidades.Inquilino;
import Entidades.PropiedadInmueble;
import Entidades.Vendedor;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kalema
 */
public class ContratoAlquilerID extends javax.swing.JFrame {

    private PropiedadInmueble laProp =  null;
    private PropiedadData abmPropiedadData = new PropiedadData();
    private Inquilino elInquilino = null;
    private InquilinoData abmInquilino = new InquilinoData();
    private Vendedor elVendedor =null;
    private VendedorData abmVendData = new VendedorData();
    private EstadoContrato estadocontrado = null;
    private EstadoContratoData abmEstadoContrato = new EstadoContratoData();
    private ContratoAlquiler elContrato = null;
    private ContratoAlquilerData abmContratoAlquiler = new ContratoAlquilerData();
    private List<Inquilino> listaInquilino = new ArrayList();
    private List<Vendedor> listaVend = new ArrayList();
    private List<EstadoContrato> listaEstadoContrato = new ArrayList();
    private DefaultComboBoxModel modeloCB = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelocbVend = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelocbEstado = new DefaultComboBoxModel();
    public int valorId=PropiedadesInquilinos.valorIdProp;
    //public int valorId=5;
    
    /**
     * Creates new form ContratoAlquiler
     */
    public ContratoAlquilerID() {
        initComponents();
        traigoPropiedad();
        asignoDatos();
        camposInicial();
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

        jPanel1 = new javax.swing.JPanel();
        jEtiquetaIdPropiedad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jFechaRealizado = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jcbVendedor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcbComboEstado = new javax.swing.JComboBox<>();
        jbtContratar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jcbNombreInquilino = new javax.swing.JComboBox<>();
        jtTipoLocal = new javax.swing.JTextField();
        jEtiquetaFechaInicio = new javax.swing.JLabel();
        jEtiquetaFechaFinal = new javax.swing.JLabel();
        jEtiquetaFechaRealizado = new javax.swing.JLabel();
        jFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 226, 235));

        jLabel2.setText("Tipo Local");

        jLabel3.setText("Fecha Inicio");

        jLabel4.setText("Fecha Final");

        jFechaFin.setDateFormatString("yyyy-MM-dd");

        jLabel5.setText("Realizado");

        jFechaRealizado.setDateFormatString("yyyy-MM-dd");

        jLabel6.setText("Vendedor");

        jcbVendedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbVendedorFocusGained(evt);
            }
        });
        jcbVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVendedorActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado");

        jcbComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbComboEstadoActionPerformed(evt);
            }
        });

        jbtContratar.setText("Contratar");
        jbtContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtContratarActionPerformed(evt);
            }
        });

        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jtTipoLocal.setFocusable(false);

        jFechaInicio.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEtiquetaIdPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addComponent(jcbNombreInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jEtiquetaFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtTipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcbComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtContratar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtCancelar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jEtiquetaFechaRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFechaRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jEtiquetaFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jcbNombreInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtTipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jEtiquetaIdPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jFechaRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEtiquetaFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEtiquetaFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEtiquetaFechaRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jcbComboEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtContratar)
                    .addComponent(jbtCancelar))
                .addGap(36, 36, 36))
        );

        jLabel1.setText("CONTRATAR ALQUILER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbVendedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbVendedorFocusGained
        // Chequeo que las fechas esten completas
       if(jFechaInicio.getCalendar()!=null && jFechaFin.getCalendar()!=null && jFechaRealizado.getCalendar()!=null){
           jEtiquetaFechaInicio.setText("");
           jEtiquetaFechaFinal.setText("");
           jEtiquetaFechaRealizado.setText("");
       } else {
           if(jFechaInicio.getCalendar()==null){
               jEtiquetaFechaInicio.setText("Completar las fechas");
               jEtiquetaFechaInicio.setFont(new Font("Liberation Sans",Font.PLAIN,13));
               jEtiquetaFechaInicio.setForeground(Color.red.darker());
               jFechaInicio.requestFocus();
           } else if(jFechaFin.getCalendar()==null){
               jEtiquetaFechaFinal.setText("Completar las fechas");
               jEtiquetaFechaFinal.setFont(new Font("Liberation Sans",Font.PLAIN,13));
               jEtiquetaFechaFinal.setForeground(Color.red.darker());
               jFechaFin.requestFocus();
           } else if(jFechaRealizado.getCalendar()==null){
               jEtiquetaFechaRealizado.setText("Completar las fechas");
               jEtiquetaFechaRealizado.setFont(new Font("Liberation Sans",Font.PLAIN,13));
               jEtiquetaFechaRealizado.setForeground(Color.red.darker());
               jEtiquetaFechaRealizado.requestFocus();
           }
       }
    }//GEN-LAST:event_jcbVendedorFocusGained

    private void jcbComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbComboEstadoActionPerformed
        // TODO add your handling code here:
        if(jcbComboEstado.getSelectedIndex() > 0){
            jbtContratar.setEnabled(true);
        } else {
            jbtContratar.setEnabled(false);
        }
    }//GEN-LAST:event_jcbComboEstadoActionPerformed

    private void jcbVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVendedorActionPerformed
        // TODO add your handling code here:
        if(jcbVendedor.getSelectedIndex() > 0){
            jcbComboEstado.setEnabled(true);
        }else{
            if(jbtContratar.isEnabled()){
                jbtContratar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jcbVendedorActionPerformed

    private void jbtContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtContratarActionPerformed
        // Chequeo los datos y si todo está ok guardo el contrato
        // Contruyo las fechas
        Date fInicio = jFechaInicio.getDate();
        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        String castInicio = formatofecha.format(fInicio);
        LocalDate inicialF = LocalDate.parse(castInicio); 
        Date fFinal = jFechaFin.getDate();
        String castfinal = formatofecha.format(fFinal);
        LocalDate finalF = LocalDate.parse(castfinal);
        Date fRealizado = jFechaRealizado.getDate();
        String finalRealizado = formatofecha.format(fRealizado);
        LocalDate finalR = LocalDate.parse(finalRealizado);
        if(inicialF.isAfter(finalF)){
            JOptionPane.showMessageDialog(this, "La fecha inicial no puede ser posterior a la fecha final");
            jFechaInicio.requestFocus();
        } else if(finalF.isAfter(finalR)){
                JOptionPane.showMessageDialog(this, "La fecha de Realización no puede ser anterior a la fecha final");
                jFechaRealizado.requestFocus();
            } else {
                //Armo el Contrato Alquiler para mandarlo a la base
                //Construyo los objetos para el contrato
                laProp = abmPropiedadData.buscarPropiedadPorId(Integer.parseInt(jEtiquetaIdPropiedad.getText()));
                elInquilino = abmInquilino.buscoInquilino(jcbNombreInquilino.getSelectedIndex() + 1);
                elVendedor = abmVendData.buscoVendedor(jcbVendedor.getSelectedIndex() + 1);
                estadocontrado = abmEstadoContrato.BuscarEstadoContratoPorId(jcbComboEstado.getSelectedIndex() + 1);
                elContrato = new ContratoAlquiler();
                elContrato.setInquilino(elInquilino);
                elContrato.setPropiedadInmueble(laProp);
                elContrato.setFechaInicio(inicialF);
                elContrato.setFechaFinal(finalF);
                elContrato.setFechaRealizacion(finalR);
                elContrato.getMarca();
                elContrato.setVendedor(elVendedor);
                elContrato.setEstado(estadocontrado);
                abmContratoAlquiler.agregarContrato(elContrato);
                this.setVisible(false);
            }
    }//GEN-LAST:event_jbtContratarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbtCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ContratoAlquilerID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratoAlquilerID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratoAlquilerID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratoAlquilerID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContratoAlquilerID().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jEtiquetaFechaFinal;
    private javax.swing.JLabel jEtiquetaFechaInicio;
    private javax.swing.JLabel jEtiquetaFechaRealizado;
    private javax.swing.JLabel jEtiquetaIdPropiedad;
    private com.toedter.calendar.JDateChooser jFechaFin;
    private com.toedter.calendar.JDateChooser jFechaInicio;
    private com.toedter.calendar.JDateChooser jFechaRealizado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtContratar;
    private javax.swing.JComboBox<String> jcbComboEstado;
    private javax.swing.JComboBox<String> jcbNombreInquilino;
    private javax.swing.JComboBox<String> jcbVendedor;
    private javax.swing.JTextField jtTipoLocal;
    // End of variables declaration//GEN-END:variables
    
    
    public void traigoPropiedad(){
        laProp = abmPropiedadData.buscarPropiedadPorId(valorId);
    }
    
    public void asignoDatos(){
        jEtiquetaIdPropiedad.setText(String.valueOf(laProp.getIdPropiedadInmueble()));
        listaInquilino = abmInquilino.listarInquilino();
        for (Inquilino inquilino : listaInquilino) {
            modeloCB.addElement(inquilino.otraForma());
        }
        jcbNombreInquilino.setModel(modeloCB);
        jtTipoLocal.setText(laProp.getTipoLocal().getNombre());
        jtTipoLocal.setEnabled(false);
        listaVend = abmVendData.listadoVendedor();
        for (Vendedor vendedor : listaVend) {
            modelocbVend.addElement(vendedor.toString());
        }
        jcbVendedor.setModel(modelocbVend);
        listaEstadoContrato = abmEstadoContrato.listarEstadoContratos();
        for (EstadoContrato estadoContrato : listaEstadoContrato) {
            modelocbEstado.addElement(estadoContrato.getNombre());
        }
        jcbComboEstado.setModel(modelocbEstado);
    }
    
    private void camposInicial(){
        //jFechaFin.setEnabled(false);
        //jFechaRealizado.setEnabled(false);
        //jcbVendedor.setEnabled(false);
        jcbComboEstado.setEnabled(false);
        jbtContratar.setEnabled(false);
    }
    
}
