package AccesoDatos;

import org.mariadb.jdbc.Connection;

/**
 *
 * @author manuv
 */
public class VendedorData {
    
    private Connection con = null;
    
    public VendedorData(){
        con = Conectar.getConectar();
    }
}
