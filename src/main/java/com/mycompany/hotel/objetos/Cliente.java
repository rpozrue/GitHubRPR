package com.mycompany.hotel.objetos;

/**
 * @author rpozo
 * @version 2
 */
/**
 * La clase Cliente representa la información de un cliente: ID, nombre,
 * apellidos, DNI y número de teléfono.
 */
public class Cliente {

    // Atributos de la clase Cliente
    private int idCliente;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

    /**
     * Constructor de la clase Cliente. Pide obligatoriamente el ID del cliente.
     * @param idCliente El ID del cliente.
     */
    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    //Getters & setters
    /**
     * Obtiene el ID del cliente.
     * @return El ID del cliente.
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos del cliente.
     * @return Los apellidos del cliente.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del cliente.
     * @param apellidos Los apellidos del cliente.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene el DNI del cliente.
     * @return El DNI del cliente.
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Establece el DNI del cliente.
     * @param DNI El DNI del cliente.
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     * @return El número de teléfono del cliente.
     */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     * @param numeroTelefono El número de teléfono del cliente.
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

}
