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
public class Ejecucion_Empleados {

    public static void main(String[] args) {

        Comercial c1 = new Comercial(300, "DDR", 37, 1000);
        Repartidor r1 = new Repartidor("zona 3", "Fer", 26, 900);

        c1.plus();
        r1.plus();

        System.out.println(c1);
        System.out.println(r1);
    }

}
