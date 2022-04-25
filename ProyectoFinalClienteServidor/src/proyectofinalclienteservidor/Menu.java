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

    /*public void mostrarMenu() {
        Sedan sedan = new Sedan();
        SUV suv = new SUV();
        CuatroxCuatro cuatro = new CuatroxCuatro();

        try {
            byte opc = Byte.parseByte(JOptionPane.showInputDialog(null,
                    "Seleccione lo que desea hacer\n"
                    + "1. Agregar un nuevo Sedan\n"
                    + "2. Agregar un nuevo SUV\n"
                    + "3. Agregar un nuevo 4x4\n"
                    + "4. Consultar un vehiculo (SEDAN)\n"
                    + "5. Consultar un vehiculo (SUV)\n"
                    + "6. Consultar un vehiculo (4x4)\n"
                    + "7. Exit Program\n\n"
                    + "Digite su opcion:"));

            switch (opc) {
                case 1: {
                    sedan.agregarVehiculo();
                    mostrarMenu();

                    break;
                }
                case 2: {
                    suv.agregarVehiculo();
                    mostrarMenu();
                    break;
                }

                case 3: {
                    cuatro.agregarVehiculo();
                    mostrarMenu();
                    break;
                }
                case 4: {
                    String placa = JOptionPane.showInputDialog(null,
                            "Digite el numero de placa del Vehiculo",
                            "Consultar", -1);
                    sedan.DefinirClaseDeVehiculoEres(placa);
                    mostrarMenu();
                    break;
                }
                case 5: {
                    String placa = JOptionPane.showInputDialog(null,
                            "Digite el numero de placa del Vehiculo",
                            "Consultar", -1);
                    suv.DefinirClaseDeVehiculoEres(placa);
                    mostrarMenu();
                    break;
                }
                case 6: {
                    String placa = JOptionPane.showInputDialog(null,
                            "Digite el numero de placa del Vehiculo",
                            "Consultar", -1);
                    cuatro.DefinirClaseDeVehiculoEres(placa);
                    mostrarMenu();
                    break;
                }

                case 7: {
                    System.exit(0);
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, favor "
                            + "revisar!");
                    mostrarMenu();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }
    }
*/
}
