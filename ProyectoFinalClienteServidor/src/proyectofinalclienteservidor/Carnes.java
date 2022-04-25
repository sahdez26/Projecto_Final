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
public class Carnes extends Comida {

    protected String tipoCarne;
    protected int cantidadCarne;

    public Carnes(String tipoCarne, int cantidadCarne, String comidaID, int precio, String nombre, String cantidadDisponible) {
        super(comidaID, precio, nombre, cantidadDisponible);
        this.tipoCarne = tipoCarne;
        this.cantidadCarne = cantidadCarne;
    }

    public Carnes() {
    }

    @Override
    public void agregar() {
        JOptionPane.showMessageDialog(null, "Esto es agregar carne"
                + "revisar!");
    }

    @Override
    public void consultar() {
        JOptionPane.showMessageDialog(null, "Esto es consultar carne"
                + "revisar!");
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public int getCantidadCarne() {
        return cantidadCarne;
    }

    public void setCantidadCarne(int cantidadCarne) {
        this.cantidadCarne = cantidadCarne;
    }

    public String getComidaID() {
        return comidaID;
    }

    public void setComidaID(String comidaID) {
        this.comidaID = comidaID;
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
