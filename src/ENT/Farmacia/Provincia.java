/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENT.Farmacia;

import java.util.ArrayList;

/**
 *
 * @author CarlosC
 */
public class Provincia {
    
    
    private int idProvincia;
    private String Provincia;
    private ArrayList <Canton> Cantones;

    public Provincia(int idProvincia, String Provincia) {
        this.idProvincia = idProvincia;
        this.Provincia = Provincia;
        this.Cantones = null;
    }

    public ArrayList<Canton> getCantones() {
        return Cantones;
    }

    public void setCantones(ArrayList<Canton> Cantones) {
        this.Cantones = Cantones;
    }
    
    
    

    @Override
    public String toString() {
        return String.format("%s", Provincia);
    }

    public int getIdProvincia() {
        return idProvincia;
    }
    
    
    
    
}
