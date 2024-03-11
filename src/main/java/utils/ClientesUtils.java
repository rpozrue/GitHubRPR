package utils;

import com.mycompany.hotel.objetos.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rpozo
 * @version 1
 */
public class ClientesUtils {

    /**
     * función que recorre el array clientes y muestra su contenido. Si está
     * vacío, muestra el mensaje "No hay clientes para mostrar...".
     */
    public static void mostrarClientes(ArrayList<Cliente> clientes) {

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar...");
        } else {
            for (Cliente clienteAMostrar : clientes) {
                System.out.println("ID: " + clienteAMostrar.getIdCliente());
                System.out.println("Nombre: " + clienteAMostrar.getNombre());
                System.out.println("Apellidos: " + clienteAMostrar.getApellidos());
                System.out.println("DNI: " + clienteAMostrar.getDNI());
                System.out.println("Número de teléfono: " + clienteAMostrar.getNumeroTelefono());
                System.out.println("");
            }
        }
    }

    /**
     * Función que lee por pantalla los datos de un nuevo cliente y crea una
     * nueva instancia de la clase Cliente.
     *
     * @return nuevoCliente devuelve la nueva instancia creada de Cliente.
     */
    public static Cliente registrarCliente() {

        Scanner sca = new Scanner(System.in);

        System.out.println("Introduzca el id del nuevo cliente: ");
        int idCliente = sca.nextInt();
        Cliente nuevoCliente = new Cliente(idCliente);
        sca.nextLine();
        System.out.println("Introduzca el nombre del nuevo cliente: ");
        nuevoCliente.setNombre(sca.nextLine());
        System.out.println("Introduzca los apellidos del nuevo cliente: ");
        nuevoCliente.setApellidos(sca.nextLine());
        System.out.println("Introduzca el DNI del nuevo cliente: ");
        nuevoCliente.setDNI(sca.nextLine());
        System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
        nuevoCliente.setNumeroTelefono(sca.nextInt());

        return nuevoCliente;
    }

    /**
     * Este método permite dar de baja a un cliente de la lista de clientes
     * proporcionada. Se solicita al usuario que ingrese el ID del cliente que
     * se desea dar de baja. Si la lista está vacía, se muestra un mensaje
     * indicando que no hay clientes para dar de baja. Si se encuentra un
     * cliente con el ID proporcionado, se elimina de la lista y se termina la
     * búsqueda.
     *
     * @param clientes La lista de clientes de la cual se desea dar de baja a
     * uno.
     */
    public static void darDeBajaCliente(ArrayList<Cliente> clientes) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca el id del cliente a dar de baja: ");
        int idCliente = sca.nextInt();

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para dar de baja...");
        } else {
            for (Cliente clienteABorrar : clientes) {
                if (clienteABorrar.getIdCliente() == idCliente) {
                    clientes.remove(clienteABorrar);
                    break;
                }
            }
        }
    }
}
