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
public class Mamífero  extends Animal{
    private int tiempodegesation;
    public boolean pelaje;

    public Mamífero() {
    }

    public Mamífero(int tiempodegesation, String nombre, String Edad, double edad, double peso, String color, double Altura) {
        super(nombre, Edad, edad, peso, color, Altura);
        this.tiempodegesation = tiempodegesation;
    }
    
}
