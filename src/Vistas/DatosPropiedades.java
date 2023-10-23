/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.PropiedadData;
import AccesoDatos.TipoLocalData;
import AccesoDatos.ZonaData;
import Entidades.PropiedadInmueble;
import Entidades.TipoLocal;
import Entidades.Zona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abate
 */
public class DatosPropiedades extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    private DefaultComboBoxModel modelComboZona = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelComboTipoLocal = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelBusquedaXZona = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelBusquedazTipo = new DefaultComboBoxModel();
    
    ZonaData abmZona = new ZonaData();
    PropiedadData abmPropiedad = new PropiedadData();
    TipoLocalData abmTipoLocal = new TipoLocalData();
    
    Zona tempZona = null;
    TipoLocal tempTipoLocal = null;
    
    List<Zona> listaZonas = new ArrayList<>();
    List<TipoLocal> listaTipoLocal = new ArrayList();
    List<PropiedadInmueble> listaXZona = new ArrayList();
    List<PropiedadInmueble> listaxTipo = new ArrayList();
    
    public DatosPropiedades() {
        initComponents();
        borroFilas();
        armarTabla();
        camposIniciales();
        comboBusquedaPorZona();
        comboBusquedaPorTipo();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaPropiedades = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbZona = new javax.swing.JComboBox<>();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfValorZona = new javax.swing.JTextField();
        jtfValorTipo = new javax.swing.JTextField();
        jbActualizar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Actualizacion de Precios para Propiedades");

        jtTablaPropiedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTablaPropiedades);

        jLabel2.setText("Buscar por Zona:");

        jLabel3.setText("Buscar por Tipo:");

        jcbZona.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbZonaFocusGained(evt);
            }
        });
        jcbZona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbZonaMouseClicked(evt);
            }
        });
        jcbZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbZonaActionPerformed(evt);
            }
        });

        jcbTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbTipoMouseClicked(evt);
            }
        });
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });

        jLabel4.setText("Valor nuevo:");

        jLabel5.setText("Valor nuevo:");

        jtfValorZona.setEditable(false);

        jbActualizar.setText("Actualizar");

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbTipo, 0, 140, Short.MAX_VALUE)
                                    .addComponent(jcbZona, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 384, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfValorTipo)
                            .addComponent(jtfValorZona, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(380, 380, 380))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar)
                        .addGap(176, 176, 176))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfValorZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfValorTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar)
                    .addComponent(jbCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbZonaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbZonaFocusGained
        
    }//GEN-LAST:event_jcbZonaFocusGained

    private void jcbZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbZonaActionPerformed
        borroFilas();
        jtfValorZona.setEnabled(true);
        jcbTipo.setEnabled(false);
        jtfValorTipo.setEnabled(false);
        if (jcbZona.getSelectedIndex() > 0) {
            listaXZona = abmPropiedad.busquedaXZona(jcbZona.getSelectedIndex() + 1);
            for (PropiedadInmueble propiedadZona : listaXZona) {
                modelo.addRow(new Object[]{propiedadZona.getIdPropiedadInmueble(), propiedadZona.getZona().getNombre(),
                    propiedadZona.getDireccion(), propiedadZona.getTipoLocal().getNombre(), propiedadZona.getInspector().toString(),
                    propiedadZona.isDisponibilidad(), propiedadZona.getPropietario().toString(),
                    propiedadZona.getCaracteristicasString(), propiedadZona.getAccesibilidad()});
            }
        }
    }//GEN-LAST:event_jcbZonaActionPerformed

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
        borroFilas();
        jtfValorTipo.setEnabled(true);
        jcbZona.setEnabled(false);
        jtfValorZona.setEnabled(false);
        if (jcbTipo.getSelectedIndex()>0) {
            listaxTipo = abmPropiedad.listadoInmueblexTipo(jcbTipo.getSelectedIndex() + 1);
            for (PropiedadInmueble propiedadTipo : listaxTipo) {
                modelo.addRow(new Object[]{ propiedadTipo.getIdPropiedadInmueble(), propiedadTipo.getZona().getNombre(),
                    propiedadTipo.getDireccion(), propiedadTipo.getTipoLocal().getNombre(), propiedadTipo.getInspector().toString(),
                    propiedadTipo.isDisponibilidad(), propiedadTipo.getPropietario().toString(),
                    propiedadTipo.getCaracteristicasString(), propiedadTipo.getAccesibilidad()});
            }
            
        }
    }//GEN-LAST:event_jcbTipoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        jtfValorZona.setText("");
        jtfValorTipo.setText("");
        jcbZona.removeAllItems();
        jcbTipo.removeAllItems();
        comboBusquedaPorZona();
        comboBusquedaPorTipo();
        borroFilas();
        camposIniciales();
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jcbZonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbZonaMouseClicked
//        jtfValorZona.setEnabled(true);
//        jcbTipo.setEnabled(false);
//        jtfValorTipo.setEnabled(false);
    }//GEN-LAST:event_jcbZonaMouseClicked

    private void jcbTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbTipoMouseClicked
//        jtfValorTipo.setEnabled(true);
//        jcbZona.setEnabled(false);
//        jtfValorZona.setEnabled(false);
    }//GEN-LAST:event_jcbTipoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JComboBox<String> jcbZona;
    private javax.swing.JTable jtTablaPropiedades;
    private javax.swing.JTextField jtfValorTipo;
    private javax.swing.JTextField jtfValorZona;
    // End of variables declaration//GEN-END:variables

    private void armarTabla (){
        modelo.addColumn("id"); //0
        modelo.addColumn("Zona"); //1
        modelo.addColumn("Dirección"); //2
        modelo.addColumn("Tipo local"); //3
        modelo.addColumn("Precio"); //4
        modelo.addColumn("Estado local"); //5
        modelo.addColumn("Inspector"); //6
        modelo.addColumn("Disponibilidad"); //7
        modelo.addColumn("Propietario"); //8
        modelo.addColumn("Caracteristicas"); //9
        modelo.addColumn("Accesibilidad"); //10
        jtTablaPropiedades.setModel(modelo);
}
    
    private void borroFilas() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void camposIniciales(){
        jcbZona.setEnabled(true);
        jcbTipo.setEnabled(true);
        jtfValorZona.setEnabled(false);
        jtfValorTipo.setEnabled(false);
        jbActualizar.setEnabled(false);
        jbCancelar.setEnabled(true);
    }
    
    private void comboBusquedaPorZona() {
        listaZonas = abmZona.listarZonas();
        for (Zona xZona : listaZonas) {
            modelBusquedaXZona.addElement(xZona);
        }
        jcbZona.setModel(modelBusquedaXZona);
    }
    
    private void comboBusquedaPorTipo(){
        listaTipoLocal = abmTipoLocal.listarTipoLocal();
        for (TipoLocal tpl : listaTipoLocal) {
            modelBusquedazTipo.addElement(tpl);
        }
        jcbTipo.setModel(modelBusquedazTipo);
    }
    
    private void resetearCampos(){
        jtfValorZona.setText("");
        jtfValorTipo.setText("");
        borroFilas();
    }
}