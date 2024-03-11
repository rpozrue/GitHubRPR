package utils;

import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author rpozo
 * @version 1
 */
public class HabitacionesUtils {

    /**
     * función que recorre el array habitaciones y muestra su contenido. Si está
     * vacío, muestra el mensaje "No hay habitaciones para mostrar...".
     */
    public static void mostrarHabitaciones(ArrayList<Habitacion> habitaciones) {

        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para mostrar...");
        } else {
            for (Habitacion habitacionAMostrar : habitaciones) {
                System.out.println("ID: " + habitacionAMostrar.getIdHabitacion());
                System.out.println("Tipo: " + habitacionAMostrar.getTipo());
                System.out.println("Número de camas: " + habitacionAMostrar.getNumeroCamas());
                System.out.println("Coste por día: " + habitacionAMostrar.getCostePorDia());
                System.out.println("");
            }
        }
    }

    /**
     * Función que lee por pantalla los datos de una nueva habitación y crea una
     * nueva instancia de la clase Habitación.
     *
     * @return devuelve la nueva instancia creada de Habitación.
     */
    public static Habitacion agregarHabitacion() {

        Scanner sca = new Scanner(System.in);

        System.out.println("Introduzca el id de la nueva habitación: ");
        int idHabitacion = sca.nextInt();
        Habitacion nuevaHabitacion = new Habitacion(idHabitacion);
        sca.nextLine();
        System.out.println("Introduzca el tipo de la nueva habitación: ");
        nuevaHabitacion.setTipo(sca.nextLine());
        System.out.println("Introduzca el número de camas de la nueva habitación: ");
        nuevaHabitacion.setNumeroCamas(sca.nextInt());
        System.out.println("Introduzca el coste por día de la nueva habitación: ");
        nuevaHabitacion.setCostePorDia(sca.nextDouble());

        return nuevaHabitacion;
    }

    /**
     * Este método permite eliminar una habitación de la lista de habitaciones
     * proporcionada. Se solicita al usuario que ingrese el ID de la habitación
     * que se desea eliminar. Si la lista está vacía, se muestra un mensaje
     * indicando que no hay habitaciones para eliminar. Si se encuentra una
     * habitación con el ID proporcionado, se elimina de la lista y se termina
     * la búsqueda.
     *
     * @param habitaciones La lista de habitaciones de la cual se desea eliminar
     * una.
     */
    public static void eliminarHabitacion(ArrayList<Habitacion> habitaciones) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Introduzca el id de la habitación a eliminar: ");
        int idHabitacion = sca.nextInt();

        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para borrar...");
        } else {
            for (Habitacion habitacionABorrar : habitaciones) {
                if (habitacionABorrar.getIdHabitacion() == idHabitacion) {
                    habitaciones.remove(habitacionABorrar);
                    break;
                }
            }
        }
    }
}
