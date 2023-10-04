package AccesoDatos;

import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class InspectorData {
    
    private Connection con = null;
    
    public InspectorData(){
        con = Conectar.getConectar();
    }
    
}
