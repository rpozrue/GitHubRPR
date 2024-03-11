package utils;

import com.mycompany.hotel.objetos.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientesUtils {

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
