package AccesoDatos;

import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class EstadoLocalData {
    
    private Connection con = null;
    
    public EstadoLocalData(){
        con = Conectar.getConectar();
    }
    
    
}
