/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul Hernandez
 */
public class Menu {

    static Empleado empleado = new Empleado();
    static Comprador comprador = new Comprador();
    static Enlatados enlatados = new Enlatados();
    static Carnes carnes = new Carnes();
    static Proveedores proveedor = new Proveedores();

    public void mostrarMenuPrincipal() {

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
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, favor "
                            + "revisar!");
                    mostrarMenuPrincipal();
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
                    empleado.agregar();
                    mostrarMenuPrincipal();

                    break;
                }
                case 2: {
                    comprador.agregar();
                    mostrarMenuPrincipal();
                }

                case 3: {
                    proveedor.agregar();
                    mostrarMenuPrincipal();
                    break;
                }
                case 4: {
                    carnes.agregar();
                    mostrarMenuPrincipal();
                    break;
                }
                case 5: {
                    enlatados.agregar();
                    mostrarMenuPrincipal();
                    break;
                }
                case 6: {
                    mostrarMenuPrincipal();
                    break;
                }

                case 7: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, favor "
                            + "revisar!");
                    mostrarMenuPrincipal();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }

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
                    empleado.consultar();
                    mostrarMenuPrincipal();

                    break;
                }
                case 2: {
                    comprador.consultar();
                    mostrarMenuPrincipal();
                }

                case 3: {
                    proveedor.consultar();
                    mostrarMenuPrincipal();
                    break;
                }
                case 4: {
                    carnes.consultar();
                    mostrarMenuPrincipal();
                    break;
                }
                case 5: {
                    enlatados.consultar();
                    mostrarMenuPrincipal();
                    break;
                }
                case 6: {
                    mostrarMenuPrincipal();
                    break;
                }

                case 7: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, favor "
                            + "revisar!");
                    mostrarMenuPrincipal();
                }

            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }

    }

}
