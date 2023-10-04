package AccesoDatos;

import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class ZonaData {
    
    private Connection con = null;
    
    public ZonaData(){
        con = Conectar.getConectar();
    }
    
}
