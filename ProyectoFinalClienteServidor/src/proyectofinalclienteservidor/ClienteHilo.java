/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul Hernandez
 */
public class ClienteHilo implements Runnable {

    private ObjectOutputStream conexionSalidaServer;
    private ObjectInputStream conexionEntradaServer;
    private Socket socket;

    public ClienteHilo(ObjectOutputStream conexionSalidaServer, ObjectInputStream conexionEntradaServer, Socket socket) {
        this.conexionSalidaServer = conexionSalidaServer;
        this.conexionEntradaServer = conexionEntradaServer;
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            byte opc = Byte.parseByte(JOptionPane.showInputDialog(null,
                    "Seleccione lo que desea hacer\n\n"
                    + "1. Agregar\n"
                    + "2. Consultar\n"
                    + "3. Exit Program\n\n"
                    + "Digite su opcion:"));

            switch (opc) {
                case 1: {
                    menuAgregar();
                    break;
                }
                case 2: {
                    menuConsultar();
                    break;
                }

                case 3: {
                    conexionSalidaServer.writeObject(null);
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, favor "
                            + "revisar!");
                    run();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }

    }

    public void menuAgregar() {
        try {
            byte opc2 = Byte.parseByte(JOptionPane.showInputDialog(null,
                    "Seleccione lo que desea hacer\n\n"
                    + "1. Agregar un nuevo empleado\n"
                    + "2. Agregar un nuevo cliente\n"
                    + "3. Agregar un nuevo proveedor\n"
                    + "4. Agregar un nuevo producto 'carnes'\n"
                    + "5. Agregar un nuevo producto 'enlatados'\n"
                    + "6. Volver al menu anterior\n\n"
                    + "Digite su opcion:"));

            switch (opc2) {
                case 1: {

                    conexionSalidaServer.writeObject(new Comando("Empleado", 1));
                    esperarResultado();
                    run();

                    break;
                }
                case 2: {

                    conexionSalidaServer.writeObject(new Comando("Comprador", 1));
                    esperarResultado();
                    run();
                }

                case 3: {

                    conexionSalidaServer.writeObject(new Comando("Proveedores", 1));
                    esperarResultado();
                    run();
                    break;
                }
                case 4: {

                    conexionSalidaServer.writeObject(new Comando("Carnes", 1));
                    esperarResultado();
                    run();
                    break;
                }
                case 5: {

                    conexionSalidaServer.writeObject(new Comando("Enlatados", 1));
                    esperarResultado();
                    run();
                    break;
                }
                case 6: {
                    run();
                    break;
                }

                case 7: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, favor "
                            + "revisar!");
                    run();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }

    }

    public boolean esperarResultado() {
        Object objeto;
        try {
            while (!(objeto = conexionEntradaServer.readObject()).getClass().toString().equals("class proyectofinalclienteservidor.Comando")) {

            }
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("exiting while");
        return true;
    }

    public void menuConsultar() {
        try {
            byte opc3 = Byte.parseByte(JOptionPane.showInputDialog(null,
                    "Seleccione lo que desea hacer\n\n"
                    + "1. Consultar por un empleado\n"
                    + "2. Consultar por un Cliente\n"
                    + "3. Consultar por un proveedor\n"
                    + "4. Consultar por un producto 'carnes'\n"
                    + "5. Consultar por un producto 'enlatados'\n"
                    + "6. Volver al menu anterior\n\n"
                    + "Digite su opcion:"));

            switch (opc3) {
                case 1: {

                    conexionSalidaServer.writeObject(new Comando("Empleado", 2));
                    esperarResultado();
                    run();

                    break;
                }
                case 2: {

                    conexionSalidaServer.writeObject(new Comando("Comprador", 2));
                    esperarResultado();
                    run();
                }

                case 3: {

                    conexionSalidaServer.writeObject(new Comando("Proveedores", 2));
                    esperarResultado();
                    run();
                    break;
                }
                case 4: {

                    conexionSalidaServer.writeObject(new Comando("Carnes", 2));
                    esperarResultado();
                    run();
                    break;
                }
                case 5: {

                    conexionSalidaServer.writeObject(new Comando("Enlatados", 2));
                    esperarResultado();
                    run();
                    break;
                }
                case 6: {
                    run();
                    break;
                }

                case 7: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, favor "
                            + "revisar!");
                    run();
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }

    }

}
