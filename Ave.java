/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_POO;

/**
 *
 * @author ISTLOJJA
 */
public class Ave  extends Animal{
    private int numerodehuevos;
    public boolean vuela;

    public Ave() {
    }

    public Ave(int numerodehuevos, boolean vuela, String nombre, String Edad, double edad, double peso, String color, double Altura) {
        super(nombre, Edad, edad, peso, color, Altura);
        this.numerodehuevos = numerodehuevos;
        this.vuela = vuela;
    }
    

    public int getNumerodehuevos() {
        return numerodehuevos;
    }

    public void setNumerodehuevos(int numerodehuevos) {
        this.numerodehuevos = numerodehuevos;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
        
    }

