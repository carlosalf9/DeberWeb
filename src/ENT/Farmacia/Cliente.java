/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENT.Farmacia;

import java.util.Date;

/**
 *
 * @author CarlosC
 */
public class Cliente {
    
    private int IdCliente;
    private String Identificacion;
    private String nombres;
    private String apellidos;
    private Date fechanacimiento;
    private String telefono;
    private String correo;

    public Cliente(int IdCliente, String cedula, String nombres, String apellidos, Date fechanacimiento, String telefono, String correo) {
        this.IdCliente = IdCliente;
        this.Identificacion = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public String getCedula() {
        return Identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", cedula=" + Identificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", fechanacimiento=" + fechanacimiento + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
    
}
