package proyectofinalclienteservidor;

import javax.swing.JOptionPane;

public class Persona {

    private String id;
    private String nombre;
    private String apellidos;
    private String eCivil;

    public Persona(String id, String nombre, String apellidos, String eCivil) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.eCivil = eCivil;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String geteCivil() {
        return eCivil;
    }

    public void seteCivil(String eCivil) {
        this.eCivil = eCivil;
    }

    public void CambioECivil(String newCivil) {

        this.eCivil = newCivil;
         JOptionPane.showMessageDialog(
                        null,
                        "El nuevo estado civil de esta persona es: " + this.eCivil,
                        "Tarea",
                        -1);
        
    
    }

}
