/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author Paqui Elena
 */
public class Vivienda {

    /**
     * @return the precio
     * Devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     * Establece el precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the numHabitaciones
     * Devuelve el numero de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     * Establece numero de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the superficie
     * Devuelve la superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     * Establece la superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the parking
     * Devuelve parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking the parking to set
     * Establece parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return the estado
     * Devuelve estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     * Establece estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the propietario
     * Devuelve propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     * Establece propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    public Vivienda(double pre, int numha, double superf, boolean park, String est, String prop) {
        precio = pre;
        /**
     Atributo tipo double referente al precio
     */
        numHabitaciones = numha;  
        /**
     Atributo tipo entero referente al numero de habitaciones
     */
        superficie = superf;
        /**
     Atributo tipo double referente a la superficie
     */
        parking = park;
        /**
     Atributo referente al parking
     */
        estado = est;
        /**
     Atributo tipo string referente al estado
     */
        propietario = prop;
        /**
     Atributo tipo string referente al propietario
     */
        }
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - descuento);
    }

    
}
