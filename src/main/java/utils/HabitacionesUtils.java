package utils;

import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

public class HabitacionesUtils {

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
