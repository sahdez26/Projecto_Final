/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul Hernandez
 */
public class ServerHilo extends Server implements Runnable {
    private ObjectOutputStream conexionSalidaCliente;
    private ObjectInputStream conexionEntradaCliente;
    private ServerSocket ss;

    public ServerHilo(ObjectOutputStream conexionSalidaCliente, ObjectInputStream conexionEntradaCliente, ServerSocket ss) {
        this.conexionSalidaCliente = conexionSalidaCliente;
        this.conexionEntradaCliente = conexionEntradaCliente;
        this.ss = ss;
    }

    
    @Override
    public void run(){
        Object objeto;
        try {
                while ((objeto = conexionEntradaCliente.readObject()) != null) {

                    comandoActual = (Comando) objeto;

                    switch (comandoActual.getClase()) {
                        case "Comprador":

                            switch (comandoActual.getOpcion()) {
                                case 1:

                                    comprador.agregar();
                                    conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                                    break;
                                case 2:
                                    comprador.consultar();
                                    conexionSalidaCliente.writeObject(new Comando("Confirmacion", 2));
                                    break;

                            }
                            break;

                        case "Empleado":

                            switch (comandoActual.getOpcion()) {
                                case 1:

                                    empleado.agregar();
                                    conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                                    break;
                                case 2:
                                    empleado.consultar();
                                    conexionSalidaCliente.writeObject(new Comando("Confirmacion", 2));
                                    break;

                            }
                            break;

                        case "Proveedores":

                            switch (comandoActual.getOpcion()) {
                                case 1:
                                    proveedores.agregar();
                                    conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                                    break;
                                case 2:
                                    proveedores.consultar();
                                    conexionSalidaCliente.writeObject(new Comando("Confirmacion", 2));
                                    break;
                            }
                            break;

                        case "Carnes":

                            switch (comandoActual.getOpcion()) {
                                case 1:
                                    carnes.agregar();
                                    conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                                    break;
                                case 2:
                                    carnes.consultar();
                                    conexionSalidaCliente.writeObject(new Comando("Confirmacion", 2));
                                    break;
                            }
                            break;

                        case "Enlatados":

                            switch (comandoActual.getOpcion()) {
                                case 1:
                                    enlatados.agregar();
                                    conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                                    break;
                                case 2:
                                    enlatados.consultar();
                                    conexionSalidaCliente.writeObject(new Comando("Confirmacion", 2));
                                    break;
                            }
                            break;

                        default:

                            break;
                    }
                    System.out.println("Solicitud completa");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
                System.out.println(e);
            }
        
    }
    
}
