
package AccesoDatos;

import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class InquilinoData {
    
    private Connection con=null;
    
    public InquilinoData(){
        con=Conectar.getConectar();
    }
    
    
    
}
