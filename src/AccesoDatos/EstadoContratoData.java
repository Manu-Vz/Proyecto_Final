package AccesoDatos;

import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class EstadoContratoData {
    
    private Connection con = null;
    
    public EstadoContratoData(){
        con = Conectar.getConectar();
    }
    
}
