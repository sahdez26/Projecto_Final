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
public class Proveedores {

    protected String nombreProveedor;
    protected String tipoProducto;
    protected boolean transporte;

    public Proveedores(String nombreProveedor, String tipoProducto, boolean transporte) {
        this.nombreProveedor = nombreProveedor;
        this.tipoProducto = tipoProducto;
        this.transporte = transporte;
    }

    public Proveedores() {
    }

    public void agregar() {
        JOptionPane.showMessageDialog(null, "Esto es agregar prov"
                + "revisar!");
    }

    public void consultar() {
        JOptionPane.showMessageDialog(null, "Esto es consult prov"
                + "revisar!");
    }
    
    

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public boolean isTransporte() {
        return transporte;
    }

    public void setTransporte(boolean transporte) {
        this.transporte = transporte;
    }

}
