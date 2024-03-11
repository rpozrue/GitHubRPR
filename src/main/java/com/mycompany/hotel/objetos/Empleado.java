package com.mycompany.hotel.objetos;

/**
 * @author rpozo
 * @version 2
 */
/**
 * La clase Empleado representa su información: ID, nombre, apellidos, DNI y
 * número de teléfono.
 */
public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

    /**
     * Constructor de la clase Empleado. Pide obligatoriamente el ID del
     * empleado.
     * @param idEmpleado El ID del empleado.
     */
    public Empleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    //Getters & setters
    /**
     * Obtiene el ID del empleado.
     * @return El ID del empleado.
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * @param nombre El nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos del empleado.
     * @return Los apellidos del empleado.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del empleado.
     * @param apellidos Los apellidos del empleado.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene el DNI del empleado.
     * @return El DNI del empleado.
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Establece el DNI del empleado.
     * @param DNI El DNI del empleado.
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Obtiene el número de teléfono del empleado.     
     * @return El número de teléfono del empleado.
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Establece el número de teléfono del empleado.     
     * @param numeroTelefono El número de teléfono del empleado.
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

}
