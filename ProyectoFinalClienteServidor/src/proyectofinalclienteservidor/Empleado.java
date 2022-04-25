package proyectofinalclienteservidor;

import javax.swing.JOptionPane;

public class Empleado extends Persona {

    private String annoIngreso;
    private String idDespacho;

    public Empleado(String annoIngreso, String idDespacho, String id, String nombre, String apellidos, String eCivil) {
        super(id, nombre, apellidos, eCivil);
        this.annoIngreso = annoIngreso;
        this.idDespacho = idDespacho;
    }

    public String getAnnoIngreso() {
        return annoIngreso;
    }

    public String getIdDespacho() {
        return idDespacho;
    }

    public void setIdDespacho(String idDespacho) {
        this.idDespacho = idDespacho;
    }

    public void CambioDespacho(String idDespacho) {

        this.idDespacho = idDespacho;
        JOptionPane.showMessageDialog(
                null,
                "El nuevo despacho del empleado es: " + this.idDespacho,
                "Tarea",
                -1);
    }
}