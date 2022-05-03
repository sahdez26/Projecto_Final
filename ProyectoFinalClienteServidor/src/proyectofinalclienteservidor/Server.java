/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalclienteservidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeria
 */
public class Server {

    private final int PUERTO = 1234;

    private ServerSocket ss;
    private ObjectOutputStream conexionSalidaCliente;
    private ObjectInputStream conexionEntradaCliente;
    private Socket cs;

    protected Comando comandoActual;

    protected Comprador comprador = new Comprador();
    protected Empleado empleado = new Empleado();
    protected Enlatados enlatados = new Enlatados();
    protected Carnes carnes = new Carnes();
    protected Proveedores proveedores = new Proveedores();

    public Server() {
        try {
            this.ss = new ServerSocket(PUERTO);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iniciarServer() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("Esperando...");

            cs = ss.accept();

            System.out.println("Cliente en línea");

            conexionSalidaCliente = new ObjectOutputStream(cs.getOutputStream());
            conexionEntradaCliente = new ObjectInputStream(cs.getInputStream());

           ServerHilo nuevoCliente = new ServerHilo(conexionSalidaCliente, conexionEntradaCliente, ss);
           Thread hilo = new Thread(nuevoCliente);
           hilo.start();
            
            

        }
    }
}
