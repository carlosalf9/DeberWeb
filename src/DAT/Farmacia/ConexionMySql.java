/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT.Farmacia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CarlosC
 */
public class ConexionMySql {
    
    private String base = "base";
    private String usuario = "farmacia";
    private String clave = "farmacia01";
    private String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
    
    
    /// CLASE PARA CONECTAR LA BASE DE DATOS
    
    public Connection getConnection (){
        
        try {
            
            Class.forName("con.mysql.jdbc.Driver");
            con =(Connection)DriverManager.getConnection(url,usuario,clave);
            
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        return con;
    }
    
}
