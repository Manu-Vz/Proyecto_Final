package AccesoDatos;

import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class TipoLocalData {
    
    private Connection con = null;
    
    public TipoLocalData(){
        con = Conectar.getConectar();
    }
    
}
