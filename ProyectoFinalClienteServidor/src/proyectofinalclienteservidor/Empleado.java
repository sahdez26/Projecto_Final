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
public class Empleado extends Persona {

    protected String annoIngreso;
    protected String idEmpleado;

    public Empleado(String cedula, String nombre, String apellido1, String apellido2, String annoIngreso, String idEmpleado) {
        super(cedula, nombre, apellido1, apellido2);
        this.annoIngreso = annoIngreso;
        this.idEmpleado = idEmpleado;
    }

    public Empleado() {
    }

    @Override
    public void agregar() {
        JOptionPane.showMessageDialog(null, "Esto es agregar empleado"
                + "revisar!");
    }

    @Override
    public void consultar() {
        JOptionPane.showMessageDialog(null, "Esto es consultar empleado"
                + "revisar!");
    }

    public String getAnnoIngreso() {
        return annoIngreso;
    }

    public void setAnnoIngreso(String annoIngreso) {
        this.annoIngreso = annoIngreso;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
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
