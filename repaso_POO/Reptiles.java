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
public class Reptiles  extends Animal{
    private boolean vertebrados;
    private String piel;
    private int tipodesangre;

    public Reptiles() {
    }

    public Reptiles(boolean vertebrados, String piel, int tipodesangre, String nombre, String Edad, double edad, double peso, String color, double Altura) {
        super(nombre, Edad, edad, peso, color, Altura);
        this.vertebrados = vertebrados;
        this.piel = piel;
        this.tipodesangre = tipodesangre;
    }
    

    public boolean isVertebrados() {
        return vertebrados;
    }

    public void setVertebrados(boolean vertebrados) {
        this.vertebrados = vertebrados;
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public int getTipodesangre() {
        return tipodesangre;
    }

    public void setTipodesangre(int tipodesangre) {
        this.tipodesangre = tipodesangre;
    }
    
    
    
}
