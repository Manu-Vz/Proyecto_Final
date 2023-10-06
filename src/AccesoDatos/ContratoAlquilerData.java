package AccesoDatos;

import Entidades.ContratoAlquiler;
import Entidades.EstadoContrato;
import Entidades.Inquilino;
import Entidades.PropiedadInmueble;
import Entidades.Vendedor;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class ContratoAlquilerData {
    
    private InquilinoData abmInquilino = new InquilinoData();
    private PropiedadData abmPropiedad = new PropiedadData();
    private VendedorData abmVendedor = new VendedorData();
    private EstadoContratoData abmEstadoContrato = new EstadoContratoData();
    
    
    private Connection con = null;
    
    public ContratoAlquilerData(){
        con = Conectar.getConectar();
    }
    
    public void agregarContrato(ContratoAlquiler contrato){
        String sql = "INSERT INTO contratoalquiler(idInquilino, "
                + "idPropiedadInmueble, fechaFinal, fechaInical, "
                + "fechaRealizacion, marca, idVendedor) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, contrato.getInquilino().getIdInquilino());
            ps.setInt(2, contrato.getPropiedadInmueble().getIdPropiedadInmueble());
            ps.setDate(3, Date.valueOf(contrato.getFechaFinal()));
            ps.setDate(4, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(5, Date.valueOf(contrato.getFechaRealizacion()));
            ps.setString(6, contrato.getMarca());
            ps.setInt(7, contrato.getVendedor().getIdVendedor());
            ps.setInt(8, contrato.getEstado().getIdEstadoContrato());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                contrato.setIdContratoAlquiler(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Se ha agregado un nuevo Contrato de Alquiler correctamente");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar Contrato de Alquiler "+ ex.getMessage());
        }
    }
    
    public void modificarContrato(ContratoAlquiler contrato){
        String sql = "UPDATE contratoalquiler SET idInquilino=?,"
                + "idPropiedadInmueble=?,fechaFinal=?,fechaInical=?,"
                + "fechaRealizacion=?,marca=?,idVendedor`=?,idEstadoContrato=? "
                + "WHERE idContratoAlquiler = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, contrato.getInquilino().getIdInquilino());
            ps.setInt(2, contrato.getPropiedadInmueble().getIdPropiedadInmueble());
            ps.setDate(3, Date.valueOf(contrato.getFechaFinal()));
            ps.setDate(4, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(5, Date.valueOf(contrato.getFechaRealizacion()));
            ps.setString(6, contrato.getMarca());
            ps.setInt(7, contrato.getVendedor().getIdVendedor());
            ps.setInt(8, contrato.getEstado().getIdEstadoContrato());
            ps.setInt(9, contrato.getIdContratoAlquiler());
            
            int rs = ps.executeUpdate();
            
            if(rs > 0){
                JOptionPane.showMessageDialog(null,"El Contrato de Alquiler fue modificado correctamente");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Contrato de Alquiler "+ ex.getMessage());
        }
        
        
    }
    
    public List<ContratoAlquiler> listarContrato (){
        
        List<ContratoAlquiler> listado = new ArrayList<>();
        ContratoAlquiler conAlq = null;
        String sql = "SELECT * FROM contratoalquiler";
        Inquilino inqui = null;
        PropiedadInmueble propInmueble = null;
        Vendedor vendedor = null;
        EstadoContrato estContrato = null;
        
        try {
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {
               inqui = abmInquilino.buscoInquilino(rs.getInt("idInquilino"));
               propInmueble = abmPropiedad.buscarPropiedadPorId(rs.getInt("idPropiedadInmueble"));
               vendedor = abmVendedor.buscoVendedor(rs.getInt("idVendedor"));
               estContrato = abmEstadoContrato.BuscarEstadoContratoPorId(rs.getInt("idEstadoContrato"));
               LocalDate ldf = LocalDate.parse(rs.getString("fechaFinal"));
               LocalDate ldi = LocalDate.parse(rs.getString("fechaInicial"));
               LocalDate ldr = LocalDate.parse(rs.getString("fechaRealizacion"));
               
               
               //Empezamos a construir el objeto que va al listado.
               
               conAlq.setIdContratoAlquiler(1);
               conAlq.setInquilino(inqui);
               conAlq.setPropiedadInmueble(propInmueble);
               conAlq.setFechaFinal(ldf);
               conAlq.setFechaInicio(ldi);
               conAlq.setFechaRealizacion(ldr);
               conAlq.setVendedor(vendedor);
               conAlq.setEstado(estContrato);
               listado.add(conAlq);
            }
            ps.close();
        } catch (SQLException e) {
        }
        return listado;
    }
    
    public ContratoAlquiler buscarContratoAlquilerPorId (int id){
        ContratoAlquiler contratoAlquiler = null;
        String sql = "SELECT * FROM contratoalquiler where idContratoAlquiler = ?";
        
        Inquilino inqui = null;
        PropiedadInmueble propInmueble = null;
        Vendedor vendedor = null;
        EstadoContrato estContrato = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
               inqui = abmInquilino.buscoInquilino(rs.getInt("idInquilino"));
               propInmueble = abmPropiedad.buscarPropiedadPorId(rs.getInt("idPropiedadInmueble"));
               vendedor = abmVendedor.buscoVendedor(rs.getInt("idVendedor"));
               estContrato = abmEstadoContrato.BuscarEstadoContratoPorId(rs.getInt("idEstadoContrato"));
               LocalDate ldf = LocalDate.parse(rs.getString("fechaFinal"));
               LocalDate ldi = LocalDate.parse(rs.getString("fechaInicial"));
               LocalDate ldr = LocalDate.parse(rs.getString("fechaRealizacion"));

               contratoAlquiler.setIdContratoAlquiler(1);
               contratoAlquiler.setInquilino(inqui);
               contratoAlquiler.setPropiedadInmueble(propInmueble);
               contratoAlquiler.setFechaFinal(ldf);
               contratoAlquiler.setFechaInicio(ldi);
               contratoAlquiler.setFechaRealizacion(ldr);
               contratoAlquiler.setVendedor(vendedor);
               contratoAlquiler.setEstado(estContrato);
                
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return contratoAlquiler;
    }
    
}
