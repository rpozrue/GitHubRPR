package utils;

import com.mycompany.hotel.objetos.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadosUtils {

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
