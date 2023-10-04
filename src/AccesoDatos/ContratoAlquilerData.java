package AccesoDatos;

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
    
}
