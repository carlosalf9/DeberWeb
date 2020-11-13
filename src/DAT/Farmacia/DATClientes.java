/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT.Farmacia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author CarlosC
 */
public class DATClientes {
    
    ConexionMySql conecta = new ConexionMySql();
    
    
    public ResultSet ObtenerProvincias() throws SQLException{
        
        Statement consulta = conecta.getConnection().createStatement();
        String sql = "SELECT * FROM provincias";
         return consulta.executeQuery(sql);
        
    }
    
    
    public ResultSet ObtenerCantones() throws SQLException{
        
        Statement consulta = conecta.getConnection().createStatement();
        String sql = "SELECT * FROM cantones";
         return consulta.executeQuery(sql);
        
    }
    
    
    public ResulSet ObtenerClientes(){
        
        Statement consulta = conecta.getConnection().createStatement();
        String sql = "SELECT c.IdClientes, c Cdeula, c. Apellido, cNombres, cFechaNacimiento, ";
         return consulta.executeQuery(sql);
    }
    
}
