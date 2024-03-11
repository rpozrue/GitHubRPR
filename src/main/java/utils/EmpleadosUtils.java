package utils;

import com.mycompany.hotel.objetos.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rpozo
 * @version 1
 */
public class EmpleadosUtils {

    /**
     * función que recorre el array empleados y muestra su contenido. Si está
     * vacío, muestra el mensaje "No hay empleados para mostrar...".
     */
    public static void mostrarEmpleados(ArrayList<Empleado> empleados) {

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para mostrar...");
        } else {
            for (Empleado empleado : empleados) {
                System.out.println("ID: " + empleado.getIdEmpleado());
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellidos: " + empleado.getApellidos());
                System.out.println("DNI: " + empleado.getDNI());
                System.out.println("Número de teléfono: " + empleado.getNumeroTelefono());
                System.out.println("");
            }
        }
    }

    /**
     * Función que lee por pantalla los datos de un nuevo empleado y crea una
     * nueva instancia de la clase Empleado.
     *
     * @return devuelve la nueva instancia creada de Empleado.
     */
    public static Empleado registrarEmpleado() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el id del nuevo empleado: ");
        int idEmpleado = scanner.nextInt();
        Empleado nuevoEmpleado = new Empleado(idEmpleado);
        scanner.nextLine();
        System.out.println("Introduzca el nombre del nuevo empleado: ");
        nuevoEmpleado.setNombre(scanner.nextLine());
        System.out.println("Introduzca los apellidos del nuevo empleado: ");
        nuevoEmpleado.setApellidos(scanner.nextLine());
        System.out.println("Introduzca el DNI del nuevo empleado: ");
        nuevoEmpleado.setDNI(scanner.nextLine());
        System.out.println("Introduzca el número de teléfono del nuevo empleado: ");
        nuevoEmpleado.setNumeroTelefono(scanner.nextInt());
        return nuevoEmpleado;
    }

    /**
     * Este método permite dar de baja a un empleado de la lista de empleados
     * proporcionada. Se solicita al usuario que ingrese el ID del empleado que
     * se desea dar de baja. Si la lista está vacía, se muestra un mensaje
     * indicando que no hay empleados para dar de baja. Si se encuentra un
     * empleado con el ID proporcionado, se elimina de la lista y se termina la
     * búsqueda.
     *
     * @param empleados La lista de empleados de la cual se desea dar de baja a
     * uno.
     */
    public static void darDeBajaEmpleado(ArrayList<Empleado> empleados) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el id del empleado a dar de baja: ");
        int idEmpleado = scanner.nextInt();
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para dar de baja...");
        } else {
            for (Empleado empleado : empleados) {
                if (empleado.getIdEmpleado() == idEmpleado) {
                    empleados.remove(empleado);
                    break;
                }
            }
        }
    }
}
