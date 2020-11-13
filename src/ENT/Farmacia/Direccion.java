/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENT.Farmacia;

/**
 *
 * @author CarlosC
 */
public class Direccion {
    
    private int idDireccion;
    private String calle;
    private String numero;

    public Direccion(int idDireccion, String calle, String numero) {
        this.idDireccion = idDireccion;
        this.calle = calle;
        this.numero = numero;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Direccion{" + "idDireccion=" + idDireccion + ", calle=" + calle + ", numero=" + numero + '}';
    }
    
    
    
    
}
