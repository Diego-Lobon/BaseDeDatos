
package conexion;

import java.sql.*;

/**
 *
 * @author PCZ
 */
public class conectar {
    
    Connection conectar = null;
    public Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/datosPersonas","root","");
        } catch (Exception e){
            System.out.print(e.getMessage());
        } 
        return conectar;
    }
    
    
}
