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
public class Ejecucion_de_una_serie_de_Productos {

    public static void main(String[] args) {

        Producto[] productos = new Producto[3];

        productos[0] = new Producto("producto 1", 10);
        productos[1] = new Perecedero(1, "producto 2", 20);
        productos[2] = new Noperecedero("tipo 1", "producto 3", 5);

        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            total += productos[i].calcular(5);
        }

        System.out.println("el total es " + total);

    }

}
