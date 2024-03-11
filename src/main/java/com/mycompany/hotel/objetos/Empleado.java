package com.mycompany.hotel.objetos;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private String DNI;
    private int numeroTelefono;

    public Empleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    
}
