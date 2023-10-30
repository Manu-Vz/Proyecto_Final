
package Vistas;

import AccesoDatos.TipoLocalData;
import AccesoDatos.ZonaData;
import Entidades.TipoLocal;
import Entidades.Zona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pcdlc
 */
public class EstadoYTipoLocal extends javax.swing.JInternalFrame {

    
    
    DefaultTableModel modeloTabla = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int f , int c){
            return false;
        }
        
    };

    
    
    public EstadoYTipoLocal() {
        initComponents();
        armarTabla();
        inicializarCampos();
        //List<Zona> lista = null;
        cargarTabla();
        armoCombo();
        armoComboEstado();
        
    }
   boolean seEstaModificando = false;
   int Indice;
  
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTLocal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CambiarEstado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jBguardar = new javax.swing.JButton();
        Modificar = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Estado Y Tipo Loca");

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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ingrese Tipo De Local");

        jTLocal.setToolTipText("Ingrese Local");
        jTLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTLocalKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Zona");
        jLabel3.setToolTipText("");

        jtDescripcion.setToolTipText("Ingrese Zona Del Local ");
        jtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDescripcionKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cambiar Estado");

        CambiarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "En Obra", "Nesecita Reparaciones ", "En Abandono", "A Estrenar " }));
        CambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarEstadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Modificar");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Localidad");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBguardar)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CambiarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jBguardar)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDescripcionKeyReleased
        // TODO add your handling code here:
        ZonaData zd = new ZonaData();
        List<Zona> lista = new ArrayList();
        if(!seEstaModificando){
            if(jtNombre.getText().isEmpty()){
                lista = zd.listarZonasPorDescripcion(jtDescripcion.getText());
            }else{
                lista = zd.listarZonasPorNombre_Y_Descripcion(jtNombre.getText(), jtDescripcion.getText());
            }
            
            cargarTabla(lista);
        }
    }//GEN-LAST:event_jtDescripcionKeyReleased

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
        // TODO add your handling code here:
        ZonaData zd = new ZonaData();
        List<Zona> lista = new ArrayList();
        if(!seEstaModificando){
            if(jtDescripcion.getText().isEmpty()){
                lista = zd.listarZonasPorNombre(jtNombre.getText());
                
                }else{
                lista = zd.listarZonasPorNombre_Y_Descripcion(jtNombre.getText(),jtDescripcion.getText());
      
            }
            cargarTabla(lista);
        }
        
    }//GEN-LAST:event_jtNombreKeyReleased

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int fila = tabla.getSelectedRow();
        /*jTLocal.setText(String.valueOf(modeloTabla.getValueAt(fila, 1)));
        jtDescripcion.setText(String.valueOf(modeloTabla.getValueAt(fila, 2)));
        jtNombre.setText(String.valueOf(modeloTabla.getValueAt(fila, 3)));
        */
        if(fila != -1 && modeloTabla.getRowCount() > 0){
        jTLocal.setText(String.valueOf(modeloTabla.getValueAt(fila, 0)));
        jtDescripcion.setText(String.valueOf(modeloTabla.getValueAt(fila, 1)));
        jtNombre.setText(String.valueOf(modeloTabla.getValueAt(fila, 2)));
    }
        
    }//GEN-LAST:event_tablaMouseClicked

    private void jTLocalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLocalKeyReleased
            TipoLocalData tpl = new TipoLocalData();
            List<TipoLocal> lista;
            if(!seEstaModificando){
                if(jTLocal.getText().isEmpty()){
                    lista = tpl.listarTipoLocal();
                    cargarTabla();
                    
                    lista = tpl.listarTipoLocal();
                    cargarTablaTipoLocal(lista);
                }
                
            }
    }//GEN-LAST:event_jTLocalKeyReleased

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jtNombreActionPerformed

    private void CambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CambiarEstadoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
        String seleccionModificar = (String) Modificar.getSelectedItem();
        String SeleccionCambiarEstado = (String) CambiarEstado.getSelectedItem();
              
    }//GEN-LAST:event_jBguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CambiarEstado;
    private javax.swing.JComboBox<String> Modificar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTLocal;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables


public void armarTabla(){
    
    modeloTabla.addColumn("ID");
    modeloTabla.addColumn("Local");
    modeloTabla.addColumn("Zona");
    modeloTabla.addColumn("Localidad");
    tabla.setModel(modeloTabla);
    
}

 public void cargarTabla(){
        ZonaData zd = new ZonaData();
        List<Zona> lista = new ArrayList();
        lista = zd.listarZonasPorNombre("");
        for(Zona z : lista){
            modeloTabla.addRow(new Object[]{z.getIdZona(), z.getNombre(), z.getDescripcion(), z.isEstado()});
        }
 }
 
 
 public void cargarTablaTipoLocal(List<TipoLocal> lista){
     modeloTabla.setRowCount(0);
     for (TipoLocal tipoLocal : lista){
         
         modeloTabla.addRow(new Object[]{tipoLocal.getIdTipoLocal(), tipoLocal.getNombre(), tipoLocal.getDescripcion()});
         
     }
    }
 
 
 
 public void cargarTabla(List<Zona> lista){
        modeloTabla.setRowCount(0);
        for(Zona z : lista){
        modeloTabla.addRow(new Object[]{z.getIdZona(), z.getNombre(), z.getDescripcion(), z.isEstado()});
 }
  
 }
 
 
       public void limpiarCampos(){
         modeloTabla.setRowCount(0);
         jtDescripcion.setText("");
         jtNombre.setText("");
         jTLocal.setText("");
         cargarTabla();
         inicializarCampos();
     }
       
       private void armoCombo(){
           Modificar.addItem("Disponible");
           Modificar.addItem("No Disponible");
       }
       
       private void armoComboEstado(){
           CambiarEstado.addItem("Nuevo");
           CambiarEstado.addItem("En Obra");
           CambiarEstado.addItem("Nesecita Reparaciones");
           CambiarEstado.addItem("En Abandono");
           CambiarEstado.addItem("A Estrenar");
           
           
       }
       
       public void  inicializarCampos(){
           jTLocal.setText("");
          jtDescripcion.setText("");
          jtNombre.setText("");
          Modificar.setEnabled(false);
          Modificar.setEnabled(true);
          CambiarEstado.addItem("Nuevo");
          CambiarEstado.addItem("Usado");
          
      }
      
}
 
 
 
 


   







