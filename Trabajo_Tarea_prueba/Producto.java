/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_Tarea_prueba;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    private String nombre;
    private double precio;
 
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
 
    
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public double getPrecio() {
        return precio;
    }
 
    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
    @Override
    public String toString() {
        return "nombre=" + nombre + ", precio=" + precio +", ";
    }
     
    /**
     * Indica el precio total segun una cantidad
     * @param cantidad
     * @return 
     */
    public double calcular(int cantidad){
        return precio*cantidad;
    }
     
     
}

