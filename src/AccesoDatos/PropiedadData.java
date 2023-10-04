package AccesoDatos;

import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class PropiedadData {
    
    private Connection con = null;
    
    public PropiedadData(){
        con = Conectar.getConectar();
                  
    }
    
    
    
}
