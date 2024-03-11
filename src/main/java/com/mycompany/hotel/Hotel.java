package com.mycompany.hotel;

import com.mycompany.hotel.objetos.Cliente;
import com.mycompany.hotel.objetos.Empleado;
import com.mycompany.hotel.objetos.Habitacion;
import static utils.ClientesUtils.darDeBajaCliente;
import static utils.ClientesUtils.mostrarClientes;
import static utils.ClientesUtils.registrarCliente;
import static utils.EmpleadosUtils.darDeBajaEmpleado;
import static utils.EmpleadosUtils.mostrarEmpleados;
import static utils.EmpleadosUtils.registrarEmpleado;
import static utils.HabitacionesUtils.agregarHabitacion;
import static utils.HabitacionesUtils.eliminarHabitacion;
import static utils.HabitacionesUtils.mostrarHabitaciones;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rpozo
 * @version 2
 */
/**
 * La clase Hotel es la clase principal que contiene el método main para
 * ejecutar el programa de gestión del hotel.
 */
public class Hotel {

    /**
     * Método main para ejecutar el programa de gestión del hotel.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en
     * este programa).
     */
    public static void main(String[] args) {
        // ArrayList para almacenar clientes, empleados y habitaciones
        Scanner sca = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

        int opcion = 10;
        /**
         * Menú principal del programa. Cada case del switch contenido en el
         * menú controlado por un do-while llama a un método que ejecutará la
         * acción requerida por el usuario, introducida por pantalla.
         */
        do {

            opcion = menu();

            switch (opcion) {
                case 1:
                    clientes.add(registrarCliente());

                    break;
                case 2:
                    darDeBajaCliente(clientes);

                    break;
                case 3:
                    empleados.add(registrarEmpleado());

                    break;
                case 4:
                    darDeBajaEmpleado(empleados);

                    break;
                case 5:
                    habitaciones.add(agregarHabitacion());

                    break;
                case 6:
                    eliminarHabitacion(habitaciones);

                    break;
                case 7:
                    mostrarClientes(clientes);

                    break;
                case 8:
                    mostrarEmpleados(empleados);

                    break;
                case 9:
                    mostrarHabitaciones(habitaciones);

                    break;
                case 10:
                    System.out.println("Cerrando el programa...");

                    break;
                default:
                    System.out.println("La opción seleccionada no existe...");
            }
        } while (opcion != 10);
    }

    /**
     * Método para mostrar el menú y obtener la opción del usuario.
     * @return La opción seleccionada por el usuario.
     */
    private static int menu() {
        Scanner sca = new Scanner(System.in);

        imprimirMenu();

        return sca.nextInt();
    }

    /**
     * Método que imprime el texto del menú por pantalla.
     */
    private static void imprimirMenu() {
        System.out.println("1. Registrar cliente.");
        System.out.println("2. Dar de baja a un cliente.");
        System.out.println("3. Registrar empleado.");
        System.out.println("4. Dar de baja a un empleado.");
        System.out.println("5. Agregar nueva habitación.");
        System.out.println("6. Eliminar una habitación.");
        System.out.println("7. Mostrar todos los clientes.");
        System.out.println("8. Mostrar todos los empleados.");
        System.out.println("9. Mostrar todas las habitaciones.");
        System.out.println("10. Salir del programa.");
        System.out.println("Introduce el número de la opcion deseada: ");
    }

}
