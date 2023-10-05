package AccesoDatos;

import Entidades.ContratoAlquiler;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class ContratoAlquilerData {
    
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
    
    
}
