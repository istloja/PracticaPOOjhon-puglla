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

    public class Comercial extends Empleados {
 
    //Atributos
    private double comision;
 
    //Constructores
    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }
 
    //Metodos
    public double getComision() {
        return comision;
    }
 
    public void setComision(double comision) {
        this.comision = comision;
    }
 
    
     
     
    @Override
    public String toString() {
        return super.toString() + " comision=" + comision;
    }
 
    
    @Override
    public boolean plus() {
 
        if (super.getEdad() > 30 && this.comision > 200) {
            
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Se le añadido el plus, al empleado " + super.getNombre());
            return true;
        }
 
        return false;
 
    }
 
}
    

