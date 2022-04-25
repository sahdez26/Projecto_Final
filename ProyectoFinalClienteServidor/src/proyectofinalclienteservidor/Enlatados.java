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
public class Enlatados extends Comida {

    protected String tipoEnlatado;
    protected int cantidadEnlatado;

    public Enlatados(String comidaID, int precio, String nombre, String cantidadDisponible, String tipoEnlatado, int cantidadEnlatado) {
        super(comidaID, precio, nombre, cantidadDisponible);
        this.tipoEnlatado = tipoEnlatado;
        this.cantidadEnlatado = cantidadEnlatado;
    }

    public Enlatados() {
    }

    @Override
    public void agregar() {
        JOptionPane.showMessageDialog(null, "Esto es agregar enlatado"
                + "revisar!");
    }

    @Override
    public void consultar() {
        JOptionPane.showMessageDialog(null, "Esto es consultar enlatado"
                + "revisar!");
    }

    
    
    
    public String getTipoEnlatado() {
        return tipoEnlatado;
    }

    public void setTipoEnlatado(String tipoEnlatado) {
        this.tipoEnlatado = tipoEnlatado;
    }

    public int getCantidadEnlatado() {
        return cantidadEnlatado;
    }

    public void setCantidadEnlatado(int cantidadEnlatado) {
        this.cantidadEnlatado = cantidadEnlatado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(String cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

}
