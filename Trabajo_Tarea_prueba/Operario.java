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
public class Operario  extends Empleado{
    public Operario(String nombre) {
        super(nombre);
        System.out.println("Constructor de Operario");
    }

    
    public Operario() {
    }

   
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
   
}



