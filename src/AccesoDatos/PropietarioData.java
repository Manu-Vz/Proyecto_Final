package AccesoDatos;

import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class PropietarioData {
    
    private Connection con = null;
    
    public PropietarioData(){
        con = Conectar.getConectar();
    }
    
}
