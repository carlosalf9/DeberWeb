/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LNE.Farmacia;

import DAT.Farmacia.DATClientes;
import ENT.Farmacia.Canton;
import ENT.Farmacia.Cliente;
import ENT.Farmacia.Provincia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CarlosC
 */
public class ManejadorCliente {
    
    public void ObtenerProvincias(ArrayList<Provincia> listProvincias) throws SQLException{
        
        DATClientes objClientes = new DATClientes();
        ResultSet rs = objClientes.ObtenerProvincias();
        
        while (rs.next()){
            
            Provincia objProv = new Provincia(rs.getInt(1),rs.getString(2));
            listProvincias.add(objProv);
            
        }
        
        ResultSet rsC = objClientes.ObtenerCantones();
        ArrayList<Canton> listCantones = new ArrayList<Canton>();
        while (rsC.next()){
            
           // Canton objCant = new Canton(rsC.getInt(1),rsC.getInt(2),rsC.getString(3)),listCantones.add(objCant);
        }
        
        for (Provincia p : listProvincias ){
            
            ArrayList<Canton> listCantonAUX = new ArrayList<>();
            for (Canton c : listCantones)
                if (p.getIdProvincia() == c.getIdProvincia())
                    listCantonAUX.add(c);
                 p.setCantones(listCantones);
            
        }
        
    }
    
    public void ObtenerClientes(ArrayList<Cliente> listClientes){
        
        DATClientes objClientes = new DATClientes();
        ResultSet rSet = objClientes.ObtenerClientes();
        while (rSet.next()){
            
       //     Canton objCanton = new Canton(r.Set.getInt(IdCanton),rSet.getInt("IdProvincia"), rSet.getString ("canton"));
            Provincia objProvincia = new Provincia(rSet.getInt("IdProvincia"),rSet.getString("Provincia"));
            Direccion objDireccion = new Direccion(objProvincia, objCanton,rSet.getString("Calle"),rSet.getString("Numero"));
            Cliente obCli = new Cliente (rSet.getInt("IdCliente"),rset.getString("Cedula"),rSet.getString("Apellido",rSet))
        }
        
        
        
        
        
    }
    
}
