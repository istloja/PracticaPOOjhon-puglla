/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos_Serializados;

import java.io.Serializable;

/**
 *
 * @author ISTLOJJA
 */
public class Mascota  implements Serializable {
    private String nombre;
    private int edad;
    private int numerodepatas;

   

    public Mascota(String nombre, int edad, int numerodepatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.numerodepatas = numerodepatas;
        
    }

    public Mascota() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumerodepatas() {
        return numerodepatas;
    }

    public void setNumerodepatas(int numerodepatas) {
        this.numerodepatas = numerodepatas;
    }
    public static void main(String[] args) {
        
    }
    
    
}
