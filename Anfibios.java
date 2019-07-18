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
public class Anfibios  extends Animal{
    private String tipodesangre;
    private double piel;
    private String vertebrados;

    public String getTipodesangre() {
        return tipodesangre;
        
    }

    public Anfibios() {
        
    }

    public Anfibios(String tipodesangre, double piel, String vertebrados, String nombre, String Edad, double edad, double peso, String color, double Altura) {
        super(nombre, Edad, edad, peso, color, Altura);
        this.tipodesangre = tipodesangre;
        this.piel = piel;
        this.vertebrados = vertebrados;
    }

    public void setTipodesangre(String tipodesangre) {
        this.tipodesangre = tipodesangre;
    }

    public double getPiel() {
        return piel;
    }

    public void setPiel(double piel) {
        this.piel = piel;
    }

    public String getVertebrados() {
        return vertebrados;
    }

    public void setVertebrados(String vertebrados) {
        this.vertebrados = vertebrados;
    }
            
    
}
