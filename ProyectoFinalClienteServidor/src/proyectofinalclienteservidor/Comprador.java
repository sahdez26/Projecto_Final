/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import javax.swing.JOptionPane;

/**
 *
 * @author Saul Hernandez
 */
public class Comprador extends Persona {

    protected String clienteID;
    protected boolean compradorFrecuente;

    public Comprador(String cedula, String nombre, String apellido1, String apellido2, String clienteID, boolean compradorFrecuente) {
        super(cedula, nombre, apellido1, apellido2);
        this.clienteID = clienteID;
        this.compradorFrecuente = compradorFrecuente;
    }

    public Comprador() {
    }

    
    @Override
        public void agregar(){
        JOptionPane.showMessageDialog(null, "Esto es agregar comprador"
                            + "revisar!");
        
        }
    @Override
    public void consultar(){
            JOptionPane.showMessageDialog(null, "Esto es consultar cliente"
                            );}
    
    
    
    public String getClienteID() {
        return clienteID;
    }

    public void setClienteID(String clienteID) {
        this.clienteID = clienteID;
    }

    public boolean isCompradorFrecuente() {
        return compradorFrecuente;
    }

    public void setCompradorFrecuente(boolean compradorFrecuente) {
        this.compradorFrecuente = compradorFrecuente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

}
