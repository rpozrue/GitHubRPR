package com.mycompany.hotel.objetos;

/**
 * @author rpozo
 * @version 2
 */
public class Habitacion {

    //Atributos 
    private int idHabitacion;
    private String tipo;
    private int numeroCamas;
    private double costePorDia;

    /**
     * Constructor de Habitación, pide obligatorio el id
     * @param idHabitacion
     */
    public Habitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    //Getters & setters
    /**
     * Obtiene el ID de la habitación.
     * @return ID de la habitación.
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }
    /**
     * Obtiene el tipo de la habitación.
     * @return tipo de habitación.
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Establece el tipo de la habitación.
     * @param tipo tipo de habitación.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Obtiene el número de camas.
     * @return número de camas.
     */
    public int getNumeroCamas() {
        return numeroCamas;
    }
    /**
     * Establece el número de camas
     * @param numeroCamas tipo de camas.
     */
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
    /**
     * Obtiene el coste por día de la habitación.
     * @return coste por día.
     */
    public double getCostePorDia() {
        return costePorDia;
    }
    /**
     * Establece el coste por día de la habitación.
     * @param costePorDia valor del coste.
     */
    public void setCostePorDia(double costePorDia) {
        this.costePorDia = costePorDia;
    }

}
