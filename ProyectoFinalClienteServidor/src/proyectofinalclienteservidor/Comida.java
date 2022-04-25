/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

/**
 *
 * @author Saul Hernandez
 */
public abstract class Comida {

    protected String comidaID;
    protected int precio;
    protected String nombre;
    protected String cantidadDisponible;

    public Comida(String comidaID, int precio, String nombre, String cantidadDisponible) {
        this.comidaID = comidaID;
        this.precio = precio;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
    }


    public Comida() {
    }

    public void agregar(){}
    public void consultar(){}
    
    
}
