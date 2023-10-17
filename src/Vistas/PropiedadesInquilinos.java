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
 * @author manuv
 */

public class PropiedadesInquilinos extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla = null;
    private DefaultComboBoxModel modeloComboBoxPrecio = null;
    private DefaultComboBoxModel modeloComboBoxZona = null;
    private DefaultComboBoxModel modeloComboBoxLocal = null;
    
    public PropiedadesInquilinos() {
        modeloTabla = new DefaultTableModel(){
         @Override
            public boolean isCellEditable(int f, int c) {
                return false; }};
        
        
        initComponents();
        this.modeloComboBoxLocal = new DefaultComboBoxModel();
        this.modeloComboBoxZona = new DefaultComboBoxModel();
        this.modeloComboBoxPrecio = new DefaultComboBoxModel();
        armarComboBoxZona();
        armarComboBoxPrecios();
        armarComboBoxTipoLocal();
        armarTabla();
        jButton2.setEnabled(false);
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ComboBoxZonas = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        ComboBoxLocal = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        ComboBoxPrecio = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        ComboBoxZonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxZonas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ComboBoxZonasFocusLost(evt);
            }
        });
        ComboBoxZonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxZonasActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("Zona: ");

        jTextField2.setEditable(false);
        jTextField2.setText("Tipo de Local:");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        ComboBoxLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxLocalActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("Precio:");

        ComboBoxPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxPrecioActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Alquilar Propiedad");

        jButton2.setText("Borrar Filtros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxZonas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxZonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxZonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxZonasActionPerformed
        // TODO add your handling code here:
        if (ComboBoxLocal.getSelectedIndex() != 0 && 
                ComboBoxPrecio.getSelectedIndex() != 0 &&
                ComboBoxZonas.getSelectedIndex() != 0){
            jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_ComboBoxZonasActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ComboBoxLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxLocalActionPerformed
        // TODO add your handling code here:
        if (ComboBoxLocal.getSelectedIndex() != 0 && 
                ComboBoxPrecio.getSelectedIndex() != 0 &&
                ComboBoxZonas.getSelectedIndex() != 0){
            jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_ComboBoxLocalActionPerformed

    private void ComboBoxPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxPrecioActionPerformed
        // TODO add your handling code here:
        if (ComboBoxLocal.getSelectedIndex() != 0 && 
                ComboBoxPrecio.getSelectedIndex() != 0 &&
                ComboBoxZonas.getSelectedIndex() != 0){
            jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_ComboBoxPrecioActionPerformed

    private void ComboBoxZonasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComboBoxZonasFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ComboBoxZonasFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ComboBoxLocal.setSelectedIndex(0);
        ComboBoxPrecio.setSelectedIndex(0);
        ComboBoxZonas.setSelectedIndex(0);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxLocal;
    private javax.swing.JComboBox<String> ComboBoxPrecio;
    private javax.swing.JComboBox<String> ComboBoxZonas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void armarComboBoxZona(){
        List<Zona> zonas = new ArrayList();
        ZonaData zonaD = new ZonaData();
        zonas = zonaD.listarZonas();
        for(Zona z : zonas){
            modeloComboBoxZona.addElement(z);
        }
        ComboBoxZonas.setModel(modeloComboBoxZona);
    }
    
    private void armarComboBoxTipoLocal(){
        List<TipoLocal> tipos = new ArrayList();
        TipoLocalData LocalD = new TipoLocalData();
        tipos = LocalD.listarTipoLocal();
        
        for(TipoLocal t : tipos){
            modeloComboBoxLocal.addElement(t);
        }
        ComboBoxLocal.setModel(modeloComboBoxLocal);
    }
    
    private void armarComboBoxPrecios(){
        modeloComboBoxPrecio.addElement("Seleccione una opcion");
        modeloComboBoxPrecio.addElement("Desde 0$ hasta 100.000$");
        modeloComboBoxPrecio.addElement("Desde 100.000$ hasta 150.000$");
        modeloComboBoxPrecio.addElement("Desde 150.000$ hasta 200.000$");
        modeloComboBoxPrecio.addElement("Desde 200.000$ hasta 300.000$");
        modeloComboBoxPrecio.addElement("Desde 300.000$ para arriba");
        ComboBoxPrecio.setModel(modeloComboBoxPrecio);
    }

    private void armarTabla(){
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Tipo Local");
        modeloTabla.addColumn("Direccion");
        modeloTabla.addColumn("Zona");
        modeloTabla.addColumn("Estado del Local");
        modeloTabla.addColumn("Precio");
        
        PropiedadData pd = new PropiedadData();
        List<PropiedadInmueble> listPi = new ArrayList();
        listPi = pd.buscarPropiedad();
        
        for(PropiedadInmueble p : listPi){
            modeloTabla.addRow(new Object[]{p.getIdPropiedadInmueble(), 
                p.getTipoLocal().getNombre(), 
                p.getDireccion(), p.getZona().getNombre(),
                p.getEstadoLocal().getNombre(), p.getPrecioTrazado() });
        }
        tabla.setModel(modeloTabla);
    }

















}
