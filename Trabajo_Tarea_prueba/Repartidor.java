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

    public class Repartidor extends Empleados {
 
    
    private String zona;
 
   
    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }
 
    
    public String getZona() {
        return zona;
    }
 
    public void setZona(String zona) {
        this.zona = zona;
    }
 
    @Override
    public String toString() {
        return super.toString() + " zona=" + zona;
    }
 
   
    @Override
    public boolean plus() {
 
        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {
            
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Se le añadido el plus, al empleado "+super.getNombre());
            return true;
        }
 
        return false;
    }
 
}

