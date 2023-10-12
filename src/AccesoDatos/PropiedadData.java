package AccesoDatos;

import Entidades.EstadoLocal;
import Entidades.Inspector;
import Entidades.PropiedadInmueble;
import Entidades.Propietario;
import Entidades.TipoLocal;
import Entidades.Vendedor;
import Entidades.Zona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class PropiedadData {
    
    private Connection con = null;
    private EstadoLocalData abmEstadoLocal=new EstadoLocalData();
    private InspectorData abmInsp=new InspectorData();
    private PropietarioData abmProp=new PropietarioData();
    private TipoLocalData abmTipoLocal=new TipoLocalData();
    private VendedorData abmVendedor=new VendedorData();
    private ZonaData abmZona=new ZonaData();
    
    public PropiedadData(){
        con = Conectar.getConectar();
                  
    }
    
    public void guardarPropiedad(PropiedadInmueble prop){
        String sql="INSERT INTO propiedadInmueble(idpropietario,accesibilidad,caracteristicas,direccion,"
                + "idEstadoLocal,precioTrazado,idVendedor,idInspector,idTipoLocal,idZona,disponibilidad)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, prop.getPropietario().getIdPropietario());
            ps.setString(2, prop.getAccesibilidad());
            ps.setString(3, prop.getCaracteristicasString());
            ps.setString(4, prop.getDireccion());
            ps.setInt(5, prop.getEstadoLocal().getIdEstadoLocal());
            ps.setDouble(6, prop.getPrecioTrazado());
            ps.setInt(7, prop.getVendedor().getIdVendedor());
            ps.setInt(8, prop.getInspector().getIdInspector());
            ps.setInt(9, prop.getTipoLocal().getIdTipoLocal());
            ps.setInt(10, prop.getZona().getIdZona());
            ps.setBoolean(11, prop.isDisponibilidad());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                prop.setIdPropiedadInmueble(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agregó la propiedad correctamente");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la propiedad "+e.getMessage());
        }
    }
    
    public void modificarpropiedad(PropiedadInmueble prop){
        //idpropietario,accesibilidad,caracteristicas,direccion,
        //idEstadoLocal,precioTrazado,idInspector,idTipoLocal,idZona,disponibilidad
        String sql="UPDATE propiedadInmueble SET idPropietario=?, accesibilidad=?, caracteristicas=?, "
                + "direccion=?, idEstadoLocal=?, precioTrazado=?, idVendedor=?, idInspector=?, idTipoLocal=?, idZona=?, disponibilidad=?"
                + "WHERE idPropiedad=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, prop.getPropietario().getIdPropietario());
            ps.setString(2, prop.getAccesibilidad());
            ps.setString(3, prop.getCaracteristicasString());
            ps.setString(4, prop.getDireccion());
            ps.setInt(5, prop.getEstadoLocal().getIdEstadoLocal());
            ps.setDouble(6, prop.getPrecioTrazado());
            ps.setInt(7, prop.getVendedor().getIdVendedor());
            ps.setInt(8, prop.getInspector().getIdInspector());
            ps.setInt(9, prop.getTipoLocal().getIdTipoLocal());
            ps.setInt(10, prop.getZona().getIdZona());
            ps.setBoolean(11, prop.isDisponibilidad());
            ps.setInt(12, prop.getIdPropiedadInmueble());
            int valor=ps.executeUpdate();
            if(valor>0){
                JOptionPane.showMessageDialog(null, "La propiedad se ha actualizado correctamente");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro de la propiedad "+e.getMessage());
        }
    }
    
    public List<PropiedadInmueble> buscarPropiedad(){
        List<PropiedadInmueble> listado=new ArrayList();
        PropiedadInmueble temp=null;
        Propietario elProp=null;
        Zona zon=null;
        EstadoLocal elEstado=null;
        TipoLocal elTipo=null;
        Vendedor ven=null;
        Inspector insp=null;
        String sql="SELECT pi.*, prop.nombre, prop.apellido, prop.domicilio, prop.telefono, "
                + "el.nombre, ins.nombre, ins.apellido, tp.nombre, tp.superficieMinima, z.nombre, z.descripcion "
                + "FROM propiedadInmueble pi JOIN propietario prop on(pi.idPropietario=prop.idPropietario) "
                + "JOIN estadoLocal el on(pi.idEstadoLocal=el.idEstadoLocal) "
                + "JOIN inspector ins on(pi.idInspector=ins.idInspector) "
                + "JOIN tipoLocal tp on(pi.idTipoLocal=tp.idTipoLocal) "
                + "JOIN zona z on(pi.idZona=z.idZona) "
                + "JOIN vendedor v on(pi.idVendedor=v.idVendedor)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                zon=new Zona();
                elProp=new Propietario();
                elEstado=new EstadoLocal();
                elTipo=new TipoLocal();
                ven=new Vendedor();
                insp=new Inspector();
                temp=new PropiedadInmueble();
                zon=abmZona.buscarZona(rs.getInt("idZona"));
                elProp=abmProp.buscopPropietario(rs.getInt("idpropietario"));
                elEstado=abmEstadoLocal.buscoEstadoLocal(rs.getInt("idEstadoLocal"));
                elTipo=abmTipoLocal.buscoTipoLocal(rs.getInt("idTipoLocal"));
                ven=abmVendedor.buscoVendedor(rs.getInt("idVendedor"));
                insp=abmInsp.buscoInspector(rs.getInt("idInspector"));
                
                //Empiezo armar el la propiedad inmuelble
                
                temp.setIdPropiedadInmueble(rs.getInt("idPropiedadInmueble"));
                temp.setPropietario(elProp);
                temp.setAccesibilidad(rs.getString("accesibilidad"));
                temp.setCaracteristicasString(rs.getString("caracteristicas"));
                temp.setDireccion(rs.getString("direccion"));
                temp.setEstadoLocal(elEstado);
                temp.setPrecioTrazado(rs.getFloat("precioTrazado"));
                temp.setVendedor(ven);
                temp.setInspector(insp);
                temp.setTipoLocal(elTipo);
                temp.setZona(zon);
                temp.setDisponibilidad(rs.getBoolean("disponibilidad"));
                listado.add(temp);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error a acceder a los datos de la tabla "+e.getMessage());
        }
        return listado;
    }
    
    public PropiedadInmueble buscarPropiedadPorId (int id){
        PropiedadInmueble temp=null;
        Propietario elProp=null;
        Zona zon=null;
        EstadoLocal elEstado=null;
        TipoLocal elTipo=null;
        Vendedor ven=null;
        Inspector insp=null;
        String sql="SELECT pi.*, prop.nombre, prop.apellido, prop.domicilio, prop.telefono, "
                + "el.nombre, ins.nombre, ins.apellido, tp.nombre, tp.superficieMinima, z.nombre, z.descripcion "
                + "FROM propiedadInmueble pi JOIN propietario prop on(pi.idPropietario=prop.idPropietario) "
                + "JOIN estadoLocal el on(pi.idEstadoLocal=el.idEstadoLocal) "
                + "JOIN inspector ins on(pi.idInspector=ins.idInspector) "
                + "JOIN tipoLocal tp on(pi.idTipoLocal=tp.idTipoLocal) "
                + "JOIN zona z on(pi.idZona=z.idZona) "
                + "JOIN vendedor v on(pi.idVendedor=v.idVendedor) where pi.idPropiedad = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                zon=new Zona();
                elProp=new Propietario();
                elEstado=new EstadoLocal();
                elTipo=new TipoLocal();
                ven=new Vendedor();
                insp=new Inspector();
                temp=new PropiedadInmueble();
                zon=abmZona.buscarZona(rs.getInt("idZona"));
                elProp=abmProp.buscopPropietario(rs.getInt("idpropietario"));
                elEstado=abmEstadoLocal.buscoEstadoLocal(rs.getInt("idEstadoLocal"));
                elTipo=abmTipoLocal.buscoTipoLocal(rs.getInt("idTipoLocal"));
                ven=abmVendedor.buscoVendedor(rs.getInt("idVendedor"));
                insp=abmInsp.buscoInspector(rs.getInt("idInspector"));
                
                //Empiezo armar el la propiedad inmuelble
                
                temp.setIdPropiedadInmueble(rs.getInt("idPropiedadInmueble"));
                temp.setPropietario(elProp);
                temp.setAccesibilidad(rs.getString("accesibilidad"));
                temp.setCaracteristicasString(rs.getString("caracteristicas"));
                temp.setDireccion(rs.getString("direccion"));
                temp.setEstadoLocal(elEstado);
                temp.setPrecioTrazado(rs.getFloat("precioTrazado"));
                temp.setVendedor(ven);
                temp.setInspector(insp);
                temp.setTipoLocal(elTipo);
                temp.setZona(zon);
                temp.setDisponibilidad(rs.getBoolean("disponibilidad"));
            }
            ps.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return temp;
    }
    
    public List<PropiedadInmueble> buscarxPropietario(int idPropietario){
        List<PropiedadInmueble> listado=new ArrayList();
        PropiedadInmueble elInmueble=null;
        Propietario elProp=null;
        Zona laZona=null;
        EstadoLocal elLocal=null;
        TipoLocal tipoLocal=null;
        Vendedor elVendedor=null;
        Inspector elInspector=null;
        String sql="SELECT pi.*, prop.nombre, prop.apellido, prop.domicilio, prop.telefono, "
                + "el.nombre, ins.nombre, ins.apellido, tp.nombre, tp.superficieMinima, z.nombre, z.descripcion "
                + "FROM propiedadInmueble pi JOIN propietario prop on(pi.idPropietario=prop.idPropietario) "
                + "JOIN estadoLocal el on(pi.idEstadoLocal=el.idEstadoLocal) "
                + "JOIN inspector ins on(pi.idInspector=ins.idInspector) "
                + "JOIN tipoLocal tp on(pi.idTipoLocal=tp.idTipoLocal) "
                + "JOIN zona z on(pi.idZona=z.idZona)"
                + "JOIN vendedor v on(pi.idVendedor=v.idVendedor) where pi.idPropietario = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idPropietario);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {                
             elProp=abmProp.buscopPropietario(rs.getInt("idPropietario"));
             laZona=abmZona.buscarZona(rs.getInt("idZona"));
             elLocal=abmEstadoLocal.buscoEstadoLocal(rs.getInt("idEstadoLocal"));
             tipoLocal=abmTipoLocal.buscoTipoLocal(rs.getInt("idTipoLocal"));
             elVendedor=abmVendedor.buscoVendedor(rs.getInt("idVendedor"));
             elInspector=abmInsp.buscoInspector(rs.getInt("idInspector"));
             //Armo el inmueble antes de agregarlo al listado
             elInmueble=new PropiedadInmueble();
             elInmueble.setIdPropiedadInmueble(rs.getInt(1));
             elInmueble.setPropietario(elProp);
             elInmueble.setAccesibilidad(rs.getString(3));
             elInmueble.setCaracteristicasString(rs.getString(4));
             elInmueble.setDireccion(rs.getString(5));
             elInmueble.setEstadoLocal(elLocal);
             elInmueble.setPrecioTrazado(rs.getFloat(7));
             elInmueble.setVendedor(elVendedor);
             elInmueble.setInspector(elInspector);
             elInmueble.setTipoLocal(tipoLocal);
             elInmueble.setZona(laZona);
             elInmueble.setDisponibilidad(rs.getBoolean(12));
             listado.add(elInmueble);
            }
        } catch (SQLException e) {
        }
        
        
        return listado;
    }
    
        
    }

