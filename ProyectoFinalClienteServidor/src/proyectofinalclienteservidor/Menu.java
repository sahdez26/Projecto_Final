/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul Hernandez
 */
public class Menu extends Thread {

    static Empleado empleado = new Empleado();
    static Comprador comprador = new Comprador();
    static Enlatados enlatados = new Enlatados();
    static Carnes carnes = new Carnes();
    static Proveedores proveedor = new Proveedores();

     private Socket socket;
     private ObjectOutputStream conexionSalidaServer;
     private ObjectInputStream conexionEntradaServer;

    public Menu() {
        try {
            socket = new Socket("localhost", 1234);
            System.out.println(
                    "Conectado!!");

            conexionSalidaServer = new ObjectOutputStream(socket.getOutputStream());
            conexionEntradaServer = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void run() {
        ClienteHilo nuevoCliente = new ClienteHilo(conexionSalidaServer, conexionEntradaServer, socket);
        Thread hilo = new Thread(nuevoCliente);
        hilo.start();
       
    }

}
