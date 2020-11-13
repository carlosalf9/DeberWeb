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
public class Canton {
    
    private int idCanton;
    private int idProvincia;
    private String Canton;

    public Canton(int idCanton, int idProvincia, String Canton) {
        this.idCanton = idCanton;
        this.idProvincia = idProvincia;
        this.Canton = Canton;
    }

    @Override
    public String toString() {
        return String.format("%s", Canton);
    }

    public int getIdProvincia() {
        return idProvincia;
    }
    
    
    
    
}
