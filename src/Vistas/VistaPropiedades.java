/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoDatos.EstadoLocalData;
import AccesoDatos.InspectorData;
import AccesoDatos.PropiedadData;
import AccesoDatos.PropietarioData;
import AccesoDatos.TipoLocalData;
import AccesoDatos.VendedorData;
import AccesoDatos.ZonaData;
import Entidades.EstadoLocal;
import Entidades.Inspector;
import Entidades.PropiedadInmueble;
import Entidades.Propietario;
import Entidades.TipoLocal;
import Entidades.Vendedor;
import Entidades.Zona;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalema
 */
public class VistaPropiedades extends javax.swing.JInternalFrame {

    public DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    public DefaultTableModel modeloZona=new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int f,int c){
            return false;
        }
    };

    private DefaultComboBoxModel modelComboProp = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelComboZona = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelComboVendedor = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelComboInspector = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelComboEstadoLocal = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelComboTipoLocal = new DefaultComboBoxModel();
    PropietarioData abmProp = new PropietarioData();
    PropiedadData abmPropiedad = new PropiedadData();
    ZonaData abmZona = new ZonaData();
    EstadoLocalData abmEstadoLocal = new EstadoLocalData();
    TipoLocalData abmTipoLocal = new TipoLocalData();
    InspectorData abmInspector = new InspectorData();
    VendedorData abmVendedor = new VendedorData();
    Propietario tempPropietario = null;
    Zona tempZona=null;
    EstadoLocal tempEstadoLocal=null;
    TipoLocal tempTipoLocal=null;
    Inspector temInspector=null;
    Vendedor tempVendedor=null;
    PropiedadInmueble tempProp=null;
    //Creo los listados para uso de todo el fomulario
    List<Propietario> listaPropietarios = new ArrayList();
    List<Zona> listaZonas = new ArrayList();
    List<EstadoLocal> listaEstadoLocal = new ArrayList();
    List<TipoLocal> listaTipoLocal = new ArrayList();
    List<Inspector> listaInspector = new ArrayList();
    List<Vendedor> listaVendedor =  new ArrayList();
    //Creo las listas para manejar las altas y modificaciones de los inmuebles
    List<PropiedadInmueble> listaXIDProp=new ArrayList();
    

    /**
     * Creates new form VistaPropiedades
     */
    public VistaPropiedades() {
        initComponents();
        armoTabla();
        comboPropietarios();
        comboZonas();
        comboEstadoLocal();
        comboTipoLocal();
        comboInspector();
        comboVendedor();
        comboDisponibilidad();
        //camposInicialTabAgregar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCapasPanelBusquedas = new javax.swing.JTabbedPane();
        jPanelxZona = new javax.swing.JPanel();
        jtZonaNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaZonas = new javax.swing.JTable();
        jPanelxPrecio = new javax.swing.JPanel();
        jPanelxTipo = new javax.swing.JPanel();
        jPanelAgregar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jcbListaPropietarios = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanelDatos = new javax.swing.JPanel();
        jtAccesibilidad = new javax.swing.JTextField();
        jtCaracteristicas = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jcbEstadoLocal = new javax.swing.JComboBox<>();
        jcbTipoLocal = new javax.swing.JComboBox<>();
        jcbZona = new javax.swing.JComboBox<>();
        jcbInspector = new javax.swing.JComboBox<>();
        jtPrecio = new javax.swing.JTextField();
        jcbDisponibilidad = new javax.swing.JComboBox<>();
        jbtAgregar = new javax.swing.JButton();
        jbtModificar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jcbVendedor = new javax.swing.JComboBox<>();
        jlabelVendedor = new javax.swing.JLabel();
        jLabelInspector = new javax.swing.JLabel();
        jLabelZona = new javax.swing.JLabel();
        jLabelTipoLocal = new javax.swing.JLabel();
        jLabelEstadoLocal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaBusquedaProp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jCapasPanelBusquedas.setBackground(new java.awt.Color(255, 255, 255));
        jCapasPanelBusquedas.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jtZonaNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtZonaNombre.setText("Ingrese el nombre de la zona");

        jTablaZonas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablaZonas);

        javax.swing.GroupLayout jPanelxZonaLayout = new javax.swing.GroupLayout(jPanelxZona);
        jPanelxZona.setLayout(jPanelxZonaLayout);
        jPanelxZonaLayout.setHorizontalGroup(
            jPanelxZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelxZonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelxZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
                    .addGroup(jPanelxZonaLayout.createSequentialGroup()
                        .addComponent(jtZonaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelxZonaLayout.setVerticalGroup(
            jPanelxZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelxZonaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jtZonaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jCapasPanelBusquedas.addTab("Búsqueda por zona", jPanelxZona);

        javax.swing.GroupLayout jPanelxPrecioLayout = new javax.swing.GroupLayout(jPanelxPrecio);
        jPanelxPrecio.setLayout(jPanelxPrecioLayout);
        jPanelxPrecioLayout.setHorizontalGroup(
            jPanelxPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1056, Short.MAX_VALUE)
        );
        jPanelxPrecioLayout.setVerticalGroup(
            jPanelxPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        jCapasPanelBusquedas.addTab("Búsqueda por Precio", jPanelxPrecio);

        javax.swing.GroupLayout jPanelxTipoLayout = new javax.swing.GroupLayout(jPanelxTipo);
        jPanelxTipo.setLayout(jPanelxTipoLayout);
        jPanelxTipoLayout.setHorizontalGroup(
            jPanelxTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1056, Short.MAX_VALUE)
        );
        jPanelxTipoLayout.setVerticalGroup(
            jPanelxTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        jCapasPanelBusquedas.addTab("Búsqueda por Tipo", jPanelxTipo);

        jPanelAgregar.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N

        jLabel4.setText("Elija el propietario");

        jcbListaPropietarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbListaPropietariosFocusGained(evt);
            }
        });
        jcbListaPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaPropietariosActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setText("Agregar Propietario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDatos.setBackground(new java.awt.Color(204, 227, 213));

        jtAccesibilidad.setForeground(new java.awt.Color(199, 199, 199));
        jtAccesibilidad.setText("Accesibilidad");

        jtCaracteristicas.setForeground(new java.awt.Color(199, 199, 199));
        jtCaracteristicas.setText("Caracteristicas");

        jtDireccion.setForeground(new java.awt.Color(199, 199, 199));
        jtDireccion.setText("Dirección");

        jtPrecio.setForeground(new java.awt.Color(199, 199, 199));
        jtPrecio.setText("Precio");

        jbtAgregar.setText("Agregar");
        jbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarActionPerformed(evt);
            }
        });

        jbtModificar.setText("Modificar");

        jbtCancelar.setText("Cancelar");

        jlabelVendedor.setText("Vendedor");

        jLabelInspector.setText("Inspector");

        jLabelZona.setText("Zona");

        jLabelTipoLocal.setText("Tipo Local");

        jLabelEstadoLocal.setText("Estado Local");

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jtAccesibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jbtAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtModificar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtCancelar))
                            .addComponent(jcbDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbZona, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelZona, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTipoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbTipoLocal, 0, 130, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbEstadoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstadoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelInspector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbInspector, 0, 130, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlabelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbVendedor, 0, 130, Short.MAX_VALUE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelVendedor)
                    .addComponent(jLabelInspector)
                    .addComponent(jLabelTipoLocal)
                    .addComponent(jLabelEstadoLocal)
                    .addComponent(jLabelZona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEstadoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbInspector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtAccesibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAgregar)
                    .addComponent(jbtModificar)
                    .addComponent(jbtCancelar))
                .addGap(23, 23, 23))
        );

        jTablaBusquedaProp.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablaBusquedaProp);

        javax.swing.GroupLayout jPanelAgregarLayout = new javax.swing.GroupLayout(jPanelAgregar);
        jPanelAgregar.setLayout(jPanelAgregarLayout);
        jPanelAgregarLayout.setHorizontalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanelAgregarLayout.setVerticalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jcbListaPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jCapasPanelBusquedas.addTab("Agregar Propiedad", jPanelAgregar);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("GESTIÓN DE PROPIEDADES");
        jLabel1.setFocusable(false);
        jLabel1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCapasPanelBusquedas)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(358, 358, 358))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jCapasPanelBusquedas, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jCapasPanelBusquedas.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Abrimos el formulario de Propietarios
        GestionPropietarios nuevoProp = new GestionPropietarios();
        MenuPrincipal.escritorio.add(nuevoProp);
        nuevoProp.toFront();
        nuevoProp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbListaPropietariosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbListaPropietariosFocusGained
        // Recargo la lista de propietarios
        jcbListaPropietarios.removeAllItems();
        borroFilas();
        comboPropietarios();
    }//GEN-LAST:event_jcbListaPropietariosFocusGained

    private void jcbListaPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaPropietariosActionPerformed
        // Con la selección cargo los datos de las propiedades de el propietario seleccionado
        
        borroFilas();
        if(jcbListaPropietarios.getSelectedIndex() > 0){
            listaXIDProp=abmPropiedad.buscarxPropietario(jcbListaPropietarios.getSelectedIndex()+1);
            for (PropiedadInmueble inmueble : listaXIDProp) {
                //System.out.println("Muesto algo "+inmueble.getVendedor().toString());
                modelo.addRow(new Object[]{inmueble.getIdPropiedadInmueble(),inmueble.getZona().getNombre(),
                                inmueble.getDireccion(),inmueble.getTipoLocal().getNombre(),inmueble.getPrecioTrazado(),
                                inmueble.getEstadoLocal().getNombre(),inmueble.getVendedor().toString(),
                                inmueble.isDisponibilidad(),inmueble.getPropietario().toString()});
            }
        }
    }//GEN-LAST:event_jcbListaPropietariosActionPerformed

    private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed
        // Construyo los objetos para el objeto inmueble
        tempProp = new PropiedadInmueble();
        tempPropietario=abmProp.buscopPropietario(jcbListaPropietarios.getSelectedIndex()+1);
        temInspector=abmInspector.buscoInspector(jcbInspector.getSelectedIndex()+1);
        tempEstadoLocal=abmEstadoLocal.buscoEstadoLocal(jcbEstadoLocal.getSelectedIndex()+1);
        tempTipoLocal=abmTipoLocal.buscoTipoLocal(jcbTipoLocal.getSelectedIndex()+1);
        tempVendedor=abmVendedor.buscoVendedor(jcbVendedor.getSelectedIndex()+1);
        tempZona=abmZona.buscarZona(jcbZona.getSelectedIndex()+1);
        boolean valor = false;
        if(jcbDisponibilidad.getSelectedIndex()==0){
            valor=true;
        }
        //Construyo el inmueble para agregar a la baze
        tempProp.setPropietario(tempPropietario);
        tempProp.setAccesibilidad(jtAccesibilidad.getText());
        tempProp.setCaracteristicasString(jtCaracteristicas.getText());
        tempProp.setDireccion(jtDireccion.getText());
        tempProp.setEstadoLocal(tempEstadoLocal);
        tempProp.setPrecioTrazado(Float.valueOf(jtPrecio.getText()));
        tempProp.setVendedor(tempVendedor);
        tempProp.setInspector(temInspector);
        tempProp.setTipoLocal(tempTipoLocal);
        tempProp.setZona(tempZona);
        tempProp.setDisponibilidad(valor);
        abmPropiedad.guardarPropiedad(tempProp);
    }//GEN-LAST:event_jbtAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTabbedPane jCapasPanelBusquedas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEstadoLocal;
    private javax.swing.JLabel jLabelInspector;
    private javax.swing.JLabel jLabelTipoLocal;
    private javax.swing.JLabel jLabelZona;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAgregar;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelxPrecio;
    private javax.swing.JPanel jPanelxTipo;
    private javax.swing.JPanel jPanelxZona;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaBusquedaProp;
    private javax.swing.JTable jTablaZonas;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JComboBox<String> jcbDisponibilidad;
    private javax.swing.JComboBox<String> jcbEstadoLocal;
    private javax.swing.JComboBox<String> jcbInspector;
    private javax.swing.JComboBox<String> jcbListaPropietarios;
    private javax.swing.JComboBox<String> jcbTipoLocal;
    private javax.swing.JComboBox<String> jcbVendedor;
    private javax.swing.JComboBox<String> jcbZona;
    private javax.swing.JLabel jlabelVendedor;
    private javax.swing.JTextField jtAccesibilidad;
    private javax.swing.JTextField jtCaracteristicas;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtZonaNombre;
    // End of variables declaration//GEN-END:variables

    private void colorPaneles() {
//        jCapasPanelBusquedas.setBackgroundAt(0, Color.red);
//        jCapasPanelBusquedas.setBackgroundAt(1, Color.gray);
//        jCapasPanelBusquedas.setBackgroundAt(2, Color.yellow);
//        jCapasPanelBusquedas.setBackgroundAt(3, Color.darkGray);
//        jCapasPanelBusquedas.setBackground(Color.red);
//        jPanelAgregar.setBackground(Color.orange);
//        jPanelAgregar.setBackground(new java.awt.Color(255, 102, 102));
    }

    public void armoTabla() {
        modelo.addColumn("id");
        modelo.addColumn("Zona");
        modelo.addColumn("Dirección");
        modelo.addColumn("Tipo local");
        modelo.addColumn("Precio");
        modelo.addColumn("Estado local");
        modelo.addColumn("Vendedor");
        modelo.addColumn("Disponibilidad");
        modelo.addColumn("Propietario");
        jTablaBusquedaProp.setModel(modelo);
    }
    
    public void armoTablaZona(){
        modeloZona.addColumn("Nombre");
        modeloZona.addColumn("Descripción");
    }

    public void comboPropietarios() {
        listaPropietarios = abmProp.listarPropietario();
        for (Propietario prop : listaPropietarios) {
            modelComboProp.addElement(prop);
        }
        jcbListaPropietarios.setModel(modelComboProp);
    }
    
    public void comboZonas(){
        listaZonas = abmZona.listarZonas();
        for (Zona zona : listaZonas) {
            modelComboZona.addElement(zona);
        }
        jcbZona.setModel(modelComboZona);
    }
    
    public void comboEstadoLocal(){
        listaEstadoLocal = abmEstadoLocal.listadoLocales();
        for (EstadoLocal estadoLocal : listaEstadoLocal) {
            modelComboEstadoLocal.addElement(estadoLocal.getNombre());
        }
        jcbEstadoLocal.setModel(modelComboEstadoLocal);
    }
    
    public void comboTipoLocal(){
        listaTipoLocal = abmTipoLocal.listarTipoLocal();
        for (TipoLocal tipoLocal : listaTipoLocal) {
            modelComboTipoLocal.addElement(tipoLocal.getNombre());
        }
        jcbTipoLocal.setModel(modelComboTipoLocal);
    }
    
    public void comboInspector(){
        listaInspector = abmInspector.listadoInspectoeres();
        for (Inspector inspector : listaInspector) {
            modelComboInspector.addElement(inspector);
        }
        jcbInspector.setModel(modelComboInspector);
    }
    
    public void comboVendedor(){
        listaVendedor = abmVendedor.listadoVendedor();
        for (Vendedor vendedor : listaVendedor) {
            modelComboVendedor.addElement(vendedor);
        }
        jcbVendedor.setModel(modelComboVendedor);
    }
    
    public void comboDisponibilidad(){
        jcbDisponibilidad.addItem("Seleccionar");
        jcbDisponibilidad.addItem("Activo");
        jcbDisponibilidad.addItem("Inactivo");
    }
    
    public void camposInicialTabAgregar(){
        jtAccesibilidad.setEnabled(false);
        jtCaracteristicas.setEnabled(false);
        jtDireccion.setEnabled(false);
        jtPrecio.setEnabled(false);
        jcbDisponibilidad.setEnabled(false);
        jbtAgregar.setEnabled(false);
        jbtModificar.setEnabled(false);
    }
    
    public void borroFilas(){
        int filas = modelo.getRowCount() -1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
